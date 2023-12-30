const { createServer } = require("http");

const http = createServer((request, response)=>
{
    console.log(request.url)
    if(request.url==="/"){
        response.end("<h1>This is Root url response.....</h1>")
    }
    else if(request.url==="/about"){
        response.end("<h1>This is /about url response.....</h>")
    }
    else if(request.url==="/contact"){
        response.end("<h1>This is /contact url response.....</h>")
    }
}) 

http.listen(3000, "127.0.0.1", ()=>{
    console.log(`Server started on http://127.0.0.1`)
})