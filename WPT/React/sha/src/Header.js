export function Header(props)
{

    console.log(props)
    // props.show();
    return(
        <div>
            <div className="alert alert-success">
                <strong>This is Header {props.person.name}-{props.person.age}</strong>
                {/* <strong>Names {props.names[0]}-{props.names[1]}-{props.names[2]}</strong> */}

                <h1>Names</h1>

                    <ul>
                        {props.names.map(function(p)
                        {
                            return(
                                <li key={p.name}>{p.name}-{p.age}-{p.mobile}</li>
                            )
                        })}
                    </ul>


                <button onClick={props.showDetails}>Show</button>
            </div>
        </div>


    );
}