package co.ao.educando.sistemacobranca.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.ao.educando.sistemacobranca.entidades.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UserResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll(){
		Usuario usuario = new Usuario(1L, "zola", "zola@gmail", "999999999", "1234");
		return ResponseEntity.ok().body(usuario);
	}
}
