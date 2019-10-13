import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { LogindetailsComponent } from './logindetails/logindetails.component';


const routes: Routes = [
  { path: '' , component: LoginComponent },
  { path: 'logindetails', component: LogindetailsComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
