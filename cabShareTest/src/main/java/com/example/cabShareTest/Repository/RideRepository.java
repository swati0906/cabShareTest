package com.example.cabShareTest.Repository;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.example.cabShareTest.bean.*;


@Component
public interface RideRepository  extends CrudRepository<Ride, Long> {
}
