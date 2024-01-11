package com.estudos.emailservices.controllers;

import com.estudos.emailservices.models.dto.EmailDTO;
import com.estudos.emailservices.services.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping
    public ResponseEntity<EmailDTO> enviaEmail(@Valid @RequestBody EmailDTO emailDTO){
        emailService.sendEmail(emailDTO);
        return ResponseEntity.ok(emailDTO);
    }
}
