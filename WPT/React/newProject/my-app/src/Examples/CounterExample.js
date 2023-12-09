import { event } from 'jquery';
import React, { useReducer, useState } from 'react';

const reducer = (state, action) => {
    switch (action.type) {
        case 'inc':
            return { count: state.count + action.payload }
        // break
        case 'dec':
            return { count: state.count - action.payload }

        // break
    }
}

function CounterExample() {

    const [state, dispatch] = useReducer(reducer, { count: 0 })
    const [num,setNum]=useState(0)

    return (
        <>
        <input type='number' value={num} onChange={event=>setNum(parseInt(event.target.value))} ></input>
            <button onClick={() => dispatch({ type: "inc", payload:num })}>+
            </button>
            <h2>
                {state.count}
            </h2>
            <button onClick={() => dispatch({ type: "dec", payload:num })}>
                -
            </button>
        </>
    )
}

export default CounterExample

// ************************************************************************************************
// import { useReducer } from "react";

// const reducer = (state, action) => {
//   switch (action.type) {
//     case "inc":
//       return { count: state.count + 1 };

//     case "dec":
//       return { count: state.count - 1 };

//     default:
//       return state;
//   }
// };

// export const CounterExample = () => {
//   const [state, dispatch] = useReducer(reducer, { count: 0 });

//   return (
//     <div style={{ textAlign: "center", marginTop: "20px" }}>
//       <button
//         style={{ fontSize: "18px", padding: "8px 12px", marginRight: "10px", backgroundColor: "green"}}
//         onClick={() => dispatch({ type: "inc" })}
//       >
//         +
//       </button>
//       <h1 style={{ display: "inline-block", margin: "0 20px", fontSize: "24px"}}>
//         {state.count}
//       </h1>
//       <button
//         style={{ fontSize: "18px", padding: "8px 12px", backgroundColor: "red"}}
//         onClick={() => dispatch({ type: "dec" })}
//       >
//         -
//       </button>
//     </div>
//   );
// };
