package com.example.task3_allegro.model;


import com.fasterxml.jackson.annotation.JsonView;
import com.google.gson.JsonElement;
import com.google.gson.JsonSyntaxException;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Builder
public class UserRepoDto {

    private String name;
    private Long stargazers_count;

    }
/*public class Json {
    public JsonElement parse(String response) throws JsonSyntaxException {
        return parse(response);
    }
}

 */
