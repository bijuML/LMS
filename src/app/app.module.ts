import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { LMSComponent } from './lms/lms.component';
import { ReactiveFormsModule } from '@angular/forms';
import { MatSelectModule } from '@angular/material'
import { DataTablesModule } from 'angular-datatables';
import { DragDropModule } from '@angular/cdk/drag-drop';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatButtonModule, MatCheckboxModule } from '@angular/material';
import { dataService } from './service/data.service';
import { ScrollingModule } from '@angular/cdk/scrolling';
import { MatDialogModule } from '@angular/material';
import { AngularFontAwesomeModule } from 'angular-font-awesome';
import { MatRadioModule } from '@angular/material/radio';
import { Ng4LoadingSpinnerModule } from 'ng4-loading-spinner';
import { MatTooltipModule } from '@angular/material/tooltip';
import { MatTabsModule } from '@angular/material/tabs';
import { MatExpansionModule } from '@angular/material/expansion';
import { MatProgressButtonsModule } from 'mat-progress-buttons';
import { MatToolbarModule } from '@angular/material/toolbar';
import { MatSnackBarModule } from '@angular/material/snack-bar';
import {
    MatTableModule,
} from '@angular/material';


@NgModule( {

    exports: [MatButtonModule,
        MatCheckboxModule,
        MatDialogModule,
        MatSelectModule,
        MatTableModule,
        DragDropModule,
        AngularFontAwesomeModule,
        MatRadioModule,
        MatTabsModule,
        MatExpansionModule,
        MatSnackBarModule,
    ],
    imports: [MatTableModule,
        MatDialogModule,
        BrowserAnimationsModule,
        HttpClientModule,
        MatButtonModule,
        MatDialogModule,
        MatTableModule,
        MatTooltipModule,
        MatToolbarModule
    ],


} )

export class MaterialModule { }

@NgModule( {
    declarations: [
        AppComponent,
        LMSComponent,
    ],
    imports: [
        BrowserModule,
        ReactiveFormsModule,
        HttpClientModule,
        FormsModule,
        AppRoutingModule,
        DataTablesModule,
        MaterialModule,
        BrowserAnimationsModule,
        Ng4LoadingSpinnerModule.forRoot(),
        ScrollingModule,
        MatTooltipModule,
        MatProgressButtonsModule.forRoot(),
        MatToolbarModule
    ],

    entryComponents: [],

    providers: [dataService],
    bootstrap: [AppComponent]
} )
export class AppModule { }
