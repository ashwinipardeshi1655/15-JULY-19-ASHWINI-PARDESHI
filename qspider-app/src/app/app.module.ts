import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { RouterModule } from '@angular/router';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { BusinessComponent } from './business/business.component';
import { EntertainmentComponent } from './entertainment/entertainment.component';
import { SportsComponent } from './sports/sports.component';
import { HomeComponent } from './home/home.component';
import { TechnologyComponent } from './technology/technology.component';
import { HealthComponent } from './health/health.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    BusinessComponent,
    EntertainmentComponent,
    SportsComponent,
    HomeComponent,
    TechnologyComponent,
    HealthComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: '', component: HomeComponent},
      {path: 'business', component: BusinessComponent},
      {path: 'entertainment', component: EntertainmentComponent},
      {path: 'sports', component: SportsComponent},
      {path: 'technology', component: TechnologyComponent}
    ])
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
