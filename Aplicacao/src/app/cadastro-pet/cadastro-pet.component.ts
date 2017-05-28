import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Alerta } from '../alerta/alerta';

import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';
import { PetService } from '../service/pet.service';

@Component({
  selector: 'app-cadastro-pet',
  templateUrl: './cadastro-pet.component.html'
})
export class CadastroPetComponent implements OnInit {

  alerta: Alerta = new Alerta('','');
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

  salvar(event) {
        event.preventDefault();

        this.service
            .salvar(this.pet)
            .subscribe(alerta => {
                this.alerta = alerta;
                console.log(alerta.mensagem)
            }, erro => console.log(erro));
    }

}
