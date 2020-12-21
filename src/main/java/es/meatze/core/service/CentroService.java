package es.meatze.core.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.meatze.core.entity.Centro;
import es.meatze.core.interfaceService.ICentroService;
import es.meatze.core.interfaces.ICentro;

@Service
public class CentroService implements ICentroService {

	@Autowired
	private ICentro repoCentro;
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Centro> listarCentros() {
		return (List<Centro>)repoCentro.findAll();
	}

	

}
