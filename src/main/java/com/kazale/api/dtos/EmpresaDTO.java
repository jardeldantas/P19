/**
 * 
 */
package com.kazale.api.dtos;

import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.br.CNPJ;

/**
 * @author Jardel Dantas
 *
 */
public class EmpresaDTO {
	
	/** A(O) id */
	private Long id;

	/** A(O) razaoSocial */
	private String razaoSocial;
	
	/** A(O) cnpj */
	private String cnpj;
	
	
	/**
	 * Construtor
	 */
	public EmpresaDTO() {
	}
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the razaoSocial
	 */
	@NotEmpty(message = "Razão é um campo obrigatório.")
	@Length(min = 5, max = 200, message = "Razão social deve conter entre 5 e 20 caracteres.")
	public String getRazaoSocial() {
		return razaoSocial;
	}
	/**
	 * @param razaoSocial the razaoSocial to set
	 */
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	/**
	 * @return the cnpj
	 */
	@NotEmpty(message = "CNPJ é um campo obrigatório")
	@CNPJ(message = "CNPJ inválido.")
	public String getCnpj() {
		return cnpj;
	}
	/**
	 * @param cnpj the cnpj to set
	 */
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public String toString() {
		return "EmpresaDTO [id=" + id + ", razaoSocial=" + razaoSocial + ", cnpj=" + cnpj + "]";
	}

}
