import { Component, OnInit } from '@angular/core';
import { DataTransferService } from '../service/data-service';

import { Router } from '@angular/router';
import { LoginService } from '../service/login.service';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit{
  
  constructor (
    private dataTransferService : DataTransferService,
    private router : Router,
    public loginService: LoginService,
    
    )
    {

    }
    isLogin:boolean = false;
  ngOnInit(): void {
    sessionStorage.removeItem('id');
    this.dataTransferService.addSuccess = false;
    this.dataTransferService.editSuccess = false;
    this.loginService.setLoginStatus(0);
    
  }

  onStudent()
  {
    this.router.navigate(['student']);
    this.dataTransferService.addSuccess = false;
  }

}
