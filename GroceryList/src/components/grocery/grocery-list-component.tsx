import React, { Component } from 'react'
import { listenerCount } from 'cluster';


export default class GroceryList extends Component {
state = {
        items: [
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
        return this.props..map((item) +> (
            <h3>{  }</h3>
        ))
    }
}