import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { LMSComponent } from './lms/lms.component';
const routes: Routes = [
    { path: '', redirectTo: '/', pathMatch: 'full' },
    { path: 'lms', component: LMSComponent },
];

@NgModule( {
    imports: [RouterModule.forRoot( routes )],
    exports: [RouterModule]
} )
export class AppRoutingModule { }
