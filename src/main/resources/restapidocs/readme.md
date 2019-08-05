# Film Locations in San Francisco
REST-Service Server which provides a listing of filming locations of movies shot in San Francisco starting from 1924. 
The server is accessing the data via the The Socrata Open Data API (SODA) which provides programmatic access to this dataset.

SODA API URI: https://data.sfgov.org/resource/wwmu-gmzc.json



## Open Endpoints
Open endpoints require no Authentication.

* [All FilmLocations](filmLocations.md) : `GET /filmLocations/`
* [Search](search.md) : `GET /filmLocations/search`