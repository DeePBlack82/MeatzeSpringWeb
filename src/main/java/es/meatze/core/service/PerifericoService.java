package es.meatze.core.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.meatze.core.entity.Periferico;
import es.meatze.core.interfaceService.IPerifericoService;
import es.meatze.core.interfaces.IPeriferico;

@Service
public class PerifericoService implements IPerifericoService {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private IPeriferico repoPeriferico;
	
	
	@Override
	@Transactional
	public List<Periferico> listarPerifericos() {
		return (List<Periferico>)repoPeriferico.findAll();
	}

	@Override
	public List<Periferico> listarPerifericosPorCentro(String idCentro) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Periferico> listarPerifericosPorAula(String idAula) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Periferico> listarPerifericosCustom(String idCentro, String idAula, String nombre, boolean operativo,
			boolean uso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> listarNombresPerifericos() {
		// Obtener la session
		Session miSession = sessionFactory.openSession();
								
		// Crear la consulta (Query)
		Query<String> consulta = miSession.createQuery("select distinct p.nombre from Periferico p order by p.nombre asc", String.class);
				
		// Ejecutar la Query y devolver resultados
		List<String> nombrePerifericos = consulta.getResultList();
		
		miSession.close();
		
		return nombrePerifericos;
	}

}
