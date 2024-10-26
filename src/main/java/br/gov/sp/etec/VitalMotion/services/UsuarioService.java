package br.gov.sp.etec.VitalMotion.services;

import java.util.List;

import br.gov.sp.etec.VitalMotion.dto.Usuario;
import br.gov.sp.etec.VitalMotion.entity.UsuarioEntity;



public interface UsuarioService {

	public UsuarioEntity cadastroUsuario(Usuario user); 
	
	public UsuarioEntity atualizarUsuario(Usuario user);
	
	public void excluirUsuario(Long idUsuario);
	
	public UsuarioEntity buscaUsuarioPorEmail(String email);
	
	public List<UsuarioEntity> buscaUsuarios(); 

	
}
