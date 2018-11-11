import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AgmCoreModule } from '@agm/core';

import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { MapviewComponent } from './mapview/mapview.component';
import { UserinfoComponent } from './userinfo/userinfo.component';
import { RentinfoComponent } from './rentinfo/rentinfo.component';
import { MatInputModule, MatButtonModule, MatSelectModule, MatIconModule, MatSidenavModule, MatDialogModule, MatListModule, MatBottomSheetModule, MatCardModule, MatProgressSpinnerModule } from '@angular/material';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { NavbarComponent } from './navbar/navbar.component';
import { SidenavcontainerComponent } from './sidenavcontainer/sidenavcontainer.component';
import { RentlistComponent } from './rentlist/rentlist.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { RentmodalComponent } from './rentmodal/rentmodal.component';
import { EnterpasswordComponent } from './enterpassword/enterpassword.component';

const routes: Routes = [
  { path: '', component: HomepageComponent },
  { path: 'user/:id', component: UserinfoComponent },
  { path: 'rent/:id', component: RentinfoComponent },
  { path: 'rents', component: RentlistComponent },
  { path: 'login', component: LoginpageComponent},
  { path: 'enterpassword', component: EnterpasswordComponent},
  { path: '**', component: LoginpageComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    HomepageComponent,
    MapviewComponent,
    UserinfoComponent,
    RentinfoComponent,
    NavbarComponent,
    SidenavcontainerComponent,
    RentlistComponent,
    LoginpageComponent,
    RentmodalComponent,
    EnterpasswordComponent
  ],
  imports: [
    BrowserModule,
    MatSidenavModule,
    BrowserAnimationsModule,
    BrowserModule,
    FormsModule,
    HttpModule,
    BrowserAnimationsModule,
    MatInputModule, 
    MatDialogModule,
    MatProgressSpinnerModule,
    MatBottomSheetModule,
    MatListModule,
    MatButtonModule,
    MatCardModule,
    MatSelectModule,
    MatIconModule,
    RouterModule.forRoot(routes),
    AgmCoreModule.forRoot({
      apiKey: 'AIzaSyA0IQDvolqtM2iiIaSXpx1TZQxLoYZGbK4'
    })
  ],
  providers: [],
  entryComponents: [RentmodalComponent],
  bootstrap: [AppComponent]
})
export class AppModule { }
