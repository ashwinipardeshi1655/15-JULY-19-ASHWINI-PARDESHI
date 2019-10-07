import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class TaskserviceService {

  constructor( private http: HttpClient ) { }

  taskInfo: any[] = [];

  sendData(data) {
    return this.http.post('http://localhost:8082/task/add', data);
  }

  getData() {
    return this.http.get('http://localhost:8082/task/get-all').subscribe(data => {
      this.taskInfo = data.tasks;
      console.log(this.taskInfo);
    }, err => {
       console.log(err);
    });
  }

  updateData(data) {
    return this.http.put('http://localhost:8082/task/modify', data);
  }

  deleteData(data) {
    return this.http.delete(`http://localhost:8082/task/remove/${data}`);
  }

}
