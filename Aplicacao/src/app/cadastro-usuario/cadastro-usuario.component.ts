import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

import { UsuarioService } from '../service/usuario.service';
import { Usuario } from '../model/usuario';
 
@Component({
  selector: 'app-cadastro-usuario',
  templateUrl: './cadastro-usuario.component.html'
})
export class CadastroUsuarioComponent implements OnInit {

  usuario: Usuario = new Usuario();

  constructor(private route: ActivatedRoute, private service: UsuarioService) {
    this.route.params.subscribe(params => {
          let id = params['id'];

          if(id) {
              this.service.buscar(id)
                  .subscribe(
                      usuario => this.usuario = usuario,
                      erro => console.log(erro));
          }
      });  
  }

  ngOnInit() {
  }

}
