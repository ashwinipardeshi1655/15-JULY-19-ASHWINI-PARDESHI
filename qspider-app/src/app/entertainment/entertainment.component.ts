import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-entertainment',
  templateUrl: './entertainment.component.html',
  styleUrls: ['./entertainment.component.css']
})
export class EntertainmentComponent implements OnInit {

  entertainmentNews: any[]= [];
  constructor(private http: HttpClient) {
    http.get<any>('https://newsapi.org/v2/top-headlines?country=in&category=entertainment&apiKey=8be33dabcded40a7a9ff93203693f6aa')
    .subscribe(resData=> {
      this.entertainmentNews=resData.articles;
      console.log(this.entertainmentNews)
    })
   }

  ngOnInit() {
  }

}
