import { Component, OnInit, Input } from '@angular/core';
import { Router, NavigationStart } from '@angular/router';

import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';

@Component({
  selector: 'app-foto',
  templateUrl: './foto.component.html'
})
export class FotoComponent implements OnInit {

  @Input() pet: Pet = new Pet();
  @Input() url: string;

  usuario: Usuario = new Usuario();
  
  constructor(private _router: Router) {    
      if(sessionStorage.getItem('usuario')) {
          this.usuario = JSON.parse(sessionStorage.getItem('usuario'));
      }

  }

  ngOnInit() {
  }

  urlAtiva(url: string): boolean {
      return this.url && this.url.includes(url);
  }

}
