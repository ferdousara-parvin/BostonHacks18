import { Injectable } from '@angular/core';
import { House } from './models/House';

@Injectable({
  providedIn: 'root'
})
export class HouseService {

  constructor() { }

  getHouses() : House[]{
    return;
  }
}
