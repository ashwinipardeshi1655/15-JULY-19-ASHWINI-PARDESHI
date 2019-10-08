import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-technology',
  templateUrl: './technology.component.html',
  styleUrls: ['./technology.component.css']
})
export class TechnologyComponent implements OnInit {

  technologyNews: any[]= [];
  constructor(private http: HttpClient) {
    http.get<any>(`https://newsapi.org/v2/top-headlines?country=in&category=technology&apiKey=8be33dabcded40a7a9ff93203693f6aa`)
    .subscribe(resData=> {
      this.technologyNews=resData.articles;
      console.log(this.technologyNews)

    })
   }

  ngOnInit() {
  }

}
