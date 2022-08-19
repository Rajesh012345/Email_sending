package com.example.demo.service;

import com.example.demo.model.Email;
import com.example.demo.model.Response;


public interface EmailService {

	Response sendEmail(Email mail);

	//String sendEmail();

	//String sendEmai(Email attachment);

	String sendEmai();
	
	
//	void sendEmailWithAttachment(Email e)  {
//
//		MimeMessage mimeMessage = javaemailSender.createMimeMessage();
//		
//		MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true);
//
//		helper.setTo(user.getTo());
//		helper.setSubject("Testing Mail API with Attachment");
//		helper.setText("Please find the attached document below.");
//
//		ClassPathResource classPathResource = new ClassPathResource("C:\\Users\\ACER\\Desktop\\Images\\SanFrancisco.jpg");
//		helper.addAttachment(classPathResource.getFilename(), classPathResource);
//
//		javaemailSender.send(mimeMessage);
//	}
	

	}

	

