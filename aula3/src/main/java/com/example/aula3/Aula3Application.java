package com.example.aula3;

import java.util.List;

import com.example.aula3.entity.Usuario;
import com.example.aula3.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Aula3Application {

	//Inserir usuario:

	// @Bean
	// public CommandLineRunner 
	// init (@Autowired UsuarioRepository usuarioRepository){
	// 	return args ->{
	// 		usuarioRepository.inserir(
	// 			new Usuario(0, "teste", "teste@teste", "123"));
	// 		List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
	// 		listaUsuarios.forEach(System.out::println);
	// 	};
	// }

	// Remover (int id):

	// @Bean
	// public CommandLineRunner 
	// init (@Autowired UsuarioRepository usuarioRepository){
	// 	return args ->{
	// 		usuarioRepository.remover(2);
	// 		List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
	// 		listaUsuarios.forEach(System.out::println);
	// 	};
	// }

	//Remover (Usuario usuario)

	// @Bean
	// public CommandLineRunner 
	// init (@Autowired UsuarioRepository usuarioRepository){
	// 	return args ->{

	// 		Usuario usuario = new Usuario(2, "teste3", "teste@teste", "123");
	// 		usuarioRepository.inserir(usuario);

	// 		List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
	// 		listaUsuarios.forEach(System.out::println);

	// 		usuarioRepository.remover(usuario);

	// 		List<Usuario> listaUsuarios2 = usuarioRepository.obterTodos();
	// 		listaUsuarios2.forEach(System.out::println);

	// 	};
	// }

	//editar:

	// @Bean
	// public CommandLineRunner 
	// init (@Autowired UsuarioRepository usuarioRepository){
	// 	return args ->{

	// 		Usuario usuario = new Usuario(2, "teste3", "teste@teste", "123");
	// 		usuarioRepository.inserir(usuario);

	// 		List<Usuario> listaUsuarios = usuarioRepository.obterTodos();
	// 		listaUsuarios.forEach(System.out::println);

	// 		Usuario usuario2 = new Usuario(2, "EDITADO", "Editado@teste", "123");
	// 		usuarioRepository.editar(usuario2);

	// 		List<Usuario> listaUsuarios2 = usuarioRepository.obterTodos();
	// 		listaUsuarios2.forEach(System.out::println);

	// 	};
	// }

	@Bean
	public CommandLineRunner 
	init (@Autowired UsuarioRepository usuarioRepository){
		return args ->{

			Usuario usuario = new Usuario(2, "teste3", "teste@teste", "123");
			usuarioRepository.inserir(usuario);

		System.out.println(usuarioRepository.autenticar("teste@teste", "123"));

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(Aula3Application.class, args);
	}

}
