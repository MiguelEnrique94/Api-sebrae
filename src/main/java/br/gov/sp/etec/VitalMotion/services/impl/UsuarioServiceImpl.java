package br.gov.sp.etec.VitalMotion.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.VitalMotion.dto.Usuario;
import br.gov.sp.etec.VitalMotion.entity.UsuarioEntity;
import br.gov.sp.etec.VitalMotion.repository.UsuarioRepository;
import br.gov.sp.etec.VitalMotion.services.UsuarioService;
@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	@Autowired
	UsuarioRepository repo;

	@Override
	public UsuarioEntity cadastroUsuario(Usuario user) {
		// TODO Auto-generated method stub
		UsuarioEntity usuarioParaSalvar = new UsuarioEntity(user);
		UsuarioEntity usuarioRetorno = repo.save(usuarioParaSalvar);
		
		return usuarioRetorno;
	}

	@Override
	public UsuarioEntity atualizarUsuario(Usuario user) {
		UsuarioEntity usuarioEncontrado = this.buscaUsuarioPorEmail(user.getEmail());
		if(usuarioEncontrado!=null){
			usuarioEncontrado.setNome(user.getNome());
			usuarioEncontrado.setEmail(user.getEmail());
			usuarioEncontrado.setSenha(user.getSenha());
			usuarioEncontrado.setTelefone(user.getTelefone());
			return repo.save(usuarioEncontrado);
			
		}
		return null;
	}

	@Override
	public void excluirUsuario(Long idUsuario) {
		repo.deleteById(idUsuario);
	}

	@Override
	public UsuarioEntity buscaUsuarioPorEmail(String email) {
		UsuarioEntity response = repo.findByEmail(email);
		return response; 
	}

	@Override
	public List<UsuarioEntity> buscaUsuarios() {
		List<UsuarioEntity> response = repo.findAll();
		List<String> nomes = this.listaDeNomes();
		return response;
	}
	
	private List<String> listaDeNomes() {
		ArrayList<String> nomes = new ArrayList<String>();
		nomes.add("Francisco");
		nomes.add("Maria");
		nomes.add("Jose");
		return nomes;
	}
	
	

}
