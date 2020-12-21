package es.meatze.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.meatze.core.entity.Centro;

@Repository
public interface ICentro extends CrudRepository<Centro, String>{

}
