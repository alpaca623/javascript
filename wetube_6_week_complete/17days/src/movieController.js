/*
You DONT have to import the Movie with your username.
Because it's a default export we can nickname it whatever we want.
So import Movie from "./models"; will work!
You can do Movie.find() or whatever you need like normal!
*/
import Movie from "./models/Movie";

// Add your magic here!

export const getHome = async (req, res) => {
  try {
    const movies = await Movie.find({});
    res.render("home", { movies });
  } catch (e) {
    console.log("error", e);
    res.status(404);
  }
};

export const getCreate = (req, res) => {
  res.render("createMovie");
};

export const postCreate = (req, res) => {
  const { title, year, rating, synopsis, genresArray } = req.body;
  let genres = [];
  if (genresArray.indexOf(",")) {
    genres = genresArray.split(",").map(genre => genre.trim());
  } else {
    genres = genresArray.trim();
  }
  console.log(title, year, rating, synopsis, genres);
  try {
    Movie.create({
      title,
      year,
      rating,
      synopsis,
      genres
    });
    // res.json(addMovieResult);
    res.redirect("/");
  } catch (e) {
    console.log(e);
  }
};

export const getSearch = (req, res) => {};

export const getEdit = async (req, res) => {
  const { id } = req.params;
  let movie = await Movie.findById(id);
  console.log(movie);
  movie.genres = movie.genres;
  console.log(movie.genres);
  res.render("editMovie", { movie });
};

export const getDelete = async (req, res) => {
  const { id } = req.params;
  try {
    await Movie.deleteOne({ _id: id });
    res.redirect("/");
  } catch (e) {
    console.log(e);
  }
};

export const getDetail = async (req, res) => {
  try {
    const { id } = req.params;
    const movie = await Movie.findById(id);
    console.log(movie);
    res.render("detailMovie", { movie });
  } catch (e) {
    console.log(e);
  }
  // const = req.query;
};
