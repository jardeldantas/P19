/**
 * 
 */
package com.kazale.api.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kazale.api.dtos.EmpresaDTO;
import com.kazale.api.responses.Response;
import com.kazale.api.services.EmpresaService;

/**
 * @author Jardel Dantas
 *
 */

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {

	@Autowired
	private EmpresaService empresaService;
	
	/**
	 * @param cnpj
	 * @return
	 */
	@GetMapping(value = "/{cnpj}")
	public String empresa(@PathVariable("cnpj") String cnpj) {
		return this.empresaService.obterEmpresa(cnpj);
	}
	
	/**
	 * @param cnpj
	 * @return ResponseEntity<EmpresaDTO>
	 * @throws Exception 
	 */
	@PostMapping
	public ResponseEntity<Response<EmpresaDTO>> cadastrarEmpresa(@Valid @RequestBody EmpresaDTO empresaDTO, BindingResult result){
		Response<EmpresaDTO> response = new Response<EmpresaDTO>();
		
		if(result.hasErrors()) {
			result.getAllErrors().forEach(error -> response.getErrors().add(error.getDefaultMessage()));
			return ResponseEntity.badRequest().body(response);
		}
		
		EmpresaDTO retornoDto = this.empresaService.cadastrarEmpresa(empresaDTO);
		response.setData(retornoDto);
		
		return ResponseEntity.ok(response);
	}
}
