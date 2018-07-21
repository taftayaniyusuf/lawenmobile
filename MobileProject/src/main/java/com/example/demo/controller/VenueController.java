package com.example.demo.controller;

import com.example.demo.model.Venue;
import com.example.demo.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class VenueController {
    @Autowired
    VenueService venueService;

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

}
