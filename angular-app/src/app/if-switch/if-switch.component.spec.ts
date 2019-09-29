import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { IfSwitchComponent } from './if-switch.component';

describe('IfSwitchComponent', () => {
  let component: IfSwitchComponent;
  let fixture: ComponentFixture<IfSwitchComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ IfSwitchComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(IfSwitchComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
