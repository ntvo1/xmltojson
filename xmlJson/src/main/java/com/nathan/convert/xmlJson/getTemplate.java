package com.nathan.convert.xmlJson;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class getTemplate {

    public String getContent(String url)
    {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl
                = "http://www.bindows.net/documentation/download/ab.xml";
        ResponseEntity<String> response
                = restTemplate.getForEntity(fooResourceUrl , String.class);
        String content="";
        if(response.getStatusCodeValue() == 200)
        {
            content = response.getBody();
        }
        else
        {
            content="error";
        }
        return content;
    }
}
