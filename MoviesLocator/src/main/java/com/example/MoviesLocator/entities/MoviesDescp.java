package com.example.MoviesLocator.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;
import org.yaml.snakeyaml.events.Event;

@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
//@RequiredArgsConstructor
@Document(collection = "Movies_entries")
public class MoviesDescp {

    @Id
    public Long ID;
    public String Title;
    public String ReleaseDate;
    public Double VoteAvg;
    public String Overview;
    public String YourRating;

}
