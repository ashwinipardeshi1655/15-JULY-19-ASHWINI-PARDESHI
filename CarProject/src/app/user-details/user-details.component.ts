import { Component, OnInit } from '@angular/core';
import { CarsService } from '../cars.service';
import { Router } from '@angular/router';


@Component({
  selector: 'app-user-details',
  templateUrl: './user-details.component.html',
  styleUrls: ['./user-details.component.css']
})
export class UserDetailsComponent implements OnInit {
  constructor(private carsService : CarsService, private router : Router) { }
  updateCar(car){
    this.carsService.selectedCars=car;
    this.router.navigateByUrl('/form');
  }
  deleteCar(car){
    this.carsService.deleteData(car).subscribe(resData=>{
      console.log(resData);
      this.carsService.getData();
    });  
  }
  ngOnInit() {
    this.carsService.getData();
    console.log(this.carsService.cars);
  }

}
