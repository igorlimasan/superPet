package br.com.superpet.security;

import org.apache.commons.codec.digest.DigestUtils;


public class CriptografarSenha {
	
	
	
	
	public static String criptografar(String senha) {
		
		String sha256 = DigestUtils.sha256Hex(senha);
		return sha256;
	}

}
