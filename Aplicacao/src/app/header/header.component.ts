import { Component } from '@angular/core';
import { Router, NavigationStart } from '@angular/router';

import { Usuario } from '../model/usuario';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html'
})
export class HeaderComponent {
  url: string;
  usuario: Usuario = new Usuario();

  constructor(private _router: Router) {
      this._router.events
          .subscribe((e: NavigationStart) => {
              this.url = e.url;
      });

      if(sessionStorage.getItem('usuario')) {
            this.usuario = JSON.parse(sessionStorage.getItem('usuario'));
        }
  }

  urlAtiva(url: string): boolean {
      return this.url && this.url.includes(url);
  }

  logout() {
    sessionStorage.removeItem('colaborador');
    this._router.navigateByUrl('/');
  }
}
