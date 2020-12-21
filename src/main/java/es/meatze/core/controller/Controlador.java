package es.meatze.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sun.el.stream.Optional;

import es.meatze.core.entity.Aula;
import es.meatze.core.entity.Centro;
import es.meatze.core.interfaceService.IAulaService;
import es.meatze.core.interfaceService.ICentroService;

@Controller
@RequestMapping
public class Controlador {

	@Autowired
	private ICentroService centroService;
	
	@Autowired
	private IAulaService aulaService;
	
	@GetMapping("/")
	public String inicio(Model modeloCentro, Model modeloAula) {
		List<Centro> centros = centroService.listarCentros();
		modeloCentro.addAttribute("centros", centros);
		List<Aula> aulas = aulaService.listarAulas();
		modeloAula.addAttribute("aulas", aulas);
		return "index";
	}
	
	@GetMapping("/buscar")
	public String formularioBusqueda(Model modeloCentro, Model modeloBarakaldo, Model modeloBilbao) {
		List<Centro> centros = centroService.listarCentros();
		modeloCentro.addAttribute("centros", centros);
		List<Aula> aulasBarakaldo = aulaService.aulasPorCentro("BA1%");
		modeloBarakaldo.addAttribute("aulasBarakaldo", aulasBarakaldo);
		List<Aula> aulasBilbao = aulaService.aulasPorCentro("BI1%");
		modeloBilbao.addAttribute("aulasBilbao", aulasBilbao);
		return "formulario";
	}
}
