import { Component, OnInit, ViewChild, Output, EventEmitter } from '@angular/core';
import { User } from '../models/User';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.less']
})
export class NavbarComponent implements OnInit {
  user : User;
  @Output() navToggle = new EventEmitter<boolean>();
  constructor() {
    this.user = {
      id: "thoams",
      name: "thomas",
      email: "thomasg!@nsdf.com",
      password: "password",
      age: 453,
      credit_num: "9p8unjfg",
      exp: "345",
      ccv: 234,
      imageurl: "https://images.heb.com/is/image/HEBGrocery/000377501-1?$article%2D235%2Dsquare$" 
    };
   }

  ngOnInit() {
  }

  sidebarToggle(){
    this.navToggle.emit(true);
  }
}
