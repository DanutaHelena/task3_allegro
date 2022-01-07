package com.example.task3_allegro.service;

import com.example.task3_allegro.model.UserRepoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class UserRepoService {

    private static final String MAIN_URL = "https://api.github.com/users/";
    private RestTemplate restTemplate = new RestTemplate();


    public UserRepoDto getUserName() {
        String response = getUserRepo("genobis");
        log.info(response);
        return null;


    }

    private String getUserRepo(String userName) {
        return restTemplate.getForObject(MAIN_URL + "{userName}/repos",
                String.class, userName);
    }

}
