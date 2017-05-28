import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';

import { FotoComponent } from './foto.component';

@NgModule({
  imports: [ CommonModule, FormsModule, RouterModule ],
  exports: [ FotoComponent ],
  declarations: [ FotoComponent ]
})
export class FotoModule { }
