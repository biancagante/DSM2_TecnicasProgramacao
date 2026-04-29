package br.edu.fatecpg.tecprogII.receitas_promocao;

import br.edu.fatecpg.tecprogII.receitas_promocao.model.Receita;
import br.edu.fatecpg.tecprogII.receitas_promocao.repository.ReceitaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ReceitasPromocaoApplication implements CommandLineRunner {
	@Autowired private ReceitaRepository repo;

	public static void main(String[] args) {
		SpringApplication.run(ReceitasPromocaoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// repo.deleteAll();

		Receita receita1 = new Receita("Bacalhau", "Peixes", 54.50, true);
		repo.save(receita1);

		Receita receita2 = new Receita("Lasanha", "Massas", 32.00, false);
		repo.save(receita2);

		Receita receita3 = new Receita("Picanha", "Carnes", 95.90, false);
		repo.save(receita3);

		Receita receita4 = new Receita("Salada Caesar", "Saladas", 18.50, true);
		repo.save(receita4);

		Receita receita5 = new Receita("Brigadeiro", "Sobremesas", 12.00, true);
		repo.save(receita5);

		repo.buscarPromocao().stream().forEach(System.out::println);
	}
}
