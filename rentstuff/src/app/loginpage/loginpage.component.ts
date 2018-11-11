import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-loginpage',
  templateUrl: './loginpage.component.html',
  styleUrls: ['./loginpage.component.less']
})
export class LoginpageComponent implements OnInit {

  username: String;
  password: String;

  constructor(private router: Router) { }

  ngOnInit() {
  }

  
  login() : void {
    alert("hi");
    // if(this.username == 'admin' && this.password == 'admin'){
    //  this.router.navigate(["user"]);
    // }else {
    //   alert("Invalid credentials");
    // }
  }
}
