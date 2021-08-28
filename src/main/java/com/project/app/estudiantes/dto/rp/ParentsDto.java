package com.project.app.estudiantes.dto.rp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ParentsDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty(required = true)
	private Long Id;
	@JsonProperty(required = true)
	private String Identification;
	@JsonProperty(required = true)
	private String FirstNames;
	@JsonProperty(required = true)
	private String LastNames;
	@JsonProperty(required = true)
	private String Phones;
	
	public ParentsDto() {
		
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getIdentification() {
		return Identification;
	}

	public void setIdentification(String identification) {
		Identification = identification;
	}

	public String getFirstNames() {
		return FirstNames;
	}

	public void setFirstNames(String firstNames) {
		FirstNames = firstNames;
	}

	public String getLastNames() {
		return LastNames;
	}

	public void setLastNames(String lastNames) {
		LastNames = lastNames;
	}

	public String getPhones() {
		return Phones;
	}

	public void setPhones(String phones) {
		Phones = phones;
	}

	@Override
	public String toString() {
		return "ParentsDto [Id=" + Id + ", Identification=" + Identification + ", FirstNames=" + FirstNames
				+ ", LastNames=" + LastNames + ", Phones=" + Phones + "]";
	}
}
