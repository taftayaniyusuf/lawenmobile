package com.example.demo.controller;

import com.example.demo.model.*;
import com.example.demo.service.*;
import org.hibernate.boot.jaxb.hbm.spi.Adapter2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class KaryawanController {
    @Autowired
    VenueService venueService;
    @Autowired
    JabatanService jabatanService;
    @Autowired
    TeamServices teamServices;
    @Autowired
    TipeKaryawanService tipeKaryawanService;
    @Autowired
    AkunBankService akunBankService;
    @Autowired
    RoleLoginService roleLoginService;
    //===================================================Venue======================================================
    @RequestMapping(value = "/insertvenue",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean insertVenue(@RequestParam("id")long id,@RequestParam("nama_venue") String nama_venue, @RequestParam("deskripsi_venue")String deskripsi_venue,
                               @RequestParam("alamat_venue")String alamat_venue,@RequestParam("latitude_venue")Float latitude_venue,
                               @RequestParam("longitude_venue")Float longitude_venue,@RequestParam("radius_venue")Float radius_venue){
        Venue venue= new Venue();
        venue.setId(id);
        venue.setNama_venue(nama_venue);
        venue.setDeskripsi_venue(deskripsi_venue);
        venue.setAlamat_venue(alamat_venue);
        venue.setLatitude_venue(latitude_venue);
        venue.setLongitude_venue(longitude_venue);
        venue.setRadius_venue(radius_venue);
        venueService.SaveOrUpdate(venue);
        return true;
    }
    @RequestMapping(value = "/updatevenue",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean updateVenue(@RequestParam("id")long id,@RequestParam("nama_venue") String nama_venue, @RequestParam("deskripsi_venue")String deskripsi_venue,
                               @RequestParam("alamat_venue")String alamat_venue,@RequestParam("latitude_venue")Float latitude_venue,
                               @RequestParam("longitude_venue")Float longitude_venue,@RequestParam("radius_venue")Float radius_venue){
        Venue venue= venueService.getById(id);
        venue.setId(id);
        venue.setNama_venue(nama_venue);
        venue.setDeskripsi_venue(deskripsi_venue);
        venue.setAlamat_venue(alamat_venue);
        venue.setLatitude_venue(latitude_venue);
        venue.setLongitude_venue(longitude_venue);
        venue.setRadius_venue(radius_venue);
        venueService.SaveOrUpdate(venue);
        return true;
    }
    @RequestMapping(value = "/deletevenue",method = RequestMethod.POST,headers="Accept=application/json")
    public boolean updateVenue(@RequestParam("id")long id){
        Venue venue= venueService.getById(id);
        venueService.deleteVenue(venue);
        return true;
    }
    //==================================================Jabatan===================================================
    @RequestMapping(value = "/insertjabatan",method = RequestMethod.POST,headers = "Accept=application/json")
    public  boolean insertJabatan(@RequestParam("id")long id,@RequestParam("nama_jabatan") String nama_jabatan){
        Jabatan jabatan = new Jabatan();
        jabatan.setId(id);
        jabatan.setNama_jabatan(nama_jabatan);
        jabatanService.SaveOrUpdate(jabatan);
        return true;
    }
    @RequestMapping(value = "/updatejabatan",method = RequestMethod.POST,headers = "Accept=application/json")
    public  boolean updateJabatan(@RequestParam("id")long id,@RequestParam("nama_jabatan") String nama_jabatan){
        Jabatan jabatan = jabatanService.getById(id);
        jabatan.setId(id);
        jabatan.setNama_jabatan(nama_jabatan);
        jabatanService.SaveOrUpdate(jabatan);
        return true;
    }
    @RequestMapping(value = "/deletejabatan",method = RequestMethod.POST,headers = "Accept=application/json")
    public  boolean deleteJabatan(@RequestParam("id")long id,@RequestParam("nama_jabatan") String nama_jabatan){
        Jabatan jabatan = jabatanService.getById(id);
        jabatanService.deleteJabatan(id);
        return true;
    }
    //=====================================================Team============================================
    @RequestMapping(value = "/insertteam",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertteam(@RequestParam("id")long id,@RequestParam("nama_team") String nama_team){
        Team team = new Team();
        team.setId(id);
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
    //===============================================tipekaryawan===========================================
    @RequestMapping(value = "/inserttipekaryawan",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertTipeKayawan(@RequestParam("id")long id,@RequestParam("nama_typekaryawan")String nama_typekaryawan){
        TipeKaryawan tipeKaryawan = new TipeKaryawan();
        tipeKaryawan.setId(id);
        tipeKaryawan.setNama_typekaryawan(nama_typekaryawan);
        tipeKaryawanService.SaveOrUpdate(tipeKaryawan);
        return true;
    }
    @RequestMapping(value = "/updatetipekaryawan",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean updateTipeKayawan(@RequestParam("id")long id,@RequestParam("nama_typekaryawan")String nama_typekaryawan){
        TipeKaryawan tipeKaryawan = tipeKaryawanService.getById(id);
        tipeKaryawan.setId(id);
        tipeKaryawan.setNama_typekaryawan(nama_typekaryawan);
        tipeKaryawanService.SaveOrUpdate(tipeKaryawan);
        return true;
    }
    @RequestMapping(value = "/deletetipekaryawan",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean deleteTipeKayawan(@RequestParam("id")long id,@RequestParam("nama_typekaryawan")String nama_typekaryawan){
        TipeKaryawan tipeKaryawan =tipeKaryawanService.getById(id);
        tipeKaryawanService.deleteTipeKaryawan(tipeKaryawan);
        return true;
    }
    //================================================AkunBank================================================
    @RequestMapping(value = "/insertakunbank",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertAkunBank(@RequestParam("id")long id,@RequestParam("nama_bank")String nama_bank){
        AkunBank akunBank =  new AkunBank();
        akunBank.setId(id);
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
    //===============================================RoleLogin======================================================
    @RequestMapping(value = "/insertrolelogin",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertRoleLogin(@RequestParam("id")long id,@RequestParam("nama_role")String nama_role){
        RoleLogin roleLogin =new RoleLogin();
        roleLogin.setId(id);
        roleLogin.setNama_role(nama_role);
        roleLoginService.SaveOrUpdate(roleLogin);
        return true;
    }
    @RequestMapping(value = "/updatetrolelogin",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean updateRoleLogin(@RequestParam("id")long id,@RequestParam("nama_role")String nama_role){
        RoleLogin roleLogin =roleLoginService.getById(id);
        roleLogin.setId(id);
        roleLogin.setNama_role(nama_role);
        roleLoginService.SaveOrUpdate(roleLogin);
        return true;
    }
    @RequestMapping(value = "/deleterolelogin",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean updateRoleLogin(@RequestParam("id")long id){
        RoleLogin roleLogin =roleLoginService.getById(id);
        roleLoginService.deleteRoleLogin(roleLogin);
        return true;
    }
    //=================================================MasterKaryawan==========================================
    @RequestMapping(value = "/insertkaryawan",method = RequestMethod.POST,headers = "Accept=application/json")
    public Boolean insertKaryawan(@ModelAttribute("DataLogin") DataLogin dl,@ModelAttribute("Karayawan")Karyawan k,
                                  @RequestParam("id")long id){

        return true;}
}
