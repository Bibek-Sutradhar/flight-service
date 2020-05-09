package com.ibm.flightservice.dto;

import java.util.List;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FlightSearchResponseDTO {
	
	@Id
	private String Id;
	
	private List<DataDTO> data;

	public List<DataDTO> getData() {
		return data;
	}

	public void setData(List<DataDTO> data) {
		this.data = data;
	}	
	

}
