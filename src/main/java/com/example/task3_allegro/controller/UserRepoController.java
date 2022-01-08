package com.example.task3_allegro.controller;

import com.example.task3_allegro.model.UserRepoDto;
import com.example.task3_allegro.service.UserRepoService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class UserRepoController {

    private final UserRepoService userRepoService;

    @GetMapping("/repos")
    @JsonView(UserRepoDto.class)
    public List<UserRepoDto> getRepos() {
        return userRepoService.getUserName();
    }

}
