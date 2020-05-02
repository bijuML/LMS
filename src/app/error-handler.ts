import { Injectable } from '@angular/core';
import { HttpEvent, 
    HttpInterceptor, 
    HttpHandler, 
    HttpRequest, 
    HttpResponse,
    HttpErrorResponse} from '@angular/common/http';
import { Observable, throwError } from 'rxjs';
import { catchError } from 'rxjs/operators';
import { Router } from '@angular/router';


@Injectable()
export class HttpErrorInterceptor implements HttpInterceptor {
    constructor(private router: Router) {}
    intercept(request: HttpRequest<any>, next: HttpHandler): Observable<HttpEvent<any>>{
    return next.handle(request)
        .pipe(
            catchError( (error: HttpErrorResponse) => { 
            let errMsg = '';
            // Client Side Error
            if (error.status === 302 || error.status == 404) {
                window.location.href = "/logout";
            }
            if (error.error instanceof ErrorEvent) {        
                errMsg = `Error: ${error.error.message}`;
            } 
            else {  // Server Side Error
                errMsg = `Error Code: ${error.status},  Message: ${error.message}`;
            }
            console.log(errMsg)
            return throwError(errMsg);
            })
        )
    }
}