package es.meatze.core.interfaceService;

import java.util.List;

import es.meatze.core.entity.Ordenador;

public interface IOrdenadorService {
	public List<Ordenador> listarOrdenadores();
	public List<Ordenador> listarOrdenadoresPorCentro(String idCentro);
	public List<Ordenador> listarOrdenadoresPorAula(String idAula);
	public List<Ordenador> listarOrdenadoresCustom(String idCentro, String idAula, String memoria, String almacenamiento, boolean operativo, boolean uso);
	public List<String> listarRAM();
	public List<String> listarAlmacenamiento();
}
