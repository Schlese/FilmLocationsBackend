# Get All Filmlocations

Get all Filmlocations in San Francisco starting from 1924.

**URL** : `/filmLocations/`

**Method** : `GET`

**Auth required** : NO

**Permissions required** : None

## Success Response

**Code** : `200 OK`

**Content examples**

A list of all film locations where each entry has a title and locations value.

```json
{
    "filmLocations": [
        {
          "title": "180",
          "locations": "555 Market St."
        },
        {
          "title": "24 Hours on Craigslist",
          "locations": null
        },
        {
          "title": "A Night Full of Rain",
          "locations": "Embarcadero Freeway"
        }
    ]
}
```