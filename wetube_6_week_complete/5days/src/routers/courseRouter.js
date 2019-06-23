import express from "express";
import { routes } from "../routes";
import { courses_new, courses_mine } from "../controllers/courseController";
import { home } from "../controllers/globalController";

const courseRouter = express();

courseRouter.get(routes.home, home);
courseRouter.get(routes.courses_new, courses_new);
courseRouter.get(routes.courses_mine, courses_mine);

export default courseRouter;
