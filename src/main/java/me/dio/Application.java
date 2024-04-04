package me.dio;

// Importações necessárias para configuração do Swagger e do Spring Boot
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Definição da classe principal da aplicação
@OpenAPIDefinition(servers = { @Server(url = "/", description = "Default Server URL")})
@SpringBootApplication
public class Application {

	// Método principal para execução da aplicação Spring Boot
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
