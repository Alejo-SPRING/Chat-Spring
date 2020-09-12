package com.websocket.backend.app.controller;

import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.websocket.backend.app.json.JsonMesageResponse;
import com.websocket.backend.app.json.JsonMessageObj;

@Controller
public class WebSocketController {

	@MessageMapping("/send")
	@SendTo("/socketRead/read")
	public JsonMesageResponse enviar(JsonMessageObj body) throws Exception {
		return new JsonMesageResponse(body.getMensaje(), new Date(), body.getUsuario());
	}
	
}
