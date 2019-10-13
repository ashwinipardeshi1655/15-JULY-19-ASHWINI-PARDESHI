import { Injectable } from '@angular/core';
import { Cars } from './cars';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class CarsService {

url: string = "https://angular-car-6b42f.firebaseio.com/";
selectedCars: Cars={
  brand: null,
  model: null,
  year: null,
  cost: null,
  nous: null
}

  constructor(private http:HttpClient) {}
  cars: any[] = [];
  
  
  getData()
{
  this.http.get(`${this.url}/cars.json`).pipe(map(resData=>{
    let carArray=[];
    for(let key in resData){
      carArray.push({...resData[key],id:key});
    }
    return carArray;
  })).subscribe(data=>{
    this.cars=data;
    console.log(data);
  },err=>{
    console.log(err)
  });
}
postData(data){
  return this.http.post(`${this.url}/cars.json`,data);
}
updateData(data){
  return this.http.put(`${this.url}/cars/${data.id}.json`,data);
}
deleteData(data){
return this.http.delete(`${this.url}/cars/${data.id}.json`);
}
ngOnInit(){

}
}
  
  

