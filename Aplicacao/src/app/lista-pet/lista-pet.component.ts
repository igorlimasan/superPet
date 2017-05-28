import { Component, OnInit } from '@angular/core';
import { Router, NavigationStart } from '@angular/router';

import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';
import { PetService } from '../service/pet.service';

@Component({
  selector: 'app-lista-pet',
  templateUrl: './lista-pet.component.html'
})
export class ListaPetComponent {

  pets: Pet[];
  url: string;
  usuario: Usuario = new Usuario();

  constructor(private service: PetService, private _router: Router) {
    this._router.events
        .subscribe((e: NavigationStart) => {
            this.url = e.url;
    });
  
    if(sessionStorage.getItem('usuario')) {
        this.usuario = JSON.parse(sessionStorage.getItem('usuario'));
    }
    this.service.listar(this.usuario)
          .subscribe(
              pets => {this.pets = pets},
              erro => console.log(erro));
  }

  urlAtiva(url: string): boolean {
      return this.url && this.url.includes(url);
  }

}
