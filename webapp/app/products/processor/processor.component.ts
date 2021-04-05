import { Component, OnInit } from '@angular/core';
import { WavesModule, TableModule, IconsModule, MdbTableService } from 'angular-bootstrap-md';
import { ServiceService } from '../../service.service';
import { HostListener } from '@angular/core'
import { Router } from '@angular/router';
import { userSession } from '../../userSession';


@Component({
  selector: 'app-processor',
  templateUrl: './processor.component.html',
  styleUrls: ['./processor.component.css']
})
export class ProcessorComponent implements OnInit {

  constructor(private service:ServiceService,private tableService:MdbTableService,private router:Router) { }


  elements: any = [];
  headElement = 'PRICE';
  row:any;
  userSes:userSession=new userSession();



 
  ngOnInit() {

    this.service.getProcessors().subscribe(
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
    this.userSes.proc=this.row;
    sessionStorage.setItem('usrSes',JSON.stringify(this.userSes));
   
    this.router.navigate(['/motherboard']);
  }
}
