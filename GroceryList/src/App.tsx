import React, { Component } from 'react';
import './App.scss';
import GroceryList from './components/grocery/grocery-list-component';
import Todos from './components/grocery/grocery-list-component';

class App extends Component {
  state = {
    todos: [
      {
        id: 1,
        title: 'Carrot',
        completed: false
      },
      {
        id: 2,
        title: 'Carrot',
        completed: false
      },
      {
        id: 3,
        title: 'Carrot',
        completed: false
      },
    ]
  }
  render() {
    return (
      < div className="App" >
        <GroceryList todos= {this.state.todos} />
      </div >

    );
  }
}

export default App;
