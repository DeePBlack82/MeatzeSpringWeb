package es.meatze.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.meatze.core.entity.Periferico;

@Repository
public interface IPeriferico extends CrudRepository<Periferico, String>{

}
