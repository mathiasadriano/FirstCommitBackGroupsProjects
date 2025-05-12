package com.groupal.projects.infrastructure.external;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SendbirdClient {
    @Value("${sendbird.api.key}")
    private String apiKey;

    public String createGroupChannel(String projectId) {

        return "Canal creado en Sendbird para el proyecto " + projectId;
    }
}
