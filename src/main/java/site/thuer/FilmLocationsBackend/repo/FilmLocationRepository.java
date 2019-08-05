package site.thuer.FilmLocationsBackend.repo;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import site.thuer.FilmLocationsBackend.entities.FilmLocation;

import java.util.List;
import java.util.stream.Collectors;

public class FilmLocationRepository
{
    private final String API = "https://data.sfgov.org/resource/wwmu-gmzc.json";
    private RestTemplate restTemplate;

    public FilmLocationRepository()
    {
        this.restTemplate = new RestTemplate();
    }

    public List<FilmLocation> findAll()
    {
        ResponseEntity<List<FilmLocation>> response = restTemplate.exchange(
                this.API,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<FilmLocation>>(){});

        return response.getBody();
    }

    public List<FilmLocation> findByTitle(String title)
    {
        List<FilmLocation> allFilmLocations = this.findAll();

        return allFilmLocations.stream()
                .filter(fl -> fl.getLocations() != null && fl.getTitle().contains(title)).collect(Collectors.toList());
    }

    public List<FilmLocation> findByLocation(String location)
    {
        List<FilmLocation> allFilmLocations = this.findAll();

        return allFilmLocations.stream()
                .filter(fl -> fl.getLocations() != null && fl.getLocations().contains(location)).collect(Collectors.toList());
    }
}
