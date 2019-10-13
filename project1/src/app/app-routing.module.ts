import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { AboutComponent } from './about/about.component';
import { UsersComponent } from './users/users.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';


const routes: Routes = [
  { path: '' , component: HomeComponent },                      //giving path for home component
  { path: 'about' , component: AboutComponent },                //giving path for about component
  { path: 'register' , component: RegisterComponent},           //giving path for register component
  { path: 'users' , component: UsersComponent },                //giving path for users component
  { path: '**' , component: PagenotfoundComponent }   //giving path for pagenotfound component
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
