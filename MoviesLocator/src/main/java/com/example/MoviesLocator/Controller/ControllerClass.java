package com.example.MoviesLocator.Controller;

import com.example.MoviesLocator.MovieApiResponse.ApiRoleStarter;
import com.example.MoviesLocator.MovieApiResponse.Response;
import com.example.MoviesLocator.Service.ApiService;
import com.example.MoviesLocator.Service.MovieService;
import com.example.MoviesLocator.entities.MoviesDescp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/movies")
public class ControllerClass {
    @Autowired
    private ApiRoleStarter apiRoleStarter;
    @Autowired
    private MovieService movieService;
    @Autowired
    private ApiService apiService;

//    @PostMapping
//    public boolean createEntry(@RequestBody MoviesDescp moviesDescp){
//        movieService.saveEntry(moviesDescp);
//        System.out.println("hello where is this xxxx");
//        return true;
//    }
    @PostMapping
    public boolean createEntry2(){
        movieService.saveEntryall(apiRoleStarter.ValueGiver());
        return true;
    }
    @GetMapping
    public List<MoviesDescp> showall(){
        return movieService.showall();
    }

    @GetMapping("id/{ID}")
    public MoviesDescp getbyid(@PathVariable Long ID){
        return movieService.getbyid(ID).orElse(null);
    }

    @DeleteMapping("id/{ID}")
    public boolean deletebyid(@PathVariable Long ID){
        movieService.deletebyid(ID);
        return true;
    }
    @PutMapping("id/{ID}")
    public boolean giverating(@PathVariable Long ID, @RequestBody MoviesDescp updatedMovie) {
        movieService.updateYourRating(ID, updatedMovie.getYourRating());
        return true;
    }

}
