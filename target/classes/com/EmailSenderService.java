// Source code is decompiled from a .class file using FernFlower decompiler.
package com.supCode.SpringEmail;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import java.io.File;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class EmailSenderService {
   @Autowired
   private JavaMailSender javaMailSender;

   public EmailSenderService() {
   }

   public void sendMailWithAttachment(String toEmail, String body, String subject, String attachment) throws MessagingException {
      MimeMessage mimeMessage = this.javaMailSender.createMimeMessage();
      MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
      mimeMessageHelper.setFrom("sup06.connect@gmail.com");
      mimeMessageHelper.setTo(toEmail);
      mimeMessageHelper.setText(body);
      mimeMessageHelper.setSubject(subject);
      FileSystemResource fileSystemResource = new FileSystemResource(new File(attachment));
      mimeMessageHelper.addAttachment(fileSystemResource.getFilename(), fileSystemResource);
      this.javaMailSender.send(mimeMessage);
      System.out.println("Mail with attachment sent successfully..");
   }
}
