import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  constructor() { }

  tasks: any [] = [];

  sendData() {
   return this.tasks;
  }
}
