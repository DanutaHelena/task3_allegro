package com.example.task3_allegro.service;

import com.example.task3_allegro.model.UserRepoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class UserRepoService {

    private static final String MAIN_URL = "https://api.github.com/users/";
    private RestTemplate restTemplate = new RestTemplate();


    public List<UserRepoDto> getUserName() {
        String response = getUserRepo("genobis");
        log.info(response);

        List<UserRepoDto> result = new ArrayList<>();
        result.add(new UserRepoDto("xyz", 34L));
        result.add(new UserRepoDto("asd", 44L));
        return result;

    }

    private String getUserRepo(String userName) {
        return restTemplate.getForObject(MAIN_URL + "{userName}/repos",
                String.class, userName);
    }

}
