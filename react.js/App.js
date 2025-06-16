import logo from './logo.svg';
import './App.css';
import Form from'./Form.js';
import Sviet from'./Sviet.js';
function App() {
  return (
    <div className="App">
      <header className="App-header">
        <img src="https://tse4.mm.bing.net/th?id=OIP.JYcXOWXa2DiEF_fGMwx25gHaHa&pid=Api&P=0&h=180" className="App-logo" alt="logo" />
        <p>
          Sri vasavi Institute of Engineering and Techonology
        </p>
        <a
          className="App-link"
          href="https://reactjs.org"
          target="_blank"
          rel="noopener noreferrer"
        >
          sviet website
        </a>
        <Form/>
        <Sviet title ="Empowerd minds"/>
      </header>
    </div>
  );
}

export default App;
