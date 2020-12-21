package es.meatze.core.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import es.meatze.core.entity.Ordenador;

@Repository
public interface IOrdenador extends CrudRepository<Ordenador, String>{

}
