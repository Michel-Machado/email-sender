package com.estudos.emailservices.services;

import com.estudos.emailservices.models.EmailModel;
import com.estudos.emailservices.models.dto.EmailDTO;
import com.estudos.emailservices.repositories.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;
    @Autowired
    private EmailRepository emailRepository;

    public void sendEmail(EmailDTO emailDTO){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(emailDTO.getPara());
        message.setSubject(emailDTO.getTitle());
        message.setText(emailDTO.getMessage());
        EmailModel emailModel = new EmailModel(emailDTO);

        javaMailSender.send(message);
        emailRepository.save(emailModel);
    }
}
