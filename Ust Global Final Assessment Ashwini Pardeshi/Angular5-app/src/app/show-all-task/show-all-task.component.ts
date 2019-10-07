import { Component, OnInit } from '@angular/core';
import { TaskserviceService } from '../taskservice.service';

@Component({
  selector: 'app-show-all-task',
  templateUrl: './show-all-task.component.html',
  styleUrls: ['./show-all-task.component.css']
})
export class ShowAllTaskComponent implements OnInit {

  constructor(private service: TaskserviceService) { }

  ngOnInit() {
    this.service.getData();
  }

}
