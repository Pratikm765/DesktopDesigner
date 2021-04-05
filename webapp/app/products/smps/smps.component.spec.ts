import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SmpsComponent } from './smps.component';

describe('SmpsComponent', () => {
  let component: SmpsComponent;
  let fixture: ComponentFixture<SmpsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SmpsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SmpsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
