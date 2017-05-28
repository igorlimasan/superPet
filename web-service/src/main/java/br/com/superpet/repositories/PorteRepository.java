package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Porte;

public interface PorteRepository extends CrudRepository<Porte, Long> {
	
	public List<Porte> findAll();
	public Porte findById(Long id);

}
