var centro;
var centroValue;
let ordenador;
let periferico;
/*var centroBarakaldo = ["AULA 1", "AULA 2", "AULA 3", "AULA 4", "AULA 5", "DIRECCIÓN 1", "DIRECCIÓN 2", "INFORMACIÓN", "SALA DE PROFESORES", "SECRETARÍA 1", "SECRETARÍA 2"];
var centroBilbao = ["AULA 1", "AULA 2", "AULA 3", "AULA 4", "AULA 5", "AULA 6", "AULA 7", "AULA FORMACIÓN REGLADA", "DIRECCIÓN", "DESVÁN", "MANTENIMIENTO", "SECRETARÍA", "TUTORÍAS"];*/




window.addEventListener("load", inicio);



function inicio() {
	centro = document.getElementById("centro");
	centroValue = centro.value;
	ordenador = document.getElementById("ordenadores");
	periferico = document.getElementById("perifericos");
	ordenador.addEventListener("click", habilitarPc);
	ordenador.addEventListener("click", deseleccionPeri);
	periferico.addEventListener("click", habilitarPeri);
	periferico.addEventListener("click", deseleccionPc);
	/*centro.addEventListener("change", borrarContenido);
	centro.addEventListener("change", cambiaCentro);*/
	document.form.cbxMemoria.addEventListener("click", checkboxMemoria);
	document.form.cbxAlmacenamiento.addEventListener("click", checkboxAlmacenamiento);
	document.form.cbxPcAllInOne.addEventListener("click", checkboxAllInOne);
	document.form.cbxPcOperativo.addEventListener("click", checkboxOperativoPC);
	document.form.cbxPcUso.addEventListener("click", checkboxUsoPC);
	document.form.cbxNombre.addEventListener("click", checkboxNombre);
	document.form.cbxPeriOperativo.addEventListener("click", checkboxOperativoPeriferico);
	document.form.cbxPeriUso.addEventListener("click", checkboxUsoPeriferico);
	/*cargarMemoria();
	cargarAlmacenamiento();
	cargarPerifericos();*/
}

function deseleccionPc() {
	document.form.cbxMemoria.checked=false;
	document.form.cbxAlmacenamiento.checked=false;
	document.form.cbxPcOperativo.checked=false;
	document.form.cbxPcUso.checked=false;
	document.form.cbxPcAllInOne.checked=false;
	document.form.selMemoria.value="todas";
	document.form.selAlmacenamiento.value="todos";
	document.form.selAllInOne.value="todos";
	document.form.selOperativoPC.value="todos";
	document.form.selUsoPC.value="todos";
}

function deseleccionPeri() {
	document.form.cbxNombre.checked=false;
	document.form.cbxPeriOperativo.checked=false;
	document.form.cbxPeriUso.checked=false;
	document.form.selNombre.value="todos";
	document.form.selOperativoPeriferico.value="todos";
	document.form.selUsoPeriferico.value="todos";
}

function habilitarPc() {
	document.form.cbxMemoria.disabled=false;
	document.form.cbxAlmacenamiento.disabled=false;
	document.form.cbxPcAllInOne.disabled=false;
	document.form.cbxPcOperativo.disabled=false;
	document.form.cbxPcUso.disabled=false;
	document.form.cbxNombre.disabled=true;
	document.form.selNombre.disabled=true;
	document.form.cbxPeriOperativo.disabled=true;
	document.form.selOperativoPeriferico.disabled=true;
	document.form.cbxPeriUso.disabled=true;
	document.form.selUsoPeriferico.disabled=true;
}

function habilitarPeri() {
	document.form.cbxMemoria.disabled=true;
	document.form.selMemoria.disabled=true;
	document.form.cbxAlmacenamiento.disabled=true;
	document.form.selAlmacenamiento.disabled=true;
	document.form.cbxPcAllInOne.disabled=true;
	document.form.selAllInOne.disabled=true;
	document.form.cbxPcOperativo.disabled=true;
	document.form.selOperativoPC.disabled=true;
	document.form.cbxPcUso.disabled=true;
	document.form.selUsoPC.disabled=true;
	document.form.cbxNombre.disabled=false;
	document.form.cbxPeriOperativo.disabled=false;
	document.form.cbxPeriUso.disabled=false;
}

/*function cambiaCentro() {
	let centro = document.getElementById("centro");
	let centroSeleccionado = centro.value;
	alert([["${aulasBarakaldo}"]]);
	
	
		if (centroSeleccionado == "BA1") {
			let aulas = document.getElementById("aula");
			for (var i=0; i<centroBarakaldo.length; i++) {
				let opcion = document.createElement("option");
				opcion.text = ${aulasBarakaldo.nombre};centroBarakaldo[i];
				aulas.appendChild(opcion);
			}
			for (var i=0; i<"${#lists.size(aulasBarakaldo)}"; i++) {
				let opcion = document.createElement("option");
				opcion.text = "${aulasBarakaldo.nombre}";centroBarakaldo[i];
				aulas.appendChild(opcion);
			}
		}
		if (centroSeleccionado == "BI1") {
			let aulas = document.getElementById("aula");
			for (var i=0; i<centroBilbao.length; i++) {
				let opcion = document.createElement("option");
				opcion.text = centroBilbao[i];
				aulas.appendChild(opcion);
			}
		}
	 
		
	


}

function borrarContenido() {
	let centro = document.getElementById("centro");
	let centroSeleccionado = centro.value;
	let aulas = document.getElementById("aula");
	let numAulas = document.getElementById("aula").childElementCount;
	for (let i = numAulas; i >= 1; i--) {
		aulas.remove(i);
	}
	
}

function borrarAulasInsertarAulas() {
	let aulas = document.getElementById("aula");
	let numAulas = document.getElementById("aula").childElementCount;
	for (let i = numAulas; i >= 1; i--) {
		aulas.remove(i);
	}
	let centro = document.getElementById("centro");
	let centroSeleccionado = centro.value;
	if (centroSeleccionado == "BA1") {
		let aulasBarakaldo = '<option th:each="aulasBa:${aulasBarakaldo}" th:text="${aulasBa.id_aula}" th:id="${aulasBa.id_aula}" th:name="${aulasBa.id_aula}" th:value="${aulasBa.id_aula}"></option>';
		aulas.innerHTML += aulasBarakaldo;
		document.write('<p th:each="aulasBa:${aulasBarakaldo}" th:text="${aulasBa.id_aula}" th:id="${aulasBa.id_aula}" th:name="${aulasBa.id_aula}" th:value="${aulasBa.id_aula}">Hola</p>');
		for (var i=0; i<centroBarakaldo.length; i++) {
			let opcion = document.createElement("option");
			opcion.text = ${aulasBarakaldo.nombre};centroBarakaldo[i];
			aulas.appendChild(opcion);
		}
	}
	else if (centroSeleccionado == "BI1") {
		let aulasBilbao = '<option th:each="aulasBi:${aulasBilbao}" th:text="${aulasBi.id_aula}" th:id="${aulasBi.id_aula}" th:name="${aulasBi.id_aula}" th:value="${aulasBi.id_aula}"></option>';
		aulas.innerHTML += aulasBilbao;
	}

}*/


function checkboxMemoria() {
	if (document.form.cbxMemoria.checked) {
		document.form.selMemoria.disabled=false;
	}
	else {
		document.form.selMemoria.disabled=true;
		document.form.selMemoria.value="todas";
	}
}

function checkboxAlmacenamiento() {
	if (document.form.cbxAlmacenamiento.checked) {
		document.form.selAlmacenamiento.disabled=false;
	}
	else {
		document.form.selAlmacenamiento.disabled=true;
		document.form.selAlmacenamiento.value="todos";
	}
}

function checkboxAllInOne() {
	if (document.form.cbxPcAllInOne.checked) {
		document.form.selAllInOne.disabled=false;
	}
	else {
		document.form.selAllInOne.disabled=true;
		document.form.selAllInOne.value="todos";
	}
}

function checkboxOperativoPC() {
	if (document.form.cbxPcOperativo.checked) {
		document.form.selOperativoPC.disabled=false;
	}
	else {
		document.form.selOperativoPC.disabled=true;
		document.form.selOperativoPC.value="todos";
	}
}

function checkboxUsoPC() {
	if (document.form.cbxPcUso.checked) {
		document.form.selUsoPC.disabled=false;
	}
	else {
		document.form.selUsoPC.disabled=true;
		document.form.selUsoPC.value="todos";
	}
}

function checkboxNombre() {
	if (document.form.cbxNombre.checked) {
		document.form.selNombre.disabled=false;
	}
	else {
		document.form.selNombre.disabled=true;
		document.form.selNombre.value="todos";
	}
}

function checkboxOperativoPeriferico() {
	if (document.form.cbxPeriOperativo.checked) {
		document.form.selOperativoPeriferico.disabled=false;
	}
	else {
		document.form.selOperativoPeriferico.disabled=true;
		document.form.selOperativoPeriferico.value="todos";
	}
}

function checkboxUsoPeriferico() {
	if (document.form.cbxPeriUso.checked) {
		document.form.selUsoPeriferico.disabled=false;
	}
	else {
		document.form.selUsoPeriferico.disabled=true;
		document.form.selUsoPeriferico.value="todos";
	}
}