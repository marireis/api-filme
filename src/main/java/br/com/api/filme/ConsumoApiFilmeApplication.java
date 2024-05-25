package br.com.api.filme;

import br.com.api.filme.model.DadosSerie;
import br.com.api.filme.principal.Principal;
import br.com.api.filme.repository.SerieRepository;
import br.com.api.filme.service.ConsumoApi;
import br.com.api.filme.service.ConverterDados;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConsumoApiFilmeApplication implements CommandLineRunner {

	@Autowired
	private SerieRepository repositorio;
	public static void main(String[] args) {
		SpringApplication.run(ConsumoApiFilmeApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repositorio);
		principal.exibeMenu();
	}
}
