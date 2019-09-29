import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {

  bikeData:any = '';
  bikes = [
            {
              brand : 'KTM',
              img : 'https://cdn.pixabay.com/photo/2017/08/13/13/14/motorcycle-2637088__340.jpg' ,
              description : 'KTM AG (the former KTM Sportmotorcycle AG) is an Austrian motorcycle and sports car manufacturer owned by KTM Industries AG and Indian manufacturer Bajaj Auto. It was formed in 1992 but traces its foundation to as early as 1934.'

            },
            {
              brand : 'Royal Enfield',
              img : 'https://cdn.pixabay.com/photo/2018/07/01/11/42/royal-enfield-3509231__340.jpg',
              description : 'Royal Enfield, as it is known today, is an Indian motorcycle manufacturing company based in Chennai. Known for its rich heritage and history, Royal Enfield is the oldest motorcycle brand to be in continuous production, with the first motorcycle manufactured in 1901. Originally a British motorcycle company	first established in 1893, which later on became the indigenous Madras Motors in 1955. In 1990, Royal Enfield collaborated with the Eicher Group, an automotive company in India and merged with it in 1994'
            },
            {
              brand : 'Honda Hornet',
              img : 'https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg' ,
              description : 'From the rear, the CB Hornet 160R is a looker, thanks to the X-shaped LED tail light and chunky rear tyre. The Honda CB Hornet 160R is powered by a 162.71cc air-cooled, single-cylinder engine with a maximum power output of 15.04bhp at 8,500rpm and a peak torque output of 14.76Nm at 6,500rpm.'
            },
            {
              brand : 'TVS Apache 180',
              img : 'https://cdn.pixabay.com/photo/2016/09/23/21/08/motorcycle-1690452__340.jpg' ,
              description : 'The 177.4cc, single-cylinder, 4-stroke motor generates a maximum output of 17.5PS of power and 15.5Nm of torque. The power is transferred to the rear wheel via a five-speed gearbox. The RTR 180 has a fuel capacity of 16 litres and weighs in at 139kg'
            
            },
            {
              brand : 'Yamaha RX100',
              description : 'Yamaha Motor made its initial foray into India in 1985 as a joint-venture. In August 2001, it became a 100% subsidiary of Yamaha Motor Co., Ltd, Japan (YMC). ... IYMs manufacturing facilities comprise of 3 State-of-the-art Plants at Surajpur (Uttar Pradesh), Faridabad (Haryana)' ,
              img : 'https://cdn.pixabay.com/photo/2018/02/12/02/05/motorcycle-3147278__340.jpg'
            },
            {
              brand : 'Pulser',
              description : 'The Bajaj Pulsar 150 is powered by a 149.5 cc air-cooled engine which produces of power. It has a fuel tank of 15 L and a claimed mileage of 65kmpl. The Bajaj Pulsar 150 starts at Rs 68,250 and goes up to Rs 88,838 (ex-showroom, Delhi).' ,
              img : 'https://cdn.pixabay.com/photo/2019/03/24/22/03/traffic-4078819__340.jpg'
            }
  ]




  constructor() { }

  sendBike(bike){
    this.bikeData = bike;

  }

  ngOnInit() {
  }

}
