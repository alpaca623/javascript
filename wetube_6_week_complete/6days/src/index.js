import express from "express";
import path from "path";
import morgan from "morgan";
import router from "./routers/router";
import localMiddleware from "./localMiddleware";

const app = express();
app.set("view engine", "pug");
app.set("views", path.join(__dirname, "views"));

// Add your magic here!
app.use(morgan("dev"));
app.use(localMiddleware);

app.use("/", router);

// Codesanbox does not need PORT :)
app.listen(() => console.log(`Listening!`));
