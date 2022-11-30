package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Email;
import com.example.demo.model.Response;
import com.example.demo.service.EmailService;

@RestController
@RequestMapping("/email")
public class Emailcontroller {
	
	@Autowired
	 EmailService emailservice;
	
	
	@PostMapping("/simplemailsend")
	public Response sendmail(@RequestBody Email email) {         //for text only
	
	return emailservice.sendEmail(email);
	}
//	
//	

//	@PostMapping("/sendEmail")
//	public String sendEmail() {                           //calling service layer
//		return emailservice.sendEmail();
//	}
	
	
//	@PostMapping("/sendWithAttachment")
//	public String sendattachment(@RequestParam Email attachment) {
//		return emailservice.sendEmai(attachment);
//	}
	
	
	//post to the git
//	ghugjhgb
	
	@PostMapping("/sendEmailwithAttachment")
	public String sendEmailwithAttachment() {
		return emailservice.sendEmai();
	}
	
	//ended uploaded to git hub
}
	

	
	
	
