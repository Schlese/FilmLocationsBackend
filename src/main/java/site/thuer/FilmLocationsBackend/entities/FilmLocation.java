package site.thuer.FilmLocationsBackend.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FilmLocation
{

    private String title;

    private String locations;

    public FilmLocation()
    {}

    public FilmLocation(String title, String locations)
    {
        super();
        this.title = title;
        this.locations = locations;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }
}

