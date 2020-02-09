/**
 * 
 */
package com.kazale.api.security.services;

import java.util.Optional;

import com.kazale.api.security.entities.Usuario;

/**
 * @author Jardel Dantas
 *
 */
public interface UsuarioService {
	
	/**
	 * Busca e retorna um usuario dao um email
	 * 
	 * @param email
	 * @return Optional<Usuario>
	 */
	Optional<Usuario> buscarPorEmail(String email);
}
