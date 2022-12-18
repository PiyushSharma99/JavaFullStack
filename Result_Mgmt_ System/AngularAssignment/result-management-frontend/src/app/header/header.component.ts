import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent {
  
  isLogin:boolean = false;
  
  constructor (
    
    public loginService: LoginService,
    private router : Router,
  ) {

  }

  logout() {
    this.loginService.setLoginStatus(0);
  }
 

}
