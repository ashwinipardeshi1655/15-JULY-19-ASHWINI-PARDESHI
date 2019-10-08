import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cars',
  templateUrl: './cars.component.html',
  styleUrls: ['./cars.component.css']
})
export class CarsComponent implements OnInit {

  carData: any ='';

  cars = [
            {
              brand : "BMW" ,
              image : "https://cdn.pixabay.com/photo/2015/05/15/14/46/bmw-768688_1280.jpg" ,
              description : "The new BMW i8 Roadster, showcased at the 2018 Indian Auto Expo in February, along with the facelifted i8 Coupe are expected to be launched in India by the end of 2018. ... It was priced at Rs 2.62 crore (ex-showroom India) when it was on sale in the country." 
            },
            {
              brand : "Audi" ,
              image : "https://cdn.pixabay.com/photo/2014/07/04/13/41/auto-383897__340.jpg" ,
              description : "Audi AG is a German automobile manufacturer that designs, engineers, produces, markets and distributes luxury vehicles. Audi is a member of the Volkswagen Group and has its roots at Ingolstadt, Bavaria, Germany. Audi-branded vehicles are produced in nine production facilities worldwide." 
            },
            {
              brand : "Mercedes" ,
              image : "https://cdn.pixabay.com/photo/2017/03/27/14/56/auto-2179220_1280.jpg" ,
              description : "It is a little funny that the name Mercedes, not Daimler or Maybach, became the face of the brand because although Emil Jellinek had a lot to do with what the brand has become, his daughter Mercedes had nothing to do with it! It makes you wonder what Gottlieb Daimler and Wilhelm Maybach would think about it." 
            },
            {
              brand : "Lamborgini" ,
              image : "https://cdn.pixabay.com/photo/2019/07/16/03/07/black-4340959__340.jpg" ,
              description : "Lamborghini Huracan Launched in India at a Price of ₹ 3.43 Crore. Automobili Lamborghini has launched the all-new Huracan in India and has priced it at ₹ 3.43 crore (ex-showroom, Delhi). The Huracan LP 610-4 is the replacement for the Gallardo and has already attracted around 1000 buyers worldwide in just two months." 
            },
            {
              brand : "Farari" ,
              image : "https://cdn.pixabay.com/photo/2017/03/02/06/03/photomanipulation-2110496__340.jpg" ,
              description : "Founded by Enzo Ferrari in 1939 out of Alfa Romeo's race division as Auto Avio Costruzioni, the company built its first car in 1940. However, the company's inception as an auto manufacturer is usually recognized in 1947, when the first Ferrari-badged car was completed." 
            },
            {
              brand : "Innova" ,
              image : "https://cdn.pixabay.com/photo/2016/12/03/18/57/amg-1880381__340.jpg" ,
              description : "It gets a few new features and a new interior colour option as well. Toyota Innova Crysta Price and Variant: Prices for the Toyota Innova Crysta start from Rs 14.83 lakh and go up to Rs 23.24 lakh (ex-showroom Delhi). The Toyota Innova Crysta is available in three variants" 
            }
          ]

  constructor() { }

  sendCar(car){
    this.carData = car;

  }
  ngOnInit() {
  }

}
