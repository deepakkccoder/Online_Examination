package edu.mum.onlinetest.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.mum.onlinetest.model.Email;
import edu.mum.onlinetest.serviceImpl.MailServiceImpl;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	MailServiceImpl mailService;

	@RequestMapping(value = "/send", method = RequestMethod.POST)
	public String doSendEmail(HttpServletRequest request, @RequestBody Email email) {

		/*
		 * //String from = "sk6434362@gmail.com"; String to =
		 * email.getToEmail(); String subject = email.getSubject(); String msg =
		 * email.getBody();
		 */

		mailService.sendMail(email);
		System.out.println("message sent");

		// show msg done
		return "done";
	}
}
