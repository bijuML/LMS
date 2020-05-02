import { Component, OnDestroy } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { dataService } from './service/data.service';
import { Ng4LoadingSpinnerService } from "ng4-loading-spinner";
import { Router } from "@angular/router";
import { OnInit } from "@angular/core";
import { ViewChild } from "@angular/core";
import { ElementRef } from "@angular/core";
import * as html2canvas from "html2canvas"
import { MatDialogRef } from "@angular/material/dialog";
import { MatDialog } from "@angular/material/dialog";
import { MatSnackBar } from '@angular/material/snack-bar';
@Component( {
    selector: 'app-root',
    templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
} )
export class AppComponent implements OnInit {
    constructor() {
    }

    ngOnInit(): void {
    }
}