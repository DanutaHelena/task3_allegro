package com.example.task3_allegro.controller;

import com.example.task3_allegro.model.UserRepoDto;
import com.example.task3_allegro.service.UserRepoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class UserRepoController {

    private final UserRepoService userRepoService;

    @GetMapping("/repos")
    public UserRepoDto getUserName() {
        return userRepoService.getUserName();
    }
}
