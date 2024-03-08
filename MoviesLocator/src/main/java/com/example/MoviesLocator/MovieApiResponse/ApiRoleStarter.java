package com.example.MoviesLocator.MovieApiResponse;

import com.example.MoviesLocator.Service.ApiService;
import com.example.MoviesLocator.entities.MoviesDescp;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Component
public class ApiRoleStarter {
    @Autowired
    private MoviesDescp moviesDescp;
    @Autowired
    private ApiService apiService;
        ArrayList<Long> MovieID=new ArrayList<>();
        ArrayList<String> MovieTitle=new ArrayList<>();
        ArrayList<String> MovieReleaseDate=new ArrayList<>();
        ArrayList<Double> MovieAvgVote=new ArrayList<>();
        ArrayList<String> MovieOverview=new ArrayList<>();
    @PostConstruct
    public void hello(){
        Response response= apiService.getbook();

        if (response != null) {
//            model.addAttribute("movies", response.getResults());
//            t.add(response.getResults());
            List<Response.Movie> movies = response.getResults();
            for (Response.Movie movie : movies) {
                MovieID.add(movie.getId());
                MovieTitle.add(movie.getTitle());
                MovieReleaseDate.add(movie.getReleaseDate());
                MovieAvgVote.add(movie.getVoteAverage());
                MovieOverview.add(movie.getOverview());
            }
        }
    }
    List<MoviesDescp> list=new ArrayList<>();
    public List<MoviesDescp> ValueGiver(){
        for(int i=0;i<20;i++) {
            moviesDescp.ID = MovieID.get(i);
            moviesDescp.Title = MovieTitle.get(i);
            moviesDescp.ReleaseDate = MovieReleaseDate.get(i);
            moviesDescp.VoteAvg = MovieAvgVote.get(i);
            moviesDescp.Overview = MovieOverview.get(i);
            list.add(new MoviesDescp(moviesDescp.ID, moviesDescp.Title, moviesDescp.ReleaseDate, moviesDescp.VoteAvg, moviesDescp.Overview,null));
        }
        System.out.println("xxxxxxx");
        return list;
    }
}
