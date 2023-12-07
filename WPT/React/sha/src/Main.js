import { Header } from "./Header";
import { Footer } from "./Footer";
import { Content } from "./Content";
function Main()
{
    function showDetails(){
        alert("Hello")
    }

    const person = {name:"Tirtesh", age:150};
    // const names = ["Umersh", "badboy", "badmash"]
    const names = [
        {name: "prabhu", age:"25", mobile:12345678},
        {name: "harshu", age:"24", mobile:21345678},
        {name: "milli", age:"23", mobile:31345678},
        {name: "sauru", age:"26", mobile:41345678},
        {name: "vaibu", age:"25", mobile:51345678},
    ]

    function printName(name){
        alert("Name: "+name)
    }

    return(
        <div>
            <Header person={person} showDetails={showDetails} names={names}/>
            <Content printName={printName}/>
            <Footer/>
        </div>
    )
}
export default Main