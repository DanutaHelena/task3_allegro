package com.example.task3_allegro.model;


import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
public class UserRepoDto {


    private String name;
    private Long stargazersCount;

    public void setName(String name) {
        this.name = name;
    }

    public void setStargazersCount(Long stargazersCount) {
        this.stargazersCount = stargazersCount;
    }

    public String getName() {
        return name;
    }

    public Long getStargazersCount() {
        return stargazersCount;
    }
}

