package com.estudos.emailservices.services;

import com.estudos.emailservices.models.dto.EmailDTO;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender javaMailSender;

    public void sendEmail(EmailDTO emailDTO){
        SimpleMailMessage message = new SimpleMailMessage();


        message.setTo(emailDTO.getTo());
        message.setSubject(emailDTO.getTitle());
        message.setText(emailDTO.getMessage());

        javaMailSender.send(message);
    }
}
