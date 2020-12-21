package es.meatze.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.meatze.core.entity.Aula;

@Repository
public interface IAula extends CrudRepository<Aula, String>{

}
