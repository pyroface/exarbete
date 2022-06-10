# Examensarbete

# Endoints and Test data
//POST
http://localhost:8080/movies
{
"id": 1,
"name": "The Batman",
"watched": true,
"rating": "7/10"
}
//GET
http://localhost:8080/movies

//POST
http://localhost:8080/watchlists
{
"id": 1,
"name": "action movies"
}
//GET
http://localhost:8080/watchlists
//ADD MOVIE TO WATCHLIST
http://localhost:8080/watchlists/1/movies/1

//POST
http://localhost:8080/users
{
"id": 1,
"name": "Leo"
}
//GET
http://localhost:8080/
//ADD USER TO WATCHLIST
http://localhost:8080/watchlists/1/users/1