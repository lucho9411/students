package com.project.app.estudiantes.generalCover;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.project.app.estudiantes.dto.rp.MessageDto;

public class MessageCover implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private MessageDto Msg = new MessageDto();
	
	public MessageCover(int Codigo)
	{
		if(Codigo == 200) {
			Msg.setText("Transacción exitosa");
		}
		else if(Codigo == 500) {
			Msg.setText("Error en el servidor");
		}
		else if(Codigo == 409) {
			Msg.setText("Recurso incompleto");
		}
		else if(Codigo == 403) {
			Msg.setText("Acceso denegado");
		}
		else if(Codigo == 404) {
			Msg.setText("Recurso no existe");
		}
		else if(Codigo == 509) {
			Msg.setText("Recurso ya existe");
		}
		Msg.setCode(Codigo);
	}

	@JsonProperty("Message")
	public MessageDto getMessage() {
		return Msg;
	}

	public void setMessage(String Message, int Codigo) {
		Msg.setText(Message);
		Msg.setCode(Codigo);
	}


}
