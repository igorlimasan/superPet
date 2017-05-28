package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Foto;

public interface FotoRepository extends CrudRepository<Foto, Long>{
	public List<Foto> findAll();
}
