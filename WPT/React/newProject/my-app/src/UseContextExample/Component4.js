import { NameContext } from "./Component1With";
import { useContext } from "react";
export const Component4With=()=>{
    const name = useContext(NameContext);
    return(
        <>
            <div className="alert alert-danger">
                <h1>Component 4 With</h1>  
                <h2>Name is :{name}</h2>
            </div>

        </>
    );
}