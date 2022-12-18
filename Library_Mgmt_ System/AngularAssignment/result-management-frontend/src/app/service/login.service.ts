import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }
  public loginStatus = 0; // 0 = not logged in, 1 = logged in
 
  setLoginStatus(status: number) {
    this.loginStatus = status;
  }
 
}
