package com.kazale.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class P19Application {
	
//	@Autowired
//	private UsuarioRepository usuarioRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(P19Application.class, args);
	}

//	@Bean
//	public CommandLineRunner commandLineRunner() {
//		return args -> {
//			
//			Usuario usuario = new Usuario();
//			usuario.setEmail("usuario@email.com");
//			usuario.setPerfil(PerfilEnum.ROLE_USUARIO);
//			usuario.setSenha(SenhaUtils.gerarBCrypt("123456"));
//			this.usuarioRepository.save(usuario);
//			
//			Usuario admin = new Usuario();
//			admin.setEmail("admin@email.com");
//			admin.setPerfil(PerfilEnum.ROLE_ADMIN);
//			admin.setSenha(SenhaUtils.gerarBCrypt("123456"));
//			this.usuarioRepository.save(admin);
//			
//		};
//	}
}
