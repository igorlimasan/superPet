package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Sexo;

public interface SexoRepository extends CrudRepository<Sexo,Long> {
	
	
	public List<Sexo> findAll();
	
	public Sexo findById(Long id);

}
