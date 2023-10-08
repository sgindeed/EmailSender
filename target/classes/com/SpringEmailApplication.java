// Source code is decompiled from a .class file using FernFlower decompiler.
package com.supCode.SpringEmail;

import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;

@SpringBootApplication
public class SpringEmailApplication {
   @Autowired
   private EmailSenderService emailSenderService;

   public SpringEmailApplication() {
   }

   public static void main(String[] args) {
      SpringApplication.run(SpringEmailApplication.class, args);
   }

   @EventListener({ApplicationReadyEvent.class})
   public void triggerMail() throws MessagingException {
      this.emailSenderService.sendMailWithAttachment("sgindeed234@gmail.com", "This is email body.", "This email subject", "files/Supratim demo cv 1page (2).pdf");
   }
}
