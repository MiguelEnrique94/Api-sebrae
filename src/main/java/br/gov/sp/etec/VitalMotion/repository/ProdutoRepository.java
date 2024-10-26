package br.gov.sp.etec.VitalMotion.repository;

import br.gov.sp.etec.VitalMotion.entity.ProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoEntity, Long> {



}

