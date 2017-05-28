import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { CadastroPetComponent } from './cadastro-pet.component';
import { PetService } from '../service/pet.service';
import { UsuarioService } from '../service/usuario.service';

@NgModule({
  imports: [ CommonModule, FormsModule, RouterModule  ],
  exports: [ ],
  declarations: [ CadastroPetComponent ],
  providers: [ PetService, UsuarioService ],
})
export class CadastroPetModule { }
