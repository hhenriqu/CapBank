import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PromosectionComponent } from './promosection.component';

describe('PromosectionComponent', () => {
  let component: PromosectionComponent;
  let fixture: ComponentFixture<PromosectionComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PromosectionComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PromosectionComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
