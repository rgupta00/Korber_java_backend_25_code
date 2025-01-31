package com.busycoder.accounts.dto;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "info")
public class InfoDto {
    private  String message;
    private String name;
}
