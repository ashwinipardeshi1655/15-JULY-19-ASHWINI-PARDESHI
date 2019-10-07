import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AddTaskComponent } from './add-task/add-task.component';
import { EditTaskComponent } from './edit-task/edit-task.component';
import { ShowAllTaskComponent } from './show-all-task/show-all-task.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';


const routes: Routes = [
  {path: '' , component: AddTaskComponent },
  {path: 'edittask' , component: EditTaskComponent },
  {path: 'showtask' , component: ShowAllTaskComponent },
  {path: '**' , component: PagenotfoundComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
