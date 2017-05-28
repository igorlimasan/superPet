import { Component, OnInit, Input } from '@angular/core';
import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';

@Component({
  selector: 'app-foto',
  templateUrl: './foto.component.html'
})
export class FotoComponent implements OnInit {

  @Input() pet: Pet = new Pet();

  usuario: Usuario = new Usuario();

  constructor() {}

  ngOnInit() {
  }

}
