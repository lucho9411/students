package com.project.app.estudiantes.dto.rp;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MessageDto implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@JsonProperty(required = true)
	private String Text;
	
	@JsonProperty(required = true)
	private int Code;
	
	public MessageDto() {
		
	}

	public String getText() {
		return Text;
	}

	public void setText(String text) {
		Text = text;
	}

	public int getCode() {
		return Code;
	}

	public void setCode(int code) {
		Code = code;
	}

	@Override
	public String toString() {
		return "messageDto [Text=" + Text + ", Code=" + Code + "]";
	}

}
