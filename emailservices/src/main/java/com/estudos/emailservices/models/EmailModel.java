package com.estudos.emailservices.models;

import com.estudos.emailservices.models.dto.EmailDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_emails")
@NoArgsConstructor
public class EmailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String owner;
    private String para;
    private String title;
    private String message;

    public EmailModel(EmailDTO emailDTO) {
        owner = emailDTO.getOwner();
        para =  emailDTO.getPara();
        title =  emailDTO.getTitle();
        message =  emailDTO.getMessage();
    }
}
