/**
 * 
 */
package com.kazale.api.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.api.dtos.EmpresaDTO;
import com.kazale.api.entities.Empresa;
import com.kazale.api.repositories.EmpresaRepository;

/**
 * @author Jardel Dantas
 *
 */
@Service
public class EmpresaService {

	@Autowired
	private EmpresaRepository empresaRepository;

	/**
	 * @return String
	 */
	public String obterEmpresa(String cnpj) {
		Empresa empresaCnpj = this.empresaRepository.findByCnpj(cnpj);
		return empresaCnpj.getRazaoSocial();
	}

	/**
	 * @param empresaDTO
	 * @return EmpresaDTO
	 * @throws Exception 
	 */
	public EmpresaDTO cadastrarEmpresa(EmpresaDTO empresaDTO){
		Empresa empresa = converterEmpresaDtoToEmpresa(empresaDTO);
		this.empresaRepository.save(empresa);
		Empresa empresaretorno = this.empresaRepository.findByCnpj(empresa.getCnpj());
		return converterEmpresaToEmpresaDTO(empresaretorno);
	}

	/**
	 * @param empresaretorno
	 * @return
	 */
	private EmpresaDTO converterEmpresaToEmpresaDTO(Empresa empresaretorno) {
		EmpresaDTO dto = new EmpresaDTO();
		dto.setId(empresaretorno.getId());
		dto.setCnpj(empresaretorno.getCnpj());
		dto.setRazaoSocial(empresaretorno.getRazaoSocial());
		return dto;
	}

	/**
	 * @param empresaDTO
	 * @return Empresa
	 * @throws Exception
	 */
	private Empresa converterEmpresaDtoToEmpresa(EmpresaDTO empresaDTO) {
		Empresa empresa = new Empresa();
		empresa.setCnpj(empresaDTO.getCnpj());
		empresa.setRazaoSocial(empresaDTO.getRazaoSocial());
		empresa.setDataCriacao(new Date());
		return empresa;
	}
}
