package com.estudos.emailservices.models.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailDTO {

    @NotBlank
    private String owner;
    @NotBlank
    @Email
    private String para;
    @NotBlank
    private String title;
    @NotBlank
    private String message;
}
