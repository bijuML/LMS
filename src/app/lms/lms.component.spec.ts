/*import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { Component, OnInit, ViewChild } from '@angular/core';
import { HttpClient, HttpHandler } from "@angular/common/http";
import { RouterTestingModule } from '@angular/router/testing';
import { Ng4LoadingSpinnerService } from "ng4-loading-spinner";
import { MatTableDataSource } from '@angular/material/table';
import { LMSComponent } from './lms.component';
import { Library } from '../entity/Library';
import { Book } from '../entity/Book';
import { } from 'jasmine';



describe( 'LMSComponent', () => {
    let component: LMSComponent;
    let fixture: ComponentFixture<LMSComponent>;

    beforeEach( async(() => {
        TestBed.configureTestingModule( {
            declarations: [LMSComponent],
            providers: [Ng4LoadingSpinnerService, HttpClient, HttpHandler]
        } )
            .compileComponents();
    } ) );

    beforeEach(() => {
        fixture = TestBed.createComponent( LMSComponent );
        component = fixture.componentInstance;
        component.dataSource.data = [
                                {
                                    "id": 1,
                                    "libraryName": "Library A",
                                    "librarianName": "Ramesh",
                                    "libraryPhone": "123-123-1234",
                                    "books": [
                                        {
                                            "id": 1,
                                            "bookTitle": "Thinking In Java",
                                            "bookISBN": "I123",
                                            "bookAuthor": "Austin",
                                            "libraryId": 1,
                                            "libraryPhone": "123-123-1234"
                                        },
                                        {
                                            "id": 2,
                                            "bookTitle": "OOPS",
                                            "bookISBN": "I123",
                                            "bookAuthor": "Jody",
                                            "libraryId": 1,
                                            "libraryPhone": "123-123-1234"
                                        }
                                    ]
                                },
                                {
                                    "id": 2,
                                    "libraryName": "Library B",
                                    "librarianName": "Rajesh",
                                    "libraryPhone": "987-654-3210",
                                    "books": [
                                        {
                                            "id": 3,
                                            "bookTitle": "Thinking In C++",
                                            "bookISBN": "I234",
                                            "bookAuthor": "James",
                                            "libraryId": 2,
                                            "libraryPhone": "987-654-3210"
                                        }
                                    ]
                                },
                                {
                                    "id": 3,
                                    "libraryName": "Library C",
                                    "librarianName": "Rakesh",
                                    "libraryPhone": "234-123-1234",
                                    "books": [
                                        {
                                            "id": 4,
                                            "bookTitle": "Thinking In Python",
                                            "bookISBN": "I345",
                                            "bookAuthor": "Cooper",
                                            "libraryId": 3,
                                            "libraryPhone": "234-123-1234"
                                        },
                                        {
                                            "id": 5,
                                            "bookTitle": "Thinking In Javascript",
                                            "bookISBN": "I345",
                                            "bookAuthor": "Wendy",
                                            "libraryId": 3,
                                            "libraryPhone": "234-123-1234"
                                        }
                                    ]
                                }
                            ];
        this.httpBackend.expect( 'GET', 'http://localhost:8080/getAllLibs' )
            .respond( [
                {
                    "id": 1,
                    "libraryName": "Library A",
                    "librarianName": "Ramesh",
                    "libraryPhone": "123-123-1234",
                    "books": [
                        {
                            "id": 1,
                            "bookTitle": "Thinking In Java",
                            "bookISBN": "I123",
                            "bookAuthor": "Austin",
                            "libraryId": 1,
                            "libraryPhone": "123-123-1234"
                        },
                        {
                            "id": 2,
                            "bookTitle": "OOPS",
                            "bookISBN": "I123",
                            "bookAuthor": "Jody",
                            "libraryId": 1,
                            "libraryPhone": "123-123-1234"
                        }
                    ]
                },
                {
                    "id": 2,
                    "libraryName": "Library B",
                    "librarianName": "Rajesh",
                    "libraryPhone": "987-654-3210",
                    "books": [
                        {
                            "id": 3,
                            "bookTitle": "Thinking In C++",
                            "bookISBN": "I234",
                            "bookAuthor": "James",
                            "libraryId": 2,
                            "libraryPhone": "987-654-3210"
                        }
                    ]
                },
                {
                    "id": 3,
                    "libraryName": "Library C",
                    "librarianName": "Rakesh",
                    "libraryPhone": "234-123-1234",
                    "books": [
                        {
                            "id": 4,
                            "bookTitle": "Thinking In Python",
                            "bookISBN": "I345",
                            "bookAuthor": "Cooper",
                            "libraryId": 3,
                            "libraryPhone": "234-123-1234"
                        },
                        {
                            "id": 5,
                            "bookTitle": "Thinking In Javascript",
                            "bookISBN": "I345",
                            "bookAuthor": "Wendy",
                            "libraryId": 3,
                            "libraryPhone": "234-123-1234"
                        }
                    ]
                }
            ] );

        fixture.detectChanges();
    } );

    it( 'should create', () => {
        expect( component ).toBeTruthy();
    } );
} );
*/