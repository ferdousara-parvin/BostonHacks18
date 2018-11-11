import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SidenavcontainerComponent } from './sidenavcontainer.component';

describe('SidenavcontainerComponent', () => {
  let component: SidenavcontainerComponent;
  let fixture: ComponentFixture<SidenavcontainerComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SidenavcontainerComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SidenavcontainerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
