import {
  getMovieById,
  getMovies,
  getMovieByMinimumRating,
  getMovieByMinimumYear
} from "./db";

export const home = async (req, res) => {
  const movies = await getMovies();
  res.render("home", { movies });
  // res.send(movies);
};
export const movieDetail = async (req, res, next) => {
  const {
    params: { id }
  } = req;
  if (id === "filter") {
    next();
  } else {
    const movie = await getMovieById(id);
    res.render("detail", { movie });
  }
};
export const filterMovie = (req, res) => {
  const {
    query: { year, rating }
  } = req;
  let data = "";
  if (year) {
    data = year;
  }
  if (rating) {
    data = rating;
  }
  const movies = getMovieByMinimumYear(data);
  res.render("home", { movies });
};
