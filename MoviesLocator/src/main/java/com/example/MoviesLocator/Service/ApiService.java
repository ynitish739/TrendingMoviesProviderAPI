package com.example.MoviesLocator.Service;

import com.example.MoviesLocator.MovieApiResponse.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ApiService {
    private static final String apikey="https://api.themoviedb.org/3/search/movie?query=Dune%3A%20Part%20Two&include_adult=false&language=en-US&page=1&api_key=4b1ab7cd14b706467046eb45a1332ca1";
        private static final String API="https://api.themoviedb.org/3/trending/all/week?api_key=4b1ab7cd14b706467046eb45a1332ca1";

    @Autowired
    private RestTemplate restTemplate;

    public Response getbook(){
        ResponseEntity<Response> response = restTemplate.exchange(API, HttpMethod.GET, null, Response.class);
        Response body = response.getBody();
        return body;
    }
}
