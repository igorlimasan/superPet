import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CadastroPetComponent } from './cadastro-pet.component';
import { PetService } from '../service/pet.service';
import { UsuarioService } from '../service/usuario.service';

@NgModule({
  imports: [ CommonModule ],
  exports: [ ],
  declarations: [ CadastroPetComponent ],
  providers: [ PetService, UsuarioService ],
})
export class CadastroPetModule { }
