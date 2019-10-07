import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-edit-task',
  templateUrl: './edit-task.component.html',
  styleUrls: ['./edit-task.component.css']
})
export class EditTaskComponent implements OnInit {

  constructor( private service: TaskserviceService , private router: Router ) { }

  deleteTask(task) {
    this.service.deleteData(task).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('/showtask');
    });
  }

  updateTask(task) {
    this.service.updateData(task).subscribe(data => {
      console.log(data);
      this.router.navigateByUrl('/showtask');
    });
  }

  ngOnInit() {
    this.service.getData();
  }

}
