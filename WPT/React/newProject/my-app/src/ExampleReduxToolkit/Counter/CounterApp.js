import { increment, decrement } from "./CounterSlicer";
import { useSelector, useDispatch } from "react-redux";
export const CounterApp = () =>
{
    const dispatch=useDispatch()
    const count = useSelector((state)=>state.counter)
    return(
        <>
            <button onClick={()=>dispatch(increment())}>+</button>
            <h2>{count}</h2>
            <button onClick={()=>dispatch(decrement())}>-</button>
        </>
    )
}