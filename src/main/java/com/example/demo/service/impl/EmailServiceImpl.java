package com.example.demo.service.impl;


import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;


import com.example.demo.model.Email;
import com.example.demo.model.Response;

@Service
public class EmailServiceImpl implements  com.example.demo.service  .EmailService 

{

	  @Autowired
	    public JavaMailSender javaemailSender;
    
	    @Override
	    public Response sendEmail(Email mail) {

	        Response response = new Response();
	        try {
	            SimpleMailMessage message = new SimpleMailMessage();
	            

	            message.setTo(mail.getTo());
	            message.setSubject(mail.getSubject());
	            message.setText(mail.getText());
	        //    message.setFrom("dhrghdfg");
	            
				
	            javaemailSender.send(message);

	            response.setCode(0);
	            response.setMessage("Email send ok!");
	            
				
	        } catch (Exception ex) {
	            response.setCode(1);
	            response.setMessage("Error sending email: " + ex.getMessage());
	        }

	        return response;
	    }
 
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//		@Override
//		public String sendEmail() {
//			SimpleMailMessage message = new SimpleMailMessage();
//			 //now simple set cc body 
//			message.setFrom("gundrarajesh001@gmail.com");
//			message.setTo("rgundra75@gmail.com");
//			message.setSubject("Test Subject");
//			message.setText("Test Body");
//	
//			javaemailSender.send(message);   // using javamailsender obj we call method send()
//			
//			return "Mail sent successfully";
//		}

	

	@Override
		public String  sendEmai() {
			try {
				MimeMessage mimemessage = javaemailSender.createMimeMessage();
				
				MimeMessageHelper messageHelper = new MimeMessageHelper(mimemessage, true);    //in this mehod pass obj and kept true because we pass files (multipart)
				
				messageHelper.setFrom("gundrarajesh001@gmail.com");
				messageHelper.setTo("rgundra75@gmail.com");
				messageHelper.setSubject("Test Subject");
				messageHelper.setText("Test Body");
				
				File file1 = new File("C:\\Users\\IVIS\\Pictures\\Screenshots\\message.txt");
				messageHelper.addAttachment(file1.getName(), file1);
				
				File file2 = new File("C:\\Users\\IVIS\\Pictures\\Screenshots\\message.txt");
				messageHelper.addAttachment(file2.getName(), file2);
				
				File file3 = new File("C:\\Users\\IVIS\\Pictures\\Screenshots\\picture2.jpg");
				messageHelper.addAttachment(file3.getName(), file3);
				
				
				javaemailSender.send(mimemessage);
				
				return "Mail sent successfully";
				
			} catch (Exception e) {
				return "Mail sent failed";
			}
		}
	
	}
