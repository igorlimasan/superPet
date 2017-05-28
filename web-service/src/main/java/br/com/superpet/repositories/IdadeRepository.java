package br.com.superpet.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.superpet.models.Idade;

public interface IdadeRepository extends CrudRepository<Idade, Long> {
	
	public List<Idade> findAll();
	public Idade findById(Long id);

}
