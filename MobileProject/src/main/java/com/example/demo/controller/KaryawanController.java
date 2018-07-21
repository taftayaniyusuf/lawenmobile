package com.example.demo.controller;

import com.example.demo.model.Jabatan;
import com.example.demo.model.Team;
import com.example.demo.model.TipeKaryawan;
import com.example.demo.model.Venue;
import com.example.demo.service.JabatanService;
import com.example.demo.service.TeamServices;
import com.example.demo.service.TipeKaryawanService;
import com.example.demo.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
        venue.setId(id);
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
        jabatan.setId(id);
        jabatan.setNama_jabatan(nama_jabatan);
        jabatanService.deleteJabatan(id);
        return true;
    }
    //=====================================================Team============================================
    @RequestMapping(value = "/insertteam",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean insertteam(@RequestParam("id")long id,@RequestParam("nama_teamS") String nama_teamS){
        Team team = new Team();
        team.setId(id);
        team.setNama_teamS(nama_teamS);
        teamServices.SaveOrUpdate(team);
        return true;
    }
    @RequestMapping(value = "/updateteam",method = RequestMethod.POST,headers = "Accept=application/json")
    public boolean updateteam(@RequestParam("id")long id,@RequestParam("nama_teamS") String nama_teamS){
        Team team = teamServices.getById(id);
        team.setId(id);
        team.setNama_teamS(nama_teamS);
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
        tipeKaryawan.setId(id);
        tipeKaryawanService.deleteTipeKaryawan(tipeKaryawan);
        return true;
    }
    //================================================
}
