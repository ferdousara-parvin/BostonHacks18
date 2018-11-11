import { Component, OnInit, Input } from '@angular/core';
import { House } from '../models/House';
import { HouseService } from '../house.service';

@Component({
  selector: 'app-rentmodal',
  templateUrl: './rentmodal.component.html',
  styleUrls: ['./rentmodal.component.less']
})
export class RentmodalComponent implements OnInit {

  @Input() houseRented : House;

  houses : House[];

  constructor(private houseService : HouseService) { }

  ngOnInit() {
  }

}
