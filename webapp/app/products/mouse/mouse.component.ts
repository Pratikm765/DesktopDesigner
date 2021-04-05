import { Component, OnInit } from '@angular/core';
import { userSession } from '../../userSession';
import { ServiceService } from '../../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mouse',
  templateUrl: './mouse.component.html',
  styleUrls: ['./mouse.component.css']
})
export class MouseComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }


  elements: any = [];
  headElement = 'PRICE';
  row:any;
  userSes:userSession=new userSession();



 
  ngOnInit() {

    this.service.getMouse().subscribe(
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
    this.userSes.mouse=this.row;
    sessionStorage.setItem('usrSes',JSON.stringify(this.userSes));
   
    this.router.navigate(['speaker']);
  }
}
