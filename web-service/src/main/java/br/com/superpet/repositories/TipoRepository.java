package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Tipo;

public interface TipoRepository extends CrudRepository<Tipo,Long>{
	
	public List<Tipo> findAll();
	public Tipo findById(Long id);

}
