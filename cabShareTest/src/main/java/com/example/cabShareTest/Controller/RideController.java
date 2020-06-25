package com.example.cabShareTest.Controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.cabShareTest.bean.*;
import com.example.cabShareTest.service.*;



@RestController
@RequestMapping("/CabShare")
@CrossOrigin(origins = "http://localhost:8080")
@Validated
public class RideController {
@Autowired
RideService rideService;

@GetMapping("/Rides")	
    public List<Ride> getAllRides(long rideId)
     {
	 return rideService.getAllRides(rideId);                         
	 }


 @PostMapping("/AddRide")
 public ResponseEntity<Ride> loadRide( @RequestBody final Ride ride ) 
    {
	 System.out.println(ride);
	 rideService.loadRide(ride);
	 
    return new ResponseEntity<Ride>(ride, HttpStatus.OK);
    
    }
}
