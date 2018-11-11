import { Component, OnInit } from '@angular/core';
import { User } from '../models/User';

@Component({
  selector: 'app-sidenavcontainer',
  templateUrl: './sidenavcontainer.component.html',
  styleUrls: ['./sidenavcontainer.component.less']
})
export class SidenavcontainerComponent implements OnInit {
  user : User = {
    id: "thoams",
    name: "thomas",
    email: "thomasg!@nsdf.com",
    password: "password",
    age: 453,
    credit_num: "9p8unjfg",
    exp: "345",
    ccv: 234,
    imageurl: "https://images.heb.com/is/image/HEBGrocery/000377501-1?$article%2D235%2Dsquare$" 
  }

  constructor() { }

  ngOnInit() {
  }

}
