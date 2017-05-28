import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { DetalhePetComponent } from './detalhe-pet.component';
import { PetService } from '../service/pet.service';
import { UsuarioService } from '../service/usuario.service';

@NgModule({
  imports: [ CommonModule ],
  exports: [ ],
  declarations: [ DetalhePetComponent ],
  providers: [ PetService, UsuarioService ],
})
export class DetalhePetModule { }
