import { MatButtonModule, MatCheckboxModule } from '@angular/material';
import { NgModule } from '@angular/core';
import { MatDialogModule } from '@angular/material';
import {platformBrowserDynamic} from '@angular/platform-browser-dynamic';
import { MatTableModule } from '@angular/material';
import {CdkTableModule} from '@angular/cdk/table';
@NgModule({
  imports: [ MatButtonModule, MatCheckboxModule,MatDialogModule, MatTableModule ],
  exports: [ MatButtonModule, MatCheckboxModule, CdkTableModule, MatTableModule],
})

export class MaterialModule {

}
//platformBrowserDynamic().bootstrapModule(MaterialModule);