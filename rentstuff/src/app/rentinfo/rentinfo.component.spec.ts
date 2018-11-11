import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RentinfoComponent } from './rentinfo.component';

describe('RentinfoComponent', () => {
  let component: RentinfoComponent;
  let fixture: ComponentFixture<RentinfoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RentinfoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RentinfoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
