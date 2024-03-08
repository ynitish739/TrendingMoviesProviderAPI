package com.example.MoviesLocator.MovieApiResponse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Data
public class Response {
    private int page;
    private List<Movie> results;
    @JsonProperty("total_pages")
    private int totalPages;
    @JsonProperty("total_results")
    private int totalResults;

    // Getters and Setters

//    public int getPage() {
//        return page;
//    }
//
//    public void setPage(int page) {
//        this.page = page;
//    }
//
//    public List<Movie> getResults() {
//        return results;
//    }
//
//    public void setResults(List<Movie> results) {
//        this.results = results;
//    }
//
//    public int getTotalPages() {
//        return totalPages;
//    }
//
//    public void setTotalPages(int totalPages) {
//        this.totalPages = totalPages;
//    }
//
//    public int getTotalResults() {
//        return totalResults;
//    }

//    public void setTotalResults(int totalResults) {
//        this.totalResults = totalResults;
//    }
        private Movie movie;
        @JsonIgnoreProperties(ignoreUnknown = true)
        @Data
        public static class Movie {
//            private boolean adult;
//            @JsonProperty("genre_ids")
//            private List<Integer> genreIds;
            private long id;
//            @JsonProperty("original_language")
//            private String originalLanguage;
//            @JsonProperty("original_title")
//            private String originalTitle;
            private String overview;
//            private double popularity;
            @JsonProperty("release_date")
            private String releaseDate;
            private String title;
            @JsonProperty("vote_average")
            private double voteAverage;
//            @JsonProperty("vote_count")
//            private int voteCount;
//             @Override
//             public String toString() {
//                   return "Movie{" +
//                                 "id=" + id +
//                                 ", title='" + title + '\'' +
//                                 ", releaseDate='" + releaseDate + '\'' +
//                                 ", voteAverage=" + voteAverage +
//                                 "  overview :" + overview  +
//                                 '}';
//}



    }

}