import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-directive',
  templateUrl: './directive.component.html',
  styleUrls: ['./directive.component.css']
})
export class DirectiveComponent implements OnInit {
  condition = false;

users=[
  {
    id: 1,
    name: 'Ashwini',
    city: 'bangalore'
  },
  {
    id: 2,
    name: 'Asmita',
    city: 'mumbai',
  },
  {
    id: 3,
    name: 'Dipika',
    city: 'hyderabad',
  },
  {
    id: 4,
    name: 'Ankita',
    city: 'Pune',
  }
]

  constructor() {  }

  removeUser(user){
    let index = this.users.indexOf(user)
    this.users.splice(index,1)
    this.condition = true
  }

  refreshUser(){
    this.condition= false;
  }

  ngOnInit() {
  }

}
