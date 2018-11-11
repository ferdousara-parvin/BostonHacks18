import { Component, OnInit } from '@angular/core';
import { House } from '../models/House';
import { HouseService } from '../house.service';
import {MatDialog, MatDialogRef, MAT_DIALOG_DATA} from '@angular/material';
import { RentmodalComponent } from '../rentmodal/rentmodal.component';


@Component({
  selector: 'app-mapview',
  templateUrl: './mapview.component.html',
  styleUrls: ['./mapview.component.less']
})
export class MapviewComponent implements OnInit {
  averageLatLng = {
    lat: 0,
    lng: 0
  }
  houses = [
    {
      lat: 51.678418,
      lng: 7.809007,
    },
    {
      lat: 52.678418,
      lng: 6.809007,
    },
    {
      lat: 50.678418,
      lng: 5.809007,
    }
  ];

  title: string = 'My first AGM project';
  lat: number = 51.678418;
  lng: number = 7.809007;

  constructor(private houseService : HouseService, public dialog: MatDialog) {}
  
  openModal(): void {
  }
  ngOnInit() {
    // this.houses = this.houseService.getHouses();
    this.findAverageLngLat();
  }

  sayHi(){
    console.log('hu');
  }

  findAverageLngLat(){
    var lng = 0;
    var lat = 0;
    for(var i = 0; i<this.houses.length; i++){
      lng = lng+this.houses[i].lng;
      lat = lat+this.houses[i].lat;
    }
    lng = lng/this.houses.length;
    lat = lat/this.houses.length;

    this.averageLatLng = {
      lat,
      lng
    }
  }
s

  openDialog(): void {
    const dialogRef = this.dialog.open(RentmodalComponent, {
      data: {}
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log('The dialog was closed');
    });
  }
}
