package co.ao.educando.sistemacobranca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ao.educando.sistemacobranca.entidades.Usuario;
import co.ao.educando.sistemacobranca.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public List<Usuario> findAll(){
		return userRepository.findAll();
	}
	
	public Usuario findById(Long id) {
		Optional<Usuario> obj = userRepository.findById(id);
		return obj.get();
	}
}
