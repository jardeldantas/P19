/**
 * 
 */
package com.kazale.api.security.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.kazale.api.security.JwtUserFactory;
import com.kazale.api.security.entities.Usuario;
import com.kazale.api.security.services.UsuarioService;

/**
 * @author Jardel Dantas
 *
 */
@Service
public class JwrUserDetailsServiceImpl implements UserDetailsService{
	
	@Autowired
	private UsuarioService usuarioService;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioService.buscarPorEmail(username);
		
		if(usuario.isPresent()) {
			return JwtUserFactory.create(usuario.get());
		}
		
		throw new UsernameNotFoundException("Email não encontrado.");
	}

}
