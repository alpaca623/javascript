import express from "express";
import {
  profileController,
  homeController,
  loginController,
  photosController
} from "../controllers/controller";

const router = express.Router();

router.get("/", homeController);
router.get("/login", loginController);
router.get("/photos", photosController);
router.get("/profile", profileController);

export default router;
