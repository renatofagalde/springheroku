package br.com.likwi.springheroku.repository;

import br.com.likwi.springheroku.domain.Saudacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SaudacaoRepository extends JpaRepository<Saudacao, Long> {
}
