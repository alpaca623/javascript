import nodemailer from "nodemailer";

const message = {
  from: "alpaca623@gmail.com",
  to: "alpaca623@gmail.com",
  subject: "노드 smtp 메일 전송 테스트",
  text: "메일 전송 테스트"
};

let transport = nodemailer.createTransport({
  service: "gmail",
  auth: {
    user: "alpaca623@gmail.com",
    pass: "apdlfxptmxm!"
  }
});

transport.sendMail(message, (e, res) => {
  console.log(e || res);
});
