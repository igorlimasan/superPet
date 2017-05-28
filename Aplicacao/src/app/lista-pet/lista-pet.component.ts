import { Component, OnInit } from '@angular/core';

import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';

@Component({
  selector: 'app-lista-pet',
  templateUrl: './lista-pet.component.html'
})
export class ListaPetComponent implements OnInit {

  pets: Pet[];

  usuario: Usuario = new Usuario();

  constructor() { }

  ngOnInit() {
  }

}
