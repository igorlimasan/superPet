import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';
import { PetService } from '../service/pet.service';

@Component({
  selector: 'app-detalhe-pet',
  templateUrl: './detalhe-pet.component.html'
})
export class DetalhePetComponent implements OnInit {

  usuario: Usuario = new Usuario();
  pet: Pet = new Pet();

  constructor(private route: ActivatedRoute, private service: PetService) {
    this.route.params.subscribe(params => {
          let id = params['id'];
          
          if(id) {
              this.service.buscar(id)
                  .subscribe(
                      pet => this.pet = pet,
                      erro => console.log(erro));
          }
      }); 
  }

  ngOnInit() {
  }

}
