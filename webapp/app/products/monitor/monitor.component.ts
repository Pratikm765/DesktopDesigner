import { Component, OnInit } from '@angular/core';
import { userSession } from '../../userSession';
import { ServiceService } from '../../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-monitor',
  templateUrl: './monitor.component.html',
  styleUrls: ['./monitor.component.css']
})
export class MonitorComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }


  elements: any = [];
  headElement = 'PRICE';
  row:any;
  userSes:userSession=new userSession();



 
  ngOnInit() {

    this.service.getMonitor().subscribe(
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
    this.userSes.monitor=this.row;
    sessionStorage.setItem('usrSes',JSON.stringify(this.userSes));
   
    this.router.navigate(['keyboard']);
  }

}
