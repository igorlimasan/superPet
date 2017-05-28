import { Autorizacao } from './autorizacao';

export class Usuario {
    id: number;
    nome: string;
    login: string;
    senha: string;
    email_contato: string;
    numero_contato: string;
    cep: string;
    estado: string;
    cidade: string;
    facebook: string;
    autorizacoes: Autorizacao[];
}
