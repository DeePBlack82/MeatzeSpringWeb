package es.meatze.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
		
/*********************************************************/		
		modelo.addAttribute("aula", new Aula());
/*********************************************************/
		
		return "formulario";
	}
	
	
	
@RequestMapping("/formulario2")
	public String recogidaVariables(
			@RequestParam("centro") String centroSeleccionado,
			Model modelo) {
		List<Centro> centro = centroService.consultaCentro(centroSeleccionado);
		List<Aula> aula = aulaService.aulasPorCentro(centroSeleccionado);
		modelo.addAttribute("centro", centro);
		modelo.addAttribute("aula", aula);
		return "formulario2";
	}
	

	
	
	
	@GetMapping("/listaPCs")
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
	
/*******************************************************************************************/	
/*	@RequestMapping("/formulario2")
	public String datosPcRecogidos(
			@RequestParam("centro") String centroSeleccionado,
			@RequestParam("aula") String aulaSeleccionada,
			@RequestParam("cbxMemoria") Boolean cbxMemoria,
			@RequestParam("selMemoria") String memoriaSeleccionada,
			@RequestParam("selAllInOne") String selAllInOne,
			@RequestParam("cbxPcOperativo") Boolean cbxPcOperativo,
			@RequestParam("selOperativoPC") String selOperativoPC,
			@RequestParam("cbxPcUso") Boolean cbxPcUso,
			@RequestParam("selUsoPC") String selUsoPC,
			Model modelo) {
		modelo.addAttribute("centroSeleccionado", centroSeleccionado);
		modelo.addAttribute("aulaSeleccionada", aulaSeleccionada);
		modelo.addAttribute("cbxMemoria", cbxMemoria);
		modelo.addAttribute("selMemoria", memoriaSeleccionada);
		modelo.addAttribute("selAllInOne", selAllInOne);
		modelo.addAttribute("cbxPcOperativo", cbxPcOperativo);
		modelo.addAttribute("selOperativoPC", selOperativoPC);
		modelo.addAttribute("cbxPcUso", cbxPcUso);
		modelo.addAttribute("selUsoPC", selUsoPC);
		
		
		return "formulario2";
		
	}*/
/*******************************************************************************************************/	
	
	
	
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
		

		return "lista-Periferico";
	}
	
	
/********************************************************************************************/
	
	
	
/********************************************************************************************/	
	
	
	
}
