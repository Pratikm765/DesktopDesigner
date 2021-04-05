import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { ServiceService } from '../service.service';
import { AppComponent } from '../app.component';
import { Router } from '@angular/router';
import { userSession } from '../userSession';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private service:ServiceService,private appComponent:AppComponent,private router:Router) { }
  user :User=new User();
  userSes:userSession=new userSession();
  ngOnInit() {
    this.appComponent.check();
  }
  loginUser():void{
      this.service.loginUser(this.user).subscribe(
        (response)=>{
          const result = response.json();
          if(result.fname!=undefined)
          {
            window.alert('User Logged In Succesfully '+ result.fname +" "+ result.lname);
            sessionStorage.setItem('currentUser',JSON.stringify(result));
            this.appComponent.check();
            this.router.navigate(['']);
          }
          else
          {
            window.alert('login Failed');
          }
      
        }
      );
  }

  public cancel()
  {
    this.user.email="";
    this.user.password="";
    this.router.navigate(['./login']);
  }


}
