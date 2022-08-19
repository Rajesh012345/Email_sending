package com.example.demo.model;

import java.io.Serializable;

public class Email implements Serializable{
	
	private String to;
	private String from ;
	private String subject;
	private String text;
	private String parameter;

	public Email(String to, String from, String subject, String text, String parameter) {
		super();
		this.to = to;
		this.from = from;
		this.subject = subject;
		this.text = text;
		this.parameter = parameter;
	}





	@Override
	public String toString() {
		return "Email [to=" + to + ", from=" + from + ", subject=" + subject + ", text=" + text + ", parameter="
				+ parameter + "]";
	}



	public String getSubject() {
		return subject;
	}



	public void setSubject(String subject) {
		this.subject = subject;
	}



	public String getText() {
		return text;
	}



	public void setText(String text) {
		this.text = text;
	}

	public String getFrom() {
		return from;
	}



	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}
}
