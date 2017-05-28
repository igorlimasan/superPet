import { Component, OnInit } from '@angular/core';

import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';
import { PetService } from '../service/pet.service';

@Component({
  selector: 'app-lista-pet',
  templateUrl: './lista-pet.component.html'
})
export class ListaPetComponent implements OnInit {

  pets: Pet[];

  usuario: Usuario = new Usuario();

  constructor(private service: PetService) {
    this.service.listar(this.usuario)
          .subscribe(
              pets => {this.pets = pets},
              erro => console.log(erro));
  }

  ngOnInit() {
  }

}
