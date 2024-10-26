package br.gov.sp.etec.VitalMotion.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.gov.sp.etec.VitalMotion.dto.Login;
import br.gov.sp.etec.VitalMotion.entity.UsuarioEntity;
import br.gov.sp.etec.VitalMotion.services.LoginService;
import br.gov.sp.etec.VitalMotion.services.UsuarioService;
@Service
public class LoginServiceImpl implements LoginService{

	@Autowired
	UsuarioService usuarioService;
	
	@Override
	public Login autenticar(Login login) {
		
		UsuarioEntity retorno = usuarioService.buscaUsuarioPorEmail(login.getEmail());
		
		if(retorno != null && retorno.getSenha().equals(login.getSenha())) { 
		login.setAutenticado(true);
		return login;
	}else {
		login.setAutenticado(false);
		return login;
	}	
  }
}
