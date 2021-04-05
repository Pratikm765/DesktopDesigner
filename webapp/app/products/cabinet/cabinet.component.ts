import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../../service.service';
import { Router } from '@angular/router';
import { userSession } from '../../userSession';

@Component({
  selector: 'app-cabinet',
  templateUrl: './cabinet.component.html',
  styleUrls: ['./cabinet.component.css']
})
export class CabinetComponent implements OnInit {
  constructor(private service:ServiceService,private router:Router) { }


  elements: any = [];
  headElement = 'PRICE';
  row:any;
  userSes:userSession=new userSession();



 
  ngOnInit() {

    this.service.getCabinet().subscribe(
      (response)=>{
        console.log(response);
        this.elements = response.json();
      }
    );

    
  }

 
  public selectRow(row){
    this.row=row;
   
  }
 
  public next(){
    this.userSes=JSON.parse(sessionStorage.getItem('usrSes'));
    this.userSes.cabinet=this.row;
    sessionStorage.setItem('usrSes',JSON.stringify(this.userSes));
   
    this.router.navigate(['cooler']);
  }

}
