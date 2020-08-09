package com.ngo.controller;

import java.io.IOException;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ngo.utility.JavaMailUtility;

@Controller
@RequestMapping("/email")
public class EmailController {

	@Autowired
	JavaMailUtility javaMailBoot;

	@GetMapping("/sendEmail")
	public String sendEmail() throws MessagingException, IOException {
		javaMailBoot.sendEmail();
		return "redirect:/home?mailsentSuccessfully";
	}
}