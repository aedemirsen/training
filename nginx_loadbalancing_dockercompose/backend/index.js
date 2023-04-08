const express = require("express")

const app = express()

app.get("/", (req,res) => {
    res.send("This is the server's response...")
    console.log("X")
})

app.listen(5050,() => {
    console.log("Listening...")
})