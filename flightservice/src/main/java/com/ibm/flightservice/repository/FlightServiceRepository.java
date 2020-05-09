package com.ibm.flightservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.flightservice.dto.FlightSearchResponseDTO;

public interface FlightServiceRepository extends MongoRepository<FlightSearchResponseDTO, String> {

}
