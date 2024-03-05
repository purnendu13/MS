package com.example.msp;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class Contlr {
	 @GetMapping("/gfg") 
	    public ResponseEntity<String> getAnonymous() { 
	        return ResponseEntity.ok("Welcome GateWay"); 
	    }
}
