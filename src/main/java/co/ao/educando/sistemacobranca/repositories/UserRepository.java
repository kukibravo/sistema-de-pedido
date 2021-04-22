package co.ao.educando.sistemacobranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.ao.educando.sistemacobranca.entidades.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
