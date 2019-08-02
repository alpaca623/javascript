import mongoose from "mongoose";

const db = mongoose.connection;

db.on("error", e => console.log(e));
db.once("open", () => {
  console.log("▶ mongodb open!");
});

mongoose.connect("mongodb:///localhost:27017/tradeList", { useNewUrlParser: true });
