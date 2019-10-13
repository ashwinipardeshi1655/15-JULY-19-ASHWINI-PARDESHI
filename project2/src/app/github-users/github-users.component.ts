import { Component, OnInit } from '@angular/core';
import { UserService } from '../users/user.service';

@Component({
  selector: 'app-github-users',
  templateUrl: './github-users.component.html',
  styleUrls: ['./github-users.component.css']
})
export class GithubUsersComponent implements OnInit {

  constructor( private service : UserService ) { }

  users : any[] = [];

  ngOnInit() {
  this.service.getData().subscribe(resData => {
    this.users = resData;
    console.log(this.users);
  }, err => {
    console.log(err);
  })
  }
  deleteData(id){
      this.users.splice(id+1 , 1);
  }

}
