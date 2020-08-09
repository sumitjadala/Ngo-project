package com.ngo.utility;

import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class JavaMailUtility {

	@Autowired
	private JavaMailSender javaMailSender;

	public void sendEmail() throws MessagingException, IOException {

		MimeMessage msg = javaMailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(msg, true);
		helper.setTo("sumitjadala17@gmail.com");
		helper.setSubject("Thank you for subscribing !!! ");
		helper.setText("Welcome \r\n"
				+ "\r\nWatch out for the next newsletter landing in your inbox soon! In the meantime, \r\n"
				+ "have a peruse of some more awesome content.\r\n\n" + "Best Wishes \r\n" + "E-facility for NGO");

		javaMailSender.send(msg);
	}
}
