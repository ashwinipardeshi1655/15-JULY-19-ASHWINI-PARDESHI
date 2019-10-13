import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';               //importing NgForm from '@angular/forms'

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor() { }

  registerData(form){                   //this is a method for submit button
    console.log(form.value);
    form.reset();
  }

  ngOnInit() {
  }

}
