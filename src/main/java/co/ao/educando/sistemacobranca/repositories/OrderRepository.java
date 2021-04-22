package co.ao.educando.sistemacobranca.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import co.ao.educando.sistemacobranca.entidades.Pedido;

public interface OrderRepository extends JpaRepository<Pedido, Long> {

}
