package site.thuer.FilmLocationsBackend.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import site.thuer.FilmLocationsBackend.entities.FilmLocation;
import site.thuer.FilmLocationsBackend.repo.FilmLocationRepository;
import site.thuer.FilmLocationsBackend.rest.ressource.response.FilmLocationResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class FilmLocationController
{
    FilmLocationRepository filmLocationRepository;

    public FilmLocationController() {
        this.filmLocationRepository = new FilmLocationRepository();
    }

    @CrossOrigin
    @RequestMapping(value = "/filmLocations", method = RequestMethod.GET)
    public FilmLocationResponse getFilmLocations()
    {
        List<FilmLocation> result = filmLocationRepository.findAll();

        FilmLocationResponse fr = new FilmLocationResponse();
        fr.setFilmLocations(result);

        return fr;
    }

    @CrossOrigin
    @RequestMapping(value = "/filmLocations/search", method = RequestMethod.GET)
    public FilmLocationResponse getFilmLocations(@RequestParam(value = "title", required = false) String title,
                                                 @RequestParam(value = "location", required = false) String location)
    {
        List<FilmLocation> result = new ArrayList<>();
        if(title != null)
            result = filmLocationRepository.findByTitle(title);

        else if(location != null)
            result = filmLocationRepository.findByLocation(location);

        FilmLocationResponse fr = new FilmLocationResponse();
        fr.setFilmLocations(result);

        return fr;
    }
}
