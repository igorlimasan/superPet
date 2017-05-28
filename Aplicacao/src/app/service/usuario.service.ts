import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { Webservice } from '../helpers/webservice';
import { Alerta } from '../alerta/alerta';
import { Usuario } from '../model/usuario';

@Injectable()
export class UsuarioService {

  	constructor(private _webservice: Webservice) {

	}
	
	login(usuario: Usuario): Observable<Usuario> {
		return this._webservice.post('usuario/login', JSON.stringify(usuario)).map(res => res.json());
	}

	salvar(usuario: Usuario): Observable<Alerta> {
		return this._webservice.post('usuario/save', JSON.stringify(usuario))
			.map(() => new Alerta('Pet salvo com sucesso', 'sucesso'));
		
	}

	buscar(codigo: number): Observable<Usuario> {
		return this._webservice.get('usuario/get/' + codigo)
			.map(res => res.json());
	}

}
