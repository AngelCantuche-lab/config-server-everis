package everis.visitaSer.visitaSer;

import everisentidadesSQL.entidadesSQL.domain.Cliente;
import everisentidadesSQL.entidadesSQL.domain.Visita;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import java.util.List;
import java.util.Optional;

//@EnableCircuitBreaker
@EnableEurekaClient
@EnableDiscoveryClient
@SpringBootApplication
public class VisitaSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(VisitaSerApplication.class, args);
	}

}
