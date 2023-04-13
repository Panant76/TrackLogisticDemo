package com.github.Panant76.TrackLogisticsDemo.config;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.security.Security;

@Getter
@Setter
@ConfigurationProperties(prefix = "project")
@Component
public class ProjectConfiguration {
    private String formatDate;
    private String formatDateTime;
    private Security security;


}
