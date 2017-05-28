import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { CadastroUsuarioComponent } from './cadastro-usuario.component';
import { PetService } from '../service/pet.service';
import { UsuarioService } from '../service/usuario.service';

@NgModule({
  imports: [ CommonModule ],
  exports: [ ],
  declarations: [ CadastroUsuarioComponent ],
  providers: [ PetService, UsuarioService ],
})
export class CadastroUsuarioModule { }
