import { useState } from "react"
export const TableComp = () => {
    const [num, setNum] = useState(0)
    const [table, setTable] = useState("")

    const showTable = () => {
        let str = ""
        for (let i = 1; i <=10; i++) {
            // setTable(`${table}<br>${num}x${i}=${num*i}`);
            str += `\n${num}x${i}=${num * i}`;
        }
        setTable(str)
    }

    return (
        <>
            <input type="number" value={num} onChange={function (event) { setNum(event.target.value) }}></input>
            <button onClick={showTable}>Show Table</button>

            <div style={{whiteSpace:"pre-line"}}>{table}</div>
        </>
    )
}

