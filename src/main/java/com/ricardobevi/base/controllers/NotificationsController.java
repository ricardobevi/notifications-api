package com.ricardobevi.base.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Response;
import java.util.HashMap;

@RestController
public class NotificationsController {
	
	@RequestMapping("/mail")
	@PostMapping
    public ResponseEntity<Object> mail() {
		return ResponseEntity.ok(new HashMap<String, Object>(){{
			put("status", "Mail sent!");
		}});
    }


	@RequestMapping("/sms")
	@PostMapping
	public ResponseEntity<Object> sms() {
		return ResponseEntity.ok(new HashMap<String, Object>(){{
			put("status", "SMS sent!");
		}});
	}
	
}
