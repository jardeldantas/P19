/**
 * 
 */
package com.kazale.api.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kazale.api.repositories.UsuarioRepository;
import com.kazale.api.security.entities.Usuario;
import com.kazale.api.security.services.UsuarioService;

/**
 * @author jarde
 *
 */
@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public Optional<Usuario> buscarPorEmail(String email) {
		return Optional.ofNullable(this.usuarioRepository.findByEmail(email));
	}
}
