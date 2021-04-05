import { Component, OnInit } from '@angular/core';
import { userSession } from '../../userSession';
import { ServiceService } from '../../service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-keyboard',
  templateUrl: './keyboard.component.html',
  styleUrls: ['./keyboard.component.css']
})
export class KeyboardComponent implements OnInit {

  constructor(private service:ServiceService,private router:Router) { }


  elements: any = [];
  headElement = 'PRICE';
  row:any;
  userSes:userSession=new userSession();



 
  ngOnInit() {

    this.service.getKeyboard().subscribe(
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
    this.userSes.keyboard=this.row;
    sessionStorage.setItem('usrSes',JSON.stringify(this.userSes));
   
    this.router.navigate(['mouse']);
  }

}
