import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CalculadorainvestimentoComponent } from './calculadorainvestimento.component';

describe('CalculadorainvestimentoComponent', () => {
  let component: CalculadorainvestimentoComponent;
  let fixture: ComponentFixture<CalculadorainvestimentoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CalculadorainvestimentoComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(CalculadorainvestimentoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
