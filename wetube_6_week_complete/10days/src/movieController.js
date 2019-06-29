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
  // const { params } = Object.keys(req.query);
  let key = Object.keys(req.query);
  let param;
  let movies = {};
  if (key[0] === "year") {
    param = req.query["year"];
  }
  if (key[0] === "rating") {
    param = req.query["rating"];
  }
  movies = getMovieByMinimumYear(param);
  res.render("home", { movies });
};
