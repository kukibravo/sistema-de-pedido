package co.ao.educando.sistemacobranca.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.ao.educando.sistemacobranca.entidades.Pedido;
import co.ao.educando.sistemacobranca.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Pedido> findAll(){
		return orderRepository.findAll();
	}
	
	public Pedido findById(Long id) {
		Optional<Pedido> obj = orderRepository.findById(id);
		return obj.get();
	}
}
