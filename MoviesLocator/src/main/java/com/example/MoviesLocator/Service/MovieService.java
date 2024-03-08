package com.example.MoviesLocator.Service;

import com.example.MoviesLocator.Repository.MoviesRepository;
import com.example.MoviesLocator.entities.MoviesDescp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
public class MovieService {
    @Autowired
    private MoviesRepository moviesRepository;
    @Autowired
    private MoviesDescp moviesDescp;

    public void saveEntry(MoviesDescp moviesDescp){
        moviesRepository.save(moviesDescp);

    }
    public void saveEntryall(List<MoviesDescp>moviesDescps){
        moviesRepository.saveAll(moviesDescps);
    }
    public List<MoviesDescp> showall(){
        return moviesRepository.findAll();
    }
    public Optional<MoviesDescp> getbyid(Long ID){
        return moviesRepository.findById(ID);
    }

    public void deletebyid(Long ID){
        moviesRepository.deleteById(ID);
    }

    public void updateYourRating(Long ID, String yourRating) {
        Optional<MoviesDescp> optionalMovie = moviesRepository.findById(ID);
        if (optionalMovie.isPresent()) {
            MoviesDescp existingMovie = optionalMovie.get();
            existingMovie.setYourRating(yourRating);
            moviesRepository.save(existingMovie);
        }
    }
}
