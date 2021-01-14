package es.meatze.core.service;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import es.meatze.core.entity.Aula;
import es.meatze.core.interfaceService.IAulaService;
import es.meatze.core.interfaces.IAula;

@Service
public class AulaService implements IAulaService {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private IAula repoAula;
	
	
	
	@Override
	public List<Aula> listarAulas() {
		return (List<Aula>)repoAula.findAll();
	}

	@Override
	public List<Aula> aulasPorCentro(String idCentro) {
		
		
		// Obtener la session
		Session miSession = sessionFactory.openSession();
				
		// Crear la consulta (Query)
		String like = "%";
		String id = idCentro + like;
		Query<Aula> consulta = miSession.createQuery("select a from Aula a where a.id_aula like :id_aula", Aula.class);
		consulta.setParameter("id_aula", id);
				
		// Ejecutar la Query y devolver resultados
		List<Aula> nombreAulas = consulta.getResultList();
				
		miSession.close();
		
		return nombreAulas;
		
	}

	@Override
	public int save(Aula a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(String idAula) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<String> aulasDelCentro(String idCentro) {
		// Obtener la session
		Session miSession = sessionFactory.openSession();
				
		// Crear la consulta (Query)
		Query<String> consulta = miSession.createQuery("select a.nombre from Aula a where a.id_aula like :id_aula", String.class);
		consulta.setParameter("id_aula", idCentro);
				
		// Ejecutar la Query y devolver resultados
		List<String> nombreAulas = consulta.getResultList();
				
		miSession.close();
		
		return nombreAulas;
	}

	

}
