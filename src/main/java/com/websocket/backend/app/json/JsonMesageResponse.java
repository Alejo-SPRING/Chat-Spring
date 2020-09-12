package com.websocket.backend.app.json;

import java.util.Date;

public class JsonMesageResponse {

	private String mensaje;
	private Date fecha;
	private String usuario;

	public JsonMesageResponse(String mensaje, Date fecha, String usuario) {
		this.mensaje = mensaje;
		this.fecha = fecha;
		this.usuario = usuario;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

}
