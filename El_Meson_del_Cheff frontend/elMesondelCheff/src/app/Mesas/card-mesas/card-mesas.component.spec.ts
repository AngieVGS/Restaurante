import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CardMesasComponent } from './card-mesas.component';

describe('CardMesasComponent', () => {
  let component: CardMesasComponent;
  let fixture: ComponentFixture<CardMesasComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CardMesasComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CardMesasComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
