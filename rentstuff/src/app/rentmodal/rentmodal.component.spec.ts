import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RentmodalComponent } from './rentmodal.component';

describe('RentmodalComponent', () => {
  let component: RentmodalComponent;
  let fixture: ComponentFixture<RentmodalComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RentmodalComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RentmodalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
