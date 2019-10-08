import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';


import { AppComponent } from './app.component';
import { CarsComponent } from './cars/cars.component';
import { CarDetailsComponent } from './car-details/car-details.component';
import { MobileComponent } from './mobile/mobile.component';
import { MobileDetailsComponent } from './mobile-details/mobile-details.component';
import { NewsComponent } from './news/news.component';
import { NewsDetailsComponent } from './news-details/news-details.component';
import { MainComponent } from './main/main.component';
import { HeaderBatmyaComponent } from './header-batmya/header-batmya.component';
import { SportsComponent } from './sports/sports.component';

@NgModule({
  declarations: [
    AppComponent,
    CarsComponent,
    CarDetailsComponent,
    MobileComponent,
    MobileDetailsComponent,
    NewsComponent,
    NewsDetailsComponent,
    MainComponent,
    HeaderBatmyaComponent,
    SportsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path: '',component:CarsComponent},
      {path: 'mobile',component:MobileComponent},
      {path: 'news',component:NewsComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
