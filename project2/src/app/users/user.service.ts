import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor( private http: HttpClient ) {}            

  url = "https://api.github.com/users";                              //copied api from github.com
   
  getData() {
      return this.http.get<any>(this.url).pipe(map(data => {         
        let newArray : any[] = [];                                  //created new array to push the data
        for(let i in data) {
          newArray.push(data[i] )                                    //pushing the data in array
        }
        return newArray;
      }, err => {
        console.log(err);
      }))
    }

    deleteData(id) {
      return this.http.delete(`${this.url}/${id}`);
    }

   }


