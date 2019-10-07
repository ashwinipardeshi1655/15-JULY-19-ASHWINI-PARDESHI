import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ShowAllTaskComponent } from './show-all-task.component';

describe('ShowAllTaskComponent', () => {
  let component: ShowAllTaskComponent;
  let fixture: ComponentFixture<ShowAllTaskComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ShowAllTaskComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ShowAllTaskComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
