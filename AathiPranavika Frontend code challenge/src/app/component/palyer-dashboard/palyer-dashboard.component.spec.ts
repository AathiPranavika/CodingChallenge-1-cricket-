import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PalyerDashboardComponent } from './palyer-dashboard.component';

describe('PalyerDashboardComponent', () => {
  let component: PalyerDashboardComponent;
  let fixture: ComponentFixture<PalyerDashboardComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PalyerDashboardComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PalyerDashboardComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
