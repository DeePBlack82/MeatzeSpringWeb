package es.meatze.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import es.meatze.core.entity.Aula;
import es.meatze.core.entity.Centro;
import es.meatze.core.entity.Ordenador;
import es.meatze.core.entity.Periferico;
import es.meatze.core.interfaceService.IAulaService;
import es.meatze.core.interfaceService.ICentroService;
import es.meatze.core.interfaceService.IOrdenadorService;
import es.meatze.core.interfaceService.IPerifericoService;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private ICentroService centroService;
	
	@Autowired
	private IAulaService aulaService;
	
	@Autowired
	private IPerifericoService perifericoService;
	
	@Autowired
	private IOrdenadorService ordenadorService;
	
	
	@GetMapping("/")
	public String inicio(Model modelo) {
		
		List<Centro> centros = centroService.listarCentros(); // Listado con todos los CENTROS
		modelo.addAttribute("centros", centros);
		
		List<Aula> aulas = aulaService.listarAulas(); // Listado con todas las AULAS
		modelo.addAttribute("aulas", aulas);
		
		return "index";
	}
	
	@GetMapping("/buscar")
<<<<<<< HEAD
	public String formularioBusqueda(Model modelo) {
		
		/*
		 * modelo.addAttribute("ordenadorABuscar", new Ordenador());
		 * 
		 */
		
		
		
		
		List<Centro> centros = centroService.listarCentros(); // Listado con todos los CENTROS
		modelo.addAttribute("centros", centros);
		
		List<Aula> aulasBarakaldo = aulaService.aulasPorCentro("BA1%"); // Listado de las AULAS de BARAKALDO
		modelo.addAttribute("aulasBarakaldo", aulasBarakaldo);
		
		List<Aula> aulasBilbao = aulaService.aulasPorCentro("BI1%"); // Listado de las AULAS de BILBAO
		modelo.addAttribute("aulasBilbao", aulasBilbao);
		
		List<String> nombresPerifericos = perifericoService.listarNombresPerifericos(); // Listado de los NOMBRES de los PERIFÉRICOS
		modelo.addAttribute("nombresPeri", nombresPerifericos);
		
		List<String> ram = ordenadorService.listarRAM(); // Listado de todas las RAM disponibles
		modelo.addAttribute("ram", ram);
		
		List<String> almacenamiento = ordenadorService.listarAlmacenamiento(); // Listado de todos los DISCOS disponibles
		modelo.addAttribute("almacenamiento", almacenamiento);
		
=======
	public String formularioBusqueda(Model modeloCentro, Model modeloBarakaldo, Model modeloBilbao, Model modeloNombrePeriferico, Model aulas, Model modeloRam, Model modeloAlmacenamiento) {
		List<Centro> centros = centroService.listarCentros();
		modeloCentro.addAttribute("centros", centros);
		List<Aula> aulasBarakaldo = aulaService.aulasPorCentro("BA1%");
		modeloBarakaldo.addAttribute("aulasBarakaldo", aulasBarakaldo);
		List<Aula> aulasBilbao = aulaService.aulasPorCentro("BI1%");
		modeloBilbao.addAttribute("aulasBilbao", aulasBilbao);
		List<String> nombresPerifericos = perifericoService.listarNombresPerifericos();
		modeloNombrePeriferico.addAttribute("nombresPeri", nombresPerifericos);
		List<String> aulasDeBaraka = aulaService.aulasDelCentro("BA1%");
		aulas.addAttribute("aulas", aulasDeBaraka);
		List<String> ram = ordenadorService.listarRAM();
		modeloRam.addAttribute("ram", ram);
		List<String> almacenamiento = ordenadorService.listarAlmacenamiento();
		modeloAlmacenamiento.addAttribute("almacenamiento", almacenamiento);
>>>>>>> refs/remotes/origin/Dani
		return "formulario";
	}
	
	@GetMapping("/listaPCs")
<<<<<<< HEAD
	public String listaPCs(Model modelo) {
		
		/*
		 * modelo.addAttribute("ordenadorABuscar", new Ordenador());
		 * 
		 * 
		 */
		
		
		List<Centro> centros = centroService.listarCentros(); // Listado con todos los CENTROS
		modelo.addAttribute("centros", centros);
		
		List<Ordenador> todosLosPCs = ordenadorService.listarOrdenadores(); // Listado con todos los ORDENADORES
		modelo.addAttribute("listaPCs", todosLosPCs);
		
		List<String> nombresPerifericos = perifericoService.listarNombresPerifericos(); // Listado de los NOMBRES de los PERIFÉRICOS
		modelo.addAttribute("nombresPeri", nombresPerifericos);
		
		List<String> ram = ordenadorService.listarRAM(); // Listado de todas las RAM disponibles
		modelo.addAttribute("ram", ram);
		
		List<String> almacenamiento = ordenadorService.listarAlmacenamiento(); // Listado de todos los DISCOS disponibles
		modelo.addAttribute("almacenamiento", almacenamiento);
		
		return "lista-Pc";
	}
	
	@GetMapping("/listaPerifericos")
	public String listaPerifericos(Model modelo) {
		
		List<Centro> centros = centroService.listarCentros(); // Listado con todos los CENTROS
		modelo.addAttribute("centros", centros);
		
		List<Periferico> todosLosPerifericos = perifericoService.listarPerifericos(); // Listado con todos los PERIFÉRICOS
		modelo.addAttribute("listaPerifericos", todosLosPerifericos);
		
		List<String> nombresPerifericos = perifericoService.listarNombresPerifericos(); // Listado de los NOMBRES de los PERIFÉRICOS
		modelo.addAttribute("nombresPeri", nombresPerifericos);
		
		List<String> ram = ordenadorService.listarRAM(); // Listado de todas las RAM disponibles
		modelo.addAttribute("ram", ram);
		
		List<String> almacenamiento = ordenadorService.listarAlmacenamiento(); // Listado de todos los DISCOS disponibles
		modelo.addAttribute("almacenamiento", almacenamiento);
		
=======
	public String listaPCs(Model modeloCentro, Model allPCs, Model modeloNombrePeriferico, Model modeloRam, Model modeloAlmacenamiento) {
		List<Centro> centros = centroService.listarCentros();
		modeloCentro.addAttribute("centros", centros);
		List<Ordenador> todosLosPCs = ordenadorService.listarOrdenadores();
		allPCs.addAttribute("listaPCs", todosLosPCs);
		List<String> nombresPerifericos = perifericoService.listarNombresPerifericos();
		modeloNombrePeriferico.addAttribute("nombresPeri", nombresPerifericos);
		List<String> ram = ordenadorService.listarRAM();
		modeloRam.addAttribute("ram", ram);
		List<String> almacenamiento = ordenadorService.listarAlmacenamiento();
		modeloAlmacenamiento.addAttribute("almacenamiento", almacenamiento);
		return "lista-Pc";
	}
	
	@GetMapping("/listaPerifericos")
	public String listaPerifericos(Model modeloCentro, Model allPerifericos, Model modeloNombrePeriferico, Model modeloRam, Model modeloAlmacenamiento) {
		List<Centro> centros = centroService.listarCentros();
		modeloCentro.addAttribute("centros", centros);
		List<Periferico> todosLosPerifericos = perifericoService.listarPerifericos();
		allPerifericos.addAttribute("listaPerifericos", todosLosPerifericos);
		List<String> nombresPerifericos = perifericoService.listarNombresPerifericos();
		modeloNombrePeriferico.addAttribute("nombresPeri", nombresPerifericos);
		List<String> ram = ordenadorService.listarRAM();
		modeloRam.addAttribute("ram", ram);
		List<String> almacenamiento = ordenadorService.listarAlmacenamiento();
		modeloAlmacenamiento.addAttribute("almacenamiento", almacenamiento);
>>>>>>> refs/remotes/origin/Dani
		return "lista-Periferico";
	}
}
