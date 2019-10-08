import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-business',
  templateUrl: './business.component.html',
  styleUrls: ['./business.component.css']
})
export class BusinessComponent implements OnInit {

  businessNews: any[]= [];
  constructor(private http: HttpClient) {
    http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=business&apiKey=8be33dabcded40a7a9ff93203693f6aa`)
    .subscribe(resData=> {
      this.businessNews=resData.articles;
      console.log(this.businessNews)
    })

   }

  ngOnInit() {
  }

}
