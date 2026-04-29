package br.edu.fatecpg.tecprogII.projeto_orm;

import br.edu.fatecpg.tecprogII.projeto_orm.model.Aluno;
import br.edu.fatecpg.tecprogII.projeto_orm.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Scanner;

@SpringBootApplication
public class ProjetoOrmApplication implements CommandLineRunner {
	Scanner scan = new Scanner(System.in);
	@Autowired private AlunoRepository rep;

	public static void main(String[] args) {
		SpringApplication.run(ProjetoOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// rep.deleteAll();

		Aluno aluno1 = new Aluno("Ale", "123.456.789.00");
		Aluno aluno2 = new Aluno("Maria", "098765432");
		Aluno aluno3 = new Aluno("João", "74346354535");

		rep.save(aluno1);
		rep.save(aluno2);
		rep.save(aluno3);

		Aluno aluno4 = new Aluno("bia@teste.com", "534.237.483-05", "123", "Bianca");
		Aluno aluno5 = new Aluno("mvludu@teste.com", "562.654.726-56", "456", "Maria Vitória");
		Aluno aluno6 = new Aluno("mclara@teste.com", "342.854.972-23", "678", "Maria Clara");

		rep.save(aluno4);
		rep.save(aluno5);
		rep.save(aluno6);

		List<Aluno> alunos = rep.findAll();
		alunos.stream().forEach(a -> System.out.printf("Nome=%s | E-mail=%s \n", a.getNome(), a.getEmail()));

//		System.out.println("Busque por um nome: ");
//		String nome = scan.next();
//
//		System.out.println(rep.buscarPorNome(nome));

		//System.out.println("Aluno de ID 1:" + rep.findById(1L));

		//rep.deleteById(2L);

		System.out.println(rep.findAll());
	}
}
