const Http=require('http');

const s1=Http.createServer((req,res)=>{
    if(req.url=='/'){
        res.writeHead(200,{'content_type':'text/html'});
        res.write('<div>UserName:<input type:"text" placeholder="username"></div><div>Password:<input type:"password" placeholder="password"></div>');
        res.end();

    }
})

const PORT =process.env.PORT||5000;
s1.listen(PORT,()=>console.log("server is running on port${PORT}"));

