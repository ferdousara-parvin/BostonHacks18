import { Injectable } from '@angular/core';
import { User } from './models/User';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  users = [{
    id: "thoams",
    name: "thomas",
    email: "thomasg!@nsdf.com",
    password: "password",
    age: 453,
    credit_num: "9p8unjfg",
    exp: "345",
    ccv: 234,
    imageurl: "https://images.heb.com/is/image/HEBGrocery/000377501-1?$article%2D235%2Dsquare$" 
  },
  {
    id: "thrsgtsdfgoams",
    name: "thodfsgsdfmas",
    email: "thomasfg!@nsdf.com",
    password: "passsdword",
    age: 453,
    credit_num: "9p8unjfg",
    exp: "345",
    ccv: 234,
    imageurl: "https://images.heb.com/is/image/HEBGrocery/000377501-1?$article%2D235%2Dsquare$" 
  }]

  constructor() { }

  getUsers() : User[]{
    //todo
    return this.users;
  }
}
