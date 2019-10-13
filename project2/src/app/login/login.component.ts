import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service : UserService) { }


  sendData(loginForm) {
    console.log(loginForm.value);
    this.service.custom.push(loginForm.value);
    console.log(this.service.custom);
  }

  ngOnInit() {
  }

}
