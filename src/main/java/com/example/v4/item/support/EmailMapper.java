package com.example.v4.item.support;

import com.example.v4.item.api.request.EmailRequest;
import com.example.v4.item.api.request.UpdateEmailRequest;
import com.example.v4.item.api.response.EmailResponse;
import com.example.v4.item.domain.Email;
import org.springframework.stereotype.Component;

@Component
public class EmailMapper {

    public Email toEmail(EmailRequest emailRequest) {
        return new Email(emailRequest.getEmail());
    }

    public Email toEmail(Email email, UpdateEmailRequest emailRequest) {
        email.setEmail(emailRequest.getEmail());
        return email;
    }

    public EmailResponse toEmailResponse(Email email) {
        return new EmailResponse(email.getId(), email.getEmail());
    }
}

