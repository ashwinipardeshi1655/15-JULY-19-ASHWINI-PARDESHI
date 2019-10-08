import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class UserService {

  user: [
          {
            name: 'Ashwini',
            company: 'UST Global'
          },
          {
            name: 'Pranali',
            company: 'UST Global',
          },
          {
            name: 'Vignesh',
            company: 'UST Global'
          },
          {
            name: 'Chinmay',
            company: 'TestYanta'
          }
  ];

  constructor(private userservice: UserService ) {
    printDetails() {
      console.log('service is working');
    }
   }
}
