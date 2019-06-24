const localMiddleware = (req, res, next) => {
  const url = req.url.split("/")[1] === "" ? "home" : req.url.split("/")[1];
  res.locals.title = url;
  next();
};

export default localMiddleware;
