import Main from './Main';
import { counterStore } from './ExampleReduxToolkit/Counter/CounterStore';
import { Provider } from 'react-redux';

function App() {
  return (

    <div className='alert alert-light'>
      <Provider store = {counterStore}>
      <Main/>
      </Provider>
     
      <Main />
    </div>

  );
}

export default App;