package com.project.app.estudiantes.dto.rp;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class StudentsDto implements Serializable{

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
	@JsonProperty(required = true)
	private String Address;
	@JsonProperty(required = false)
	private String Email;
	@JsonProperty(required = false)
	private String Image;
	@JsonProperty(required = false)
	private List<ParentsDto> Parents;
	
	public StudentsDto() {
		
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getImage() {
		return Image;
	}

	public void setImage(String image) {
		Image = image;
	}

	public List<ParentsDto> getParents() {
		return Parents;
	}

	public void setParents(List<ParentsDto> parents) {
		Parents = parents;
	}

	@Override
	public String toString() {
		return "StudentsDto [Id=" + Id + ", Identification=" + Identification + ", FirstNames=" + FirstNames
				+ ", LastNames=" + LastNames + ", Phones=" + Phones + ", Address=" + Address + ", Email=" + Email
				+ ", Image=" + Image + ", Parents=" + Parents + "]";
	}

}
