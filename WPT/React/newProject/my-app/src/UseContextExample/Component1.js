import { Component2With } from "./Component2With";
import { createContext, useState } from "react";
 
export const NameContext = createContext();
 
export const Component1With=()=>{
    const[name,setName]=useState("Harsheet");
    return(
        <NameContext.Provider value={name}>
            <h1>Component 1 With</h1>  
            <Component2With /*name={name}*/ />
        </NameContext.Provider>
    );
}