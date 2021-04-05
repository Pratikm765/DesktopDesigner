import { Injectable } from '@angular/core';
import {Http} from '@angular/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {

  http:Http;
  baseurl="http://localhost:8080/backEnd/user/";
  baseurl2="http://localhost:8080/backEnd/component/";

  constructor(http:Http) { 
    this.http = http;
  }
  public registerUser(u){
    return this.http.post(this.baseurl+"register",u);
  }
  public registerTechnician(t){
    return this.http.post(this.baseurl+"registerTech",t);
  }
  public loginUser(u){
    return this.http.post(this.baseurl+"login",u);
  }
  public updateUser(u){
    return this.http.post(this.baseurl+"updatepass",u);
  }
  public getProcessors(){
    return this.http.get(this.baseurl2+"processor");
  }
  public getMotherboard(){
    return this.http.get(this.baseurl2+"motherboard");
  }
  public getRam(){
    return this.http.get(this.baseurl2+"ram");
  }
  public getHdd(){
    return this.http.get(this.baseurl2+"hdd");
  }
  public getGraphic(){
    return this.http.get(this.baseurl2+"graphiccard");
  }
  public getCooler(){
    return this.http.get(this.baseurl2+"cooler");
  }
  public getCabinet(){
    return this.http.get(this.baseurl2+"cabinet");
  }
  public getSmps(){
    return this.http.get(this.baseurl2+"smps");
  }
  public getOptical(){
    return this.http.get(this.baseurl2+"opticaldrive");
  }
  public getMonitor(){
    return this.http.get(this.baseurl2+"monitor");
  }
  public getKeyboard(){
    return this.http.get(this.baseurl2+"keyboard");
  }
  public getMouse(){
    return this.http.get(this.baseurl2+"mouse");
  }
  public getSpeaker(){
    return this.http.get(this.baseurl2+"speaker");
  }
  public getUps(){
    return this.http.get(this.baseurl2+"ups");
  }

}
