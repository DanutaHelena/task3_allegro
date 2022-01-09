package com.example.task3_allegro.service;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import lombok.extern.slf4j.Slf4j;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
//import org.json.simple.JSONArray;
//import org.json.JSONObject;
//import org.json.simple.parser.JSONParser;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;



@Service
@Slf4j
public class UserRepoService {

    private static final String MAIN_URL = "https://api.github.com/users/";
    private RestTemplate restTemplate = new RestTemplate();


    public String getUserName() {
        String inline = "";
        String test1 = "";
        try {

            URL url = new URL(MAIN_URL + "danutahelena" + "/repos");
            //System.out.println(url);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.connect();

            int responsecode = conn.getResponseCode();

            if (responsecode != 200) {
                throw new RuntimeException("HttpResponseCode: " + responsecode);
            } else {

                Scanner scanner = new Scanner(url.openStream());

                //Write all the JSON data into a string using a scanner
                while (scanner.hasNext()) {
                    inline += scanner.nextLine();
                }
                StringBuilder sb = new StringBuilder(inline);
                sb.deleteCharAt(inline.length()-1);
                sb.deleteCharAt(0);
                inline = sb.toString();
                scanner.close();
                JsonParser parse = new JsonParser();
                JsonObject data_obj = (JsonObject) parse.parse(inline);
                System.out.println(inline);
                test1 = inline;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return test1;
    }
}
// 3 different JSON parsers were used, all three complained about not consistent data format
// in code above there was an error:
// com.google.gson.stream.MalformedJsonException: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 4998com.google.gson.stream.MalformedJsonException: Use JsonReader.setLenient(true) to accept malformed JSON at line 1 column 4998
// I focused on parsing data from GitHub RestAPI to JSON to have clean code and solution
// however it looks like standard operation on STRING would be better approach, however I run out of time.
// If it would be possible to give me another chance it would be very appreciated. Thank you in advance.