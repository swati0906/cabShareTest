package com.example.cabShareTest.service;

import java.util.List;
import com.example.cabShareTest.bean.*;

public interface IRideService {
			Ride getRideById(long rideId);
		    boolean loadRide(Ride ride);
		    List<Ride> getAllRides(long rideid);
			
		}




