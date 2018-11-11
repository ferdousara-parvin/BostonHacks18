import { Component, OnInit } from '@angular/core';
import { User } from './../models/User';
import { UserService } from  './../user.service';

@Component({
  selector: 'app-userinfo',
  templateUrl: './userinfo.component.html',
  styleUrls: ['./userinfo.component.less']
})
export class UserinfoComponent implements OnInit {

  users : User[];
  constructor(private userService : UserService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers() : void{
    this.users = this.userService.getUsers();
  }

}
