import nodemailer from "nodemailer";

let transporter = nodemailer.createTransport({
  service: "gmail",
  auth: {
    user: "alpaca623@gmail.com",
    pass: "xptmxmapdlf"
  }
});

transporter.sendMail(
  {
    from: "alpaca623@gmail.com",
    to: "alpaca023@gmail.com",
    subject: "testing mail transfer",
    text: "메일 전송 테스트"
  },
  function(error, info) {
    if (error) {
      console.log(error);
    } else {
      console.log("Success Send Email", info.response);
    }
  }
);
