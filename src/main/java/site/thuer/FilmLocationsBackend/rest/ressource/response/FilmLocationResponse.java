package site.thuer.FilmLocationsBackend.rest.ressource.response;

import site.thuer.FilmLocationsBackend.entities.FilmLocation;

import java.util.List;

public class FilmLocationResponse
{
    private List<FilmLocation> filmLocations;

    public List<FilmLocation> getFilmLocations() {
        return filmLocations;
    }

    public void setFilmLocations(List<FilmLocation> filmLocations) {
        this.filmLocations = filmLocations;
    }
}
