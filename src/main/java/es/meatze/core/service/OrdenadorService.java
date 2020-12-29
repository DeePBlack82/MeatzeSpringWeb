package es.meatze.core.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.meatze.core.entity.Ordenador;
import es.meatze.core.interfaceService.IOrdenadorService;
import es.meatze.core.interfaces.IOrdenador;

@Service
public class OrdenadorService implements IOrdenadorService {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private IOrdenador repoOrdenador;
	
	
	@Override
	public List<Ordenador> listarOrdenadores() {
		return (List<Ordenador>)repoOrdenador.findAll();
	}

	@Override
	public List<Ordenador> listarOrdenadoresPorCentro(String idCentro) {
		// Obtener la session
		Session miSession = sessionFactory.openSession();
						
		// Crear la consulta (Query)
		Query<Ordenador> consulta = miSession.createQuery("select o from Ordenador o where o.id_ordenador like :id_centro", Ordenador.class);
		consulta.setParameter("id_centro", idCentro);
						
		// Ejecutar la Query y devolver resultados
		List<Ordenador> ordenadoresCentro = consulta.getResultList();
				
		miSession.close();
		
		return ordenadoresCentro;
	}

	@Override
	public List<Ordenador> listarOrdenadoresPorAula(String idAula) {
		// Obtener la session
		Session miSession = sessionFactory.openSession();
								
		// Crear la consulta (Query)
		Query<Ordenador> consulta = miSession.createQuery("select o from Ordenador o where o.id_aula = :id_aula", Ordenador.class);
		consulta.setParameter("id_aula", idAula);
								
		// Ejecutar la Query y devolver resultados
		List<Ordenador> ordenadoresCentro = consulta.getResultList();
						
		miSession.close();
		
		return ordenadoresCentro;
	}

	@Override
	public List<Ordenador> listarOrdenadoresCustom(String idCentro, String idAula, String memoria,
			String almacenamiento, boolean operativo, boolean uso) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<String> listarRAM() {
		// Obtener la session
		Session miSession = sessionFactory.openSession();
										
		// Crear la consulta (Query)
		Query<String> consulta = miSession.createQuery("select distinct o.ram from Ordenador o order by o.ram asc", String.class);
						
		// Ejecutar la Query y devolver resultados
		List<String> ramOrdenadores = consulta.getResultList();
						
		miSession.close();
		
		return ramOrdenadores;
	}

	@Override
	public List<String> listarAlmacenamiento() {
		// Obtener la session
		Session miSession = sessionFactory.openSession();
										
		// Crear la consulta (Query)
		Query<String> consulta = miSession.createQuery("select distinct o.disco1 from Ordenador o order by o.disco1 asc", String.class);
						
		// Ejecutar la Query y devolver resultados
		List<String> almacenamientoOrdenadores = consulta.getResultList();
								
		miSession.close();
		
		return almacenamientoOrdenadores;
	}

}
