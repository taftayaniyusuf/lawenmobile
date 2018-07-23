package com.example.demo.controller;

import com.example.demo.model.Team;
import com.example.demo.service.TeamServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {
    @Autowired
    TeamServices teamServices;
    @RequestMapping(value = "/insertteam",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertteam(@RequestParam("nama_team") String nama_team){
        Team team = new Team();
        team.setNama_team(nama_team);
        teamServices.SaveOrUpdate(team);
        return true;
    }
    @RequestMapping(value = "/updateteam",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean updateteam(@RequestParam("id")long id,@RequestParam("nama_team") String nama_team){
        Team team = teamServices.getById(id);
        team.setId(id);
        team.setNama_team(nama_team);
        teamServices.SaveOrUpdate(team);
        return true;
    }
    @RequestMapping(value = "/deleteteam",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean deleteteam(@RequestParam("id")long id){
        Team team = teamServices.getById(id);
        teamServices.deleteTeam(team);
        return true;
    }
}
