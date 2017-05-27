import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Webservice } from '../helpers/webservice';
import { Alerta } from '../alerta/alerta';
import { Pet } from '../model/pet';

@Injectable()
export class PetService {

	constructor(private _webservice: Webservice) {

	}

	salvar(pet: Pet): Observable<Alerta> {
		return this._webservice.post('pet/save', JSON.stringify(pet))
			.map(() => new Alerta('Pet salvo com sucesso', 'sucesso'));
		
	}

	listar(status: boolean): Observable<Pet[]>  {
		//let colaborador: Colaborador = JSON.parse(sessionStorage.getItem('colaborador'));
		let path: string ='pet/list/';

		if(status == null) return this._webservice.get(path)
			.map(res => res.json());

		return this._webservice.get(path + status)
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
