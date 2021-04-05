import { Component, OnInit } from '@angular/core';
import { User } from '../../user';
import { FormGroup} from '@angular/forms';
import { ServiceService } from '../../service.service';

@Component({
  selector: 'app-update-info',
  templateUrl: './update-info.component.html',
  styleUrls: ['./update-info.component.css']
})
export class UpdateInfoComponent implements OnInit {

  pass1:string;
  pass2:string;
  pass3:string;
  user:User=new User();
  msg:string;
  flag:boolean;
  city:string;
  state:string;
  pincode:string;

  constructor(private service:ServiceService) {
 
   }
   public validate(newvalue){
    this.msg="";
    this.flag=true;
     if(this.pass1!=newvalue)
     {
      this.msg="Password Not Matched";
      this.flag=false;
     }
   }
   

   public change(){
    this.user=JSON.parse(sessionStorage.getItem('currentUser')); 
    if(this.user.password!=this.pass3)
    {
        window.alert("Incorrect Old Password");
    }
    else
    {
      if(this.flag)
      {
        this.user.password=this.pass1;
        this.service.updateUser(this.user).subscribe(
          data=>{
            window.alert('Password Change Succesfully');
          }
        );
        sessionStorage.setItem('currentUser',JSON.stringify(this.user));
      }
      else
      {
        window.alert('Password Not Matching')
      }
     
    }
       
   }

   public update(){
    this.user=JSON.parse(sessionStorage.getItem('currentUser')); 
  
     
        this.user.city=this.city;
        this.user.state=this.state;
        this.user.pincode=this.pincode;
        this.service.updateUser(this.user).subscribe(
          data=>{
            window.alert('Address Updated Succesfully');
          }
        );
        sessionStorage.setItem('currentUser',JSON.stringify(this.user));
     
    }
       

   
 
  ngOnInit() {
  }

}
