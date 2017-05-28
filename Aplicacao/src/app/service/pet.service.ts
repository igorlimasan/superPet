import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Webservice } from '../helpers/webservice';
import { Alerta } from '../alerta/alerta';
import { Pet } from '../model/pet';
import { Usuario } from '../model/usuario';
import 'rxjs/add/operator/map';

@Injectable()
export class PetService {

	constructor(private _webservice: Webservice) {

	}
	usuario:Usuario = JSON.parse(sessionStorage.getItem('usuario'))

	salvar(pet: Pet): Observable<Alerta> {
		return this._webservice.post('pet/save/'+this.usuario.id, JSON.stringify(pet))
			.map(() => new Alerta('Pet salvo com sucesso', 'sucesso'));
		
	}

	listar(usuario: Usuario, url: string): Observable<Pet[]>  {
		//let colaborador: Colaborador = JSON.parse(sessionStorage.getItem('colaborador'));
		let path: string ='pet/list/';

		if(url.includes('meus-pets') && usuario.autorizacoes && usuario.autorizacoes[0].autorizacao == "cuidador") return this._webservice.get(path + usuario.id)
			.map(res => res.json());

		return this._webservice.get(path)
			.map(res => res.json());
	}

	buscar(codigo: number): Observable<Pet> {
		return this._webservice.get('pet/get/' + codigo)
			.map(res => res.json());
	}

	listarFavoritos(): Observable<Pet[]> {
		return this._webservice.get('pet/favoritos').map(res => res.json());
	}

}
