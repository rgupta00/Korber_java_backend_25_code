package com.productapp.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@Data
@NoArgsConstructor
@AllArgsConstructor

@ConfigurationProperties(prefix = "account")
public class InfoDto {
    private String message;
    private Map<String, String> contactDetails;
    private List<String> onCallSupport;
}