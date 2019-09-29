import { Component } from '@angular/core';

@Component({
  selector: 'app-data-binding',
  templateUrl: './data-binding.component.html',
  styleUrls: ['./data-binding.component.css']
})
export class DataBindingComponent {
  redColor = true;
  name = "Ashu";
  textClasses = 'bg-success text-white';
  paragraphStyle = 'pink';
  ternery = true;
  padding = '50px' ;
  columnsapn = 2;
  imgURL='https://cdn.pixabay.com/photo/2015/06/25/17/56/people-821624__340.jpg'

  constructor() {
    setTimeout(()=> {
      this.redColor=false;
      this.ternery=false;
    }, 5000);
   }


}
