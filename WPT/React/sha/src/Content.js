import { useState } from "react";


function addition(){
    setAdd(num1+num2)
}

export function Content(props) {
    const[name, setName] = useState("")
    const[num1, setNum1] = useState(0)
    const[num2, setNum2] = useState(0)
    const[add, setAdd] = useState(0)

    return (
        <div>
            <div className="alert alert-light" style={{
                height: "70vh",
                backgroundColor: "navy",
                color: "white"
            }}>

                <div className="alert alert-primary">
                    <input type="number" value={num1} onChange={function(event){
                        setNum1(parseInt(event.target.value))
                    }}/>
                    <input type="number" value={num2} onChange={function(event){
                        setNum2(parseInt(event.target.value))
                    }}/>

                    <button onClick={addition}>+</button> 

                    {/* <button className="btn btn-success" onClick={function(){
                        setAdd(num1+num2)
                    }}>+</button> */}

                    <h1>{add}</h1>

                </div>


                <p>
                    this is content
                    this is content
                    this is content
                    this is conten
                    this is content
                    this is content
                    this is content
                    this is content
                    this is content
                    this is content

                </p>
                <input type="text" value={name} onChange={function (event) {
                    setName(event.target.value)
                }} />

                <button className="btn btn-info" onClick={function () {
                    props.printName(name)
                }}>Your Name</button>

            </div>
        </div>


    )
}