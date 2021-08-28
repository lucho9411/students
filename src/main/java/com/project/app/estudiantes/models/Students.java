package com.project.app.estudiantes.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "estudiantes")
public class Students implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Column(name = "identificacion", nullable = false, unique = true)
	private String identification;
	@Column(name = "nombres", nullable = false)
	private String names;
	@Column(name = "apellidos", nullable = false)
	private String lastNames;
	@Column(name = "telefono", nullable = false)
	private String phone;
	@Column(name = "direccion", nullable = false)
	private String address;
	@Column(name = "email", nullable = true)
	private String email;
	@Column(name = "imagen", nullable = true)
	private String image;
	
	public Students() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public String getNames() {
		return names;
	}

	public void setNames(String names) {
		this.names = names;
	}

	public String getLastNames() {
		return lastNames;
	}

	public void setLastNames(String lastNames) {
		this.lastNames = lastNames;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", identification=" + identification + ", names=" + names + ", lastNames="
				+ lastNames + ", phone=" + phone + ", address=" + address + ", email=" + email + ", image=" + image
				+ "]";
	}
}
