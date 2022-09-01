package com.lahermandad.hermanomayor.response;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class ResponseHandler {
	public static ResponseEntity<Object> generarRespuesta(String mensaje, HttpStatus estado, Object negocio){
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("mensaje", mensaje);
		map.put("estado", estado);
		map.put("negocio", negocio);
		
		return new ResponseEntity<Object>(map, estado);
	}
}
