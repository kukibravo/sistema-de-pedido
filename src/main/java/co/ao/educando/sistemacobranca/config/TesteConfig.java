package co.ao.educando.sistemacobranca.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import co.ao.educando.sistemacobranca.entidades.Pedido;
import co.ao.educando.sistemacobranca.entidades.Usuario;
import co.ao.educando.sistemacobranca.repositories.OrderRepository;
import co.ao.educando.sistemacobranca.repositories.UserRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		Usuario u2 = new Usuario(null, "Alex Green", "alex@gmail.com", "977777777", "123456");
		
		
		Pedido p1 = new Pedido(null, Instant.parse("2021-04-22T16:16:27Z"), u1);
		Pedido p2 = new Pedido(null, Instant.parse("2021-04-12T16:26:17Z"), u2);
		
		
		userRepository.saveAll(Arrays.asList(u1,u2));	
		orderRepository.saveAll(Arrays.asList(p1, p2));
		
	}
	
}
