package com.lahermandad.hermanomayor.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lahermandad.hermanomayor.response.ResponseHandler;

@ControllerAdvice
public class HermanoMayorExceptionController {

	@ExceptionHandler(value = DatoNoEncontradoException.class)
	public ResponseEntity<Object> datoNoEncontradoException(DatoNoEncontradoException exception){
		return ResponseHandler.generarRespuesta("El dato no fue encontrado", HttpStatus.NOT_FOUND, null);
	}
}
