package com.dvsuperior.integrations.service;

import com.dvsuperior.integrations.dto.EmailDTO;

public interface EmailService {

	void sendEmail(EmailDTO dto);
}
