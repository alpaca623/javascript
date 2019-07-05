export const localsMiddleware = (req, res, next) => {
  res.locals.siteTitle = "alpaca Movies";
  res.locals.routes = id => `/${id}`;
  next();
};
