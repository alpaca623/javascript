import express from "express";
import path from "path";
import "./db";
import movieRouter from "./movieRouter";

const app = express();
app.set("view engine", "pug");
app.set("views", path.join(__dirname, "views"));
app.use((req, res, next) => {
  if (req.originalUrl === "/favicon.ico") {
    res.status(204).json({ nope: true });
  } else {
    next();
  }
});
app.use("/", movieRouter);

app.listen(4032, () => console.log("✅ open server!!"));
