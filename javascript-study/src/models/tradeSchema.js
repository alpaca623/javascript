import mongoose from "mongoose";

const tradeSchema = mongoose.Schema({
  tradeNumber: {
    type: Number,
    required: "tradeNumber is required"
  },
  userId: {
    type: String,
    required: "userId is required"
  },
  price: {
    type: Number,
    required: "is required"
  },
  amount: {
    type: Number,
    required: "is required"
  },
  createTime: {
    type: Date,
    required: "is required",
    default: Date.now
  },
  priceType: {
    type: Boolean,
    required: "is required"
  }
});

const model = mongoose.model(tradeSchema);

export default model;
