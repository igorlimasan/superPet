import { Sexo } from './sexo';
import { Tipo } from './tipo';
import { Porte } from './porte';
import { Idade } from './idade';
import { Foto } from './foto';

export class Pet {
    id: number;
    tipo: Tipo = new Tipo();
    nome: string;
    descricao: string;
    porte: Porte = new Porte();
    sexo: Sexo = new Sexo();
    raca: string;
    idade: Idade = new Idade();
    fotos: Foto[];
}
