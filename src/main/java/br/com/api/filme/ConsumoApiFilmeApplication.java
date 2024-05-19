package br.com.api.filme;

import br.com.api.filme.model.DadosSerie;
import br.com.api.filme.principal.Principal;
import br.com.api.filme.service.ConsumoApi;
import br.com.api.filme.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoApiFilmeApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiFilmeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal();

		principal.exibeMenu();
	}
}
