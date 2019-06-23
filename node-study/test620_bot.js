import axios from "axios";
import dotenv from "dotenv";

dotenv.config();

const instance = axios.create({
  baseURL: process.env.TELEGRAM_URL
});

const requestTelegramBot = async () => {
  try {
    await instance.get("/getMe").then(o => {
      console.log(o);
    });
  } catch (e) {
    console.log(e);
  }
};

requestTelegramBot();
