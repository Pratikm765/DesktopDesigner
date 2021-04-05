import { Component } from '@angular/core';
import { ServiceService } from './service.service';
import { User } from './user';
import { Router } from '@angular/router';
import { userSession } from './userSession';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
   logFname:string;
   logLname:string;
   userSession:userSession=new userSession(); 
   Login:string;
   
   ngOnInit() {
      this.check();
  }
  constructor(private router:Router){

  }
  public logout()
  {
    sessionStorage.removeItem('currentUser');
    sessionStorage.removeItem('usrSes');
    this.check();
    this.Login="Login";
    this.router.navigate(['']);
    
  }
  check()
  {
    if(sessionStorage.getItem('currentUser'))
    {
      let currentUser=JSON.parse(sessionStorage.getItem('currentUser')); 
      this.logFname="Welcome, "+currentUser.fname;
      this.logLname=currentUser.lname;
      this.Login="Logout";
    }
    else
    {
      this.Login="Login";
      this.logFname="";
      this.logLname="";
      
    }
       
  }

  sendToCust()
  {
    sessionStorage.setItem('usrSes',JSON.stringify(this.userSession));
    if(sessionStorage.getItem('currentUser'))
    {
      let currentUser=JSON.parse(sessionStorage.getItem('currentUser'));
      this.userSession=JSON.parse(sessionStorage.getItem('usrSes'));
      this.userSession.user=currentUser.id;
      sessionStorage.setItem('usrSes',JSON.stringify(this.userSession));
    }
  }
  sendToLogin()
  {
    if(this.Login=="Logout")
    {
      this.logout();  
    }
    else
    {
      this.router.navigate(['/login']);
    }
  }
  sendToUpdate()
  {
    if(this.Login=="Login")
    {
        window.alert('You Should Login First!..')
        this.router.navigate(['']);   
    }
    else
    {
      this.router.navigate(['/updateInfo']);
    }
  }
}
