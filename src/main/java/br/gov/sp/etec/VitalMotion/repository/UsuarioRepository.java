package br.gov.sp.etec.VitalMotion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.sp.etec.VitalMotion.entity.UsuarioEntity;
@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
	public UsuarioEntity findByEmail(String email);
}
