package com.example.v4.item.service;

import com.example.v4.item.api.request.EmailRequest;
import com.example.v4.item.api.request.UpdateEmailRequest;
import com.example.v4.item.api.response.EmailResponse;
import com.example.v4.item.domain.Email;
import com.example.v4.item.repository.EmailRepository;
import com.example.v4.item.support.EmailExceptionSupplier;
import com.example.v4.item.support.EmailMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmailService {

    private final EmailRepository emailRepository;
    private final EmailMapper emailMapper;

    public EmailService(EmailRepository emailRepository, EmailMapper emailMapper) {
        this.emailRepository = emailRepository;
        this.emailMapper = emailMapper;
    }

    public EmailResponse create(EmailRequest emailRequest) {
        Email email = emailRepository.save(emailMapper.toEmail(emailRequest));
        return emailMapper.toEmailResponse(email);
    }

    public EmailResponse find(Long id) {
        Email email = emailRepository.findById(id).orElseThrow(EmailExceptionSupplier.emailNotFound(id));
        return emailMapper.toEmailResponse(email);
    }

    public List<EmailResponse> findAll() {
        return emailRepository.findAll().stream().map(emailMapper::toEmailResponse).collect(Collectors.toList());
    }

    public EmailResponse update(UpdateEmailRequest updateEmailRequest) {
        Email email = emailRepository.findById(updateEmailRequest.getId()).orElseThrow(
                EmailExceptionSupplier.emailNotFound(updateEmailRequest.getId()));
        emailRepository.save(emailMapper.toEmail(email, updateEmailRequest));
        return emailMapper.toEmailResponse(email);
    }

    public EmailResponse updateAlternativeVersion(Long id, UpdateEmailRequest updateEmailRequest) {
        Email email = emailRepository.findById(id).orElseThrow(
                EmailExceptionSupplier.emailNotFound(id));
        emailRepository.save(emailMapper.toEmail(email, updateEmailRequest));
        return emailMapper.toEmailResponse(email);
    }

    public void delete(Long id) {
        Email email = emailRepository.findById(id).orElseThrow(EmailExceptionSupplier.emailNotFound(id));
        emailRepository.deleteById(email.getId());
    }
}

