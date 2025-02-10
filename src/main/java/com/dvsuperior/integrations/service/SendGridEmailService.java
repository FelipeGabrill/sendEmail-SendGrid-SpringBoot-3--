package com.dvsuperior.integrations.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.dvsuperior.integrations.dto.EmailDTO;

public class SendGridEmailService implements EmailService {

	private static Logger LOG = LoggerFactory.getLogger(SendGridEmailService.class);

	public void sendEmail(EmailDTO dto) {
		LOG.info("Sending email to: " + dto.getTo());
		LOG.info("Email sent!");
	}
}
