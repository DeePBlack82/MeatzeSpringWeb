package es.meatze.core.interfaceService;

import java.util.List;

import es.meatze.core.entity.Periferico;

public interface IPerifericoService {
	public List<Periferico> listarPerifericos();
	public List<Periferico> listarPerifericosPorCentro(String idCentro);
	public List<Periferico> listarPerifericosPorAula(String idAula);
	public List<Periferico> listarPerifericosCustom(String idCentro, String idAula, String nombre, boolean operativo, boolean uso);
}
