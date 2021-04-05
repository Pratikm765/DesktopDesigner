import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';

import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { RegisterComponent } from './register/register.component';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { ServiceService } from './service.service';
import { Http, HttpModule } from '@angular/http';
import { HomeComponent } from './home/home.component';
import { UpdateInfoComponent } from './user/update-info/update-info.component';
import { ProcessorComponent } from './products/processor/processor.component';
import { MDBBootstrapModule } from 'angular-bootstrap-md';
import { MotherboardComponent } from './products/motherboard/motherboard.component';
import { RamComponent } from './products/ram/ram.component';
import { HddComponent } from './products/hdd/hdd.component';
import { CoolerComponent } from './products/cooler/cooler.component';
import { CabinetComponent } from './products/cabinet/cabinet.component';
import { SmpsComponent } from './products/smps/smps.component';
import { GraphicComponent } from './products/graphic/graphic.component';
import { OpticalComponent } from './products/optical/optical.component';
import { MonitorComponent } from './products/monitor/monitor.component';
import { KeyboardComponent } from './products/keyboard/keyboard.component';
import { MouseComponent } from './products/mouse/mouse.component';
import { SpeakerComponent } from './products/speaker/speaker.component';
import { UpsComponent } from './products/ups/ups.component';


const appRoutes:Routes=[
  {
    path:'register',component:RegisterComponent
  },
  {
    path:'login',component:LoginComponent
  },
  {
    path:'home',component:HomeComponent
  },
  {
    path:'',redirectTo:'/home',pathMatch:'full'
  },
  {
    path:'updateInfo',component:UpdateInfoComponent
  },
  {
    path:'design',component:ProcessorComponent
  },
  {
    path:'motherboard',component:MotherboardComponent
  },
  {
    path:'ram',component:RamComponent
  },
  {
    path:'hdd',component:HddComponent
  },
  {
    path:'graphic',component:GraphicComponent
  },
  {
    path:'cooler',component:CoolerComponent
  },
  {
    path:'cabinet',component:CabinetComponent
  },
  {
    path:'smps',component:SmpsComponent
  },
  {
    path:'optical',component:OpticalComponent
  },
  {
    path:'monitor',component:MonitorComponent
  },
  {
    path:'keyboard',component:KeyboardComponent
  },
  {
    path:'mouse',component:MouseComponent
  },
  {
    path:'speaker',component:SpeakerComponent
  },
  {
    path:'ups',component:UpsComponent
  }

]

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    HomeComponent,
    UpdateInfoComponent,
    ProcessorComponent,
    MotherboardComponent,
    RamComponent,
    HddComponent,
    CoolerComponent,
    CabinetComponent,
    SmpsComponent,
    GraphicComponent,
    OpticalComponent,
    MonitorComponent,
    KeyboardComponent,
    MouseComponent,
    SpeakerComponent,
    UpsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes,{enableTracing:true}),
    ReactiveFormsModule,
    MDBBootstrapModule
    
  
  ],
  providers: [ServiceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
