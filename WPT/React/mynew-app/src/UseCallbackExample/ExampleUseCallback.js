import { useCallback, useEffect } from "react"

export const ExampleUseCallback=()=>
{
    const [count, setCount] = useState(0)
    

    const printValue=useCallback(function(){
        console.log("useCallback run...")
    },[count])

    useEffect(function(){
        console.log("Count="+count)
        console.log("new copy of printvalue creted by useCallback useEffect run...")    // jab increment ho rha hai tab chal rha hai
    })

    return(<>
        <button onClick={printValue}>Print Value</button>
        <button onClick={()=>setCount(count+1)}>Increment Count</button>

    </>)
}