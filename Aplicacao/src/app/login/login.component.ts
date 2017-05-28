import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

import { Login } from '../model/login';
import { Usuario } from '../model/usuario';
import { UsuarioService } from '../service/usuario.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html'
})
export class LoginComponent implements OnInit {

  login: Login = new Login();
  usuario: Usuario = new Usuario();


  ngOnInit() {
  }

  constructor(private service: UsuarioService, private router: Router) {}

  logar(event) {
      event.preventDefault();
      this.service
          .login(this.login)
          .subscribe(usuario => {
              this.usuario = usuario;
              
              if(this.usuario) {
                  sessionStorage.removeItem('usuario');
                  sessionStorage.setItem('usuario', JSON.stringify(this.usuario));
                  this.router.navigateByUrl('/superpets');
              }

          });
  }
}
