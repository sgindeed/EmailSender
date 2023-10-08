package com.supCode.SpringEmail;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {
/*.
* .
* .
* .
* .
* author @ Supratim
* .
* .
* .
* */
	@Autowired
	private EmailSenderService emailSenderService;


	public static void main(String[] args) {
		SpringApplication.run(SpringEmailApplication.class, args);
	}

	@EventListener(ApplicationReadyEvent.class)
	public void triggerMail() throws MessagingException {
		emailSenderService.sendMailWithAttachment("sgindeed234@gmail.com",
				"This is email body.",
				"This email subject",
				"files/Supratim demo cv 1page (2).pdf");
		;

	}

}
