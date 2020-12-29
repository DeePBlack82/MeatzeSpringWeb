package es.meatze.core.interfaceService;

import java.util.List;

import es.meatze.core.entity.Aula;

public interface IAulaService {
	public List<Aula> listarAulas();
	public List<Aula> aulasPorCentro(String idCentro);
	public int save(Aula a);
	public void delete(String idAula);
	public List<String> aulasDelCentro(String idCentro);
}
