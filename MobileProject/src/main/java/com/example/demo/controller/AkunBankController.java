package com.example.demo.controller;

import com.example.demo.model.AkunBank;
import com.example.demo.service.AkunBankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AkunBankController {
    @Autowired
    AkunBankService akunBankService;
    @RequestMapping(value = "/insertakunbank",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertAkunBank(@RequestParam("nama_bank")String nama_bank){
        AkunBank akunBank =  new AkunBank();
        akunBank.setNama_bank(nama_bank);
        akunBankService.SaveOrUpdate(akunBank);
        return true;
    }
    @RequestMapping(value = "/updateakunbank",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean updateAkunBank(@RequestParam("id")long id,@RequestParam("nama_bank")String nama_bank){
        AkunBank akunBank =akunBankService.getById(id);
        akunBank.setId(id);
        akunBank.setNama_bank(nama_bank);
        akunBankService.SaveOrUpdate(akunBank);
        return true;
    }
    @RequestMapping(value = "/deleteakunbank",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean deleteAkunBank(@RequestParam("id")long id){
        AkunBank akunBank =akunBankService.getById(id);
        akunBankService.deleteAkunBank(akunBank);
        return true;
    }
    @RequestMapping(value = "/disableakunbank",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean disableakunbank(@RequestParam("id")long id){
        AkunBank akunBank =akunBankService.getById(id);
        akunBank.setStatus("Disable");
        akunBankService.SaveOrUpdate(akunBank);
        return true;
    }
    //================================================Get===============================================
    @RequestMapping(value = "/akunbankall",method = RequestMethod.POST)
    public List<AkunBank> masukList(){
        return akunBankService.getAllAkunBank();
    }

}
