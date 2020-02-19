import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { CardPlatoComponent } from './card-plato.component';

describe('CardPlatoComponent', () => {
  let component: CardPlatoComponent;
  let fixture: ComponentFixture<CardPlatoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ CardPlatoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(CardPlatoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
