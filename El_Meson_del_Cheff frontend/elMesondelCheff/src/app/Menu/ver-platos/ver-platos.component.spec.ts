import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { VerPlatosComponent } from './ver-platos.component';

describe('VerPlatosComponent', () => {
  let component: VerPlatosComponent;
  let fixture: ComponentFixture<VerPlatosComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ VerPlatosComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(VerPlatosComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
