import { Component, OnInit, ViewChild } from '@angular/core';
import { FormGroup, FormBuilder, Validators } from "@angular/forms";
import { HttpClient } from "@angular/common/http";
import { Ng4LoadingSpinnerService } from "ng4-loading-spinner";
import { MatTableDataSource } from '@angular/material/table';
import { Library } from '../entity/Library';
import { Book } from '../entity/Book';
import { Router } from "@angular/router";


@Component( {
    templateUrl: 'lms.component.html',
    styleUrls: ['./lms.component.css'],
} )

export class LMSComponent implements OnInit {
    displayedColumns: string[] = ['libraryName', 'librarianName', 'libraryPhone', 'action'];
    dataSource = new MatTableDataSource<Library>();
    bookTableShow = false;

    bookColumns: string[] = ['bookTitle', 'bookISBN', 'bookAuthor'];
    bookDatasource = new MatTableDataSource<Book>();
    constructor( private router: Router, private http: HttpClient, private spinnerService: Ng4LoadingSpinnerService ) { }

    ngOnInit() {
        this.spinnerService.show();
        this.http.get( 'http://localhost:8080/getAllLibs' ).subscribe(( data: any[] ) => {
            this.spinnerService.show();
            this.dataSource.data = data;
            console.log( "library table has records-->" + this.dataSource.data.length );
            this.spinnerService.hide();
        } );
    }

    getBooks( lib: any ) {
        this.spinnerService.show();
        this.bookDatasource.data = lib.books;
        this.spinnerService.hide();
        this.bookTableShow = true;
    }
}