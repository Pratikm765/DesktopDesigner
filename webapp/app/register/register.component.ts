import { Component, OnInit } from '@angular/core';
import { ServiceService } from '../service.service';
import { User } from '../user';
import { Technician } from '../technician';
import { AppComponent } from '../app.component';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(private service:ServiceService,private appComponent:AppComponent) { }
  user:User=new User();
  tech:Technician=new Technician();
  ngOnInit() {
      this.appComponent.check();
  }
  userReg():void{
    if(sessionStorage.getItem('currentUser'))
    {
        window.alert("You are already Logged In")
    }
    else
    {
      this.service.registerUser(this.user).subscribe(
        data=>{
          window.alert('User Registered Succesfully '+ this.user.email);
        }
      );
    }
 
  }
  techReg():void{
    this.service.registerTechnician(this.tech).subscribe(
      data=>{
        window.alert('Technician Registered Succesfully '+ this.tech.email);
      }
    );
  }

  public swap(referTo){
    if(referTo.getAttribute("data-tab")=="user"){
      document.getElementById('form-body')
      .classList.remove('active');
      referTo.parentNode.classList.remove('technician');
    }
    else{
      document.getElementById('form-body')
      .classList.add('active');
      referTo.parentNode.classList.add('technician');
    }
  }

}
