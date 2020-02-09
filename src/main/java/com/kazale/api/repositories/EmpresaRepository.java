package com.kazale.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kazale.api.entities.Empresa;

/**
 * @author Jardel Dantas
 *
 */
public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
	
	Empresa findByCnpj(String cnpj);

}
