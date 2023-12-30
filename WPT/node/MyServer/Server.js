const http = require("http")

const server = http.createServer((request, response)=>
{
    response.writeHead(200, {"Content-type":"text/plain"})

    response.end("<h1>this is response from server..............</h1>")
})

const port = 3000
const host = "127.0.0.1"    
server.listen(port, host, ()=>{
    console.log(`Server Started on http://${host}:${port}`)
})