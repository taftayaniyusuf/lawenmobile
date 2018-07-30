package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.TimeGroup;
import com.example.demo.service.TimeGroupService;

@RestController
public class TimeGroupController {
    @Autowired
    TimeGroupService timeGroupService;
    
   
    @RequestMapping(value = "/inserttimegroup",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean insertTimeGroup(@RequestParam("nama_timegroup") String nama_timegroup){
        TimeGroup timeGroup= new TimeGroup();
        timeGroup.setNama(nama_timegroup);
        
        timeGroupService.SaveOrUpdate(timeGroup);
        return true;
    }
    @RequestMapping(value = "/updatetimegroup",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean updateTimeGroup(@RequestParam("id")long id,@RequestParam("nama_timegroup") String nama_timegroup){
        TimeGroup timeGroup= timeGroupService.getById(id);
        timeGroup.setId(id);
        timeGroup.setNama(nama_timegroup);
        
        timeGroupService.SaveOrUpdate(timeGroup);
        return true;
    }
    @RequestMapping(value = "/deletetimegroup",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean updateTimeGroup(@RequestParam("id")long id){
        TimeGroup timeGroup= timeGroupService.getById(id);
        timeGroupService.deleteTimeGroup(timeGroup);
        return true;
    }
    @RequestMapping(value = "/disabletimeGroup",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean disableTimeGroup(@RequestParam("id")long id){
        TimeGroup timeGroup= timeGroupService.getById(id);
        timeGroup.setStatus("Disable");
        timeGroupService.SaveOrUpdate(timeGroup);
        return true;
    }
    
//=============================================GET=============================================
    
    @RequestMapping(value = "/timeGroupall",method = RequestMethod.GET,headers="Accept=application/json")
     public List<TimeGroup> timeGroupList(){
         return timeGroupService.getAllTimeGroup();
     }
   
   @RequestMapping(value = "/timeGroupbyid",method = RequestMethod.GET)
   public TimeGroup timeGroupbyid(@RequestParam("id")long id){
       return timeGroupService.getById(id);
   }
   
   @RequestMapping(value = "/timeGroupaktif",method = RequestMethod.GET)
   public List<TimeGroup> timeGroupbystatus(){
       return timeGroupService.getTimeGroupActive();
   }
}
