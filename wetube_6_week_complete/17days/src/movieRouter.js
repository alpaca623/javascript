import express from "express";
import {
  getHome,
  getSearch,
  getCreate,
  getEdit,
  getDelete,
  getDetail,
  postCreate
} from "./movieController";

const movieRouter = express.Router();

// Add your magic here!
movieRouter.get("/", getHome);
movieRouter.get("/search/:param", getSearch);
movieRouter.get("/create", getCreate);
movieRouter.post("/create", postCreate);
movieRouter.get("/:id", getDetail);
movieRouter.get("/:id/edit", getEdit);
movieRouter.get("/:id/delete", getDelete);

export default movieRouter;
