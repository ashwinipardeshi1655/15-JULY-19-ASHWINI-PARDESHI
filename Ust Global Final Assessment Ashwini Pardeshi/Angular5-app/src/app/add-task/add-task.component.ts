import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-add-task',
  templateUrl: './add-task.component.html',
  styleUrls: ['./add-task.component.css']
})
export class AddTaskComponent implements OnInit {

  constructor(private service: TaskserviceService , private router: Router) { }

  sendData(taskForm: NgForm) {
    this.service.sendData(taskForm.value).subscribe(data => {
      console.log(data);
      taskForm.reset();
      this.router.navigateByUrl('/showtask');
    });
  }

  ngOnInit() {
  }

}
