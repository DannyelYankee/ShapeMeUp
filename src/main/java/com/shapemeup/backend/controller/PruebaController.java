package com.shapemeup.backend.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@Controller
@RequestMapping(value = "/prueba")
public class PruebaController {
	private final static ObjectMapper mapper = new ObjectMapper(); 
	
	@GetMapping(value = "/hola")
	ResponseEntity<ObjectNode> hellowWorld(){
		ObjectNode json = mapper.createObjectNode();
		HttpStatusCode status = HttpStatus.OK;
		json.put("rdo", "hola mundo");
		
		ResponseEntity<ObjectNode> response = new ResponseEntity<ObjectNode>(json,status);
		return response;
	}
}
