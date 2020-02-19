import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DetallesPlatoComponent } from './detalles-plato.component';

describe('DetallesPlatoComponent', () => {
  let component: DetallesPlatoComponent;
  let fixture: ComponentFixture<DetallesPlatoComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DetallesPlatoComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DetallesPlatoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
