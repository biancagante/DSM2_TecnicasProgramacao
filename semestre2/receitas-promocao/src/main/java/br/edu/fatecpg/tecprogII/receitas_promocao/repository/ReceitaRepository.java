package br.edu.fatecpg.tecprogII.receitas_promocao.repository;

import br.edu.fatecpg.tecprogII.receitas_promocao.model.Receita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReceitaRepository extends JpaRepository<Receita, Long> {
    @Query("SELECT r FROM Receita r WHERE r.emPromocao= true")
    List<Receita> buscarPromocao();
}
