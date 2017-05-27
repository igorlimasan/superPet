import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ListaPetComponent } from './lista-pet.component';

describe('ListaPetComponent', () => {
  let component: ListaPetComponent;
  let fixture: ComponentFixture<ListaPetComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ListaPetComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ListaPetComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
