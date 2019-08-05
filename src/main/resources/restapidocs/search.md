# Get Filtered Filmlocations

Get a filter list of Filmlocations in San Francisco starting from 1924. The locations
can be filtered by the title or the locations.

**URL** : `/filmLocations/search`

**URL Parameters** : 
* `title=[string]` where `title` is used to filter the filmlocations based on their title.
* `location=[string]` where `location` is used to filter the filmlocations based on their locations.

**Method** : `GET`

**Auth required** : NO

**Permissions required** : None

## Success Response

**Code** : `200 OK`

**Content examples**

For a title filter of "18" the server is returning a list of filmlocations which are containing
"18" in their title. Each entry has a title and locations value.

```json
{
    "filmLocations": [
        {
            "title": "180",
            "locations": "Epic Roasthouse (399 Embarcadero)"
        },
        {
            "title": "180",
            "locations": "Mason & California Streets (Nob Hill)"
        },
        {
            "title": "180",
            "locations": "Justin Herman Plaza"
        }
    ]
}
```