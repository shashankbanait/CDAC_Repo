import { useState } from "react";
import {ChildComponent} from "./ChildComp";
export const ChangeColor = () => {

    const [color, setColor] = useState("");
    return(
        <>
            <input type="text" value={color} onChange={function(event){setChange(event.target.value)}}/>
            <div style={{height: '300px'}}>

            </div>
        </>
    )
}