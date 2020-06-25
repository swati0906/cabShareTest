package com.example.cabShareTest.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.cabShareTest.bean.*;
import com.example.cabShareTest.Repository.*;
@Component

public class RideService implements IRideService {
	@Autowired
	RideRepository  riderepository;

	  List<Ride> RideList = new ArrayList<Ride>();
	  public boolean loadRide(Ride ride) {
		  riderepository.save(ride);
		 return true;
	}
	
	@Override
	public List<Ride> getAllRides(long rideid) {
		List<Ride> list = new ArrayList<>();
		riderepository.findAll().forEach(e -> list.add(e));
		return list;
		}
	
	@Override
	public Ride getRideById(long rideId) {
		Ride obj = riderepository.findById(rideId).get();
        return obj;
		// TODO Auto-generated method stub
		
	}

	
	}
