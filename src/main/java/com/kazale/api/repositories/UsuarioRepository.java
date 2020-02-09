/**
 * 
 */
package com.kazale.api.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.kazale.api.security.entities.Usuario;

/**
 * @author Jardel Dantas
 *
 */
@Transactional(readOnly = true)
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	/**
	 * @param email
	 * @return Usuario
	 */
	Usuario findByEmail(String email);
	
	
}
