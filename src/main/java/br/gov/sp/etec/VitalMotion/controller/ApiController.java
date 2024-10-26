																															package br.gov.sp.etec.VitalMotion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.gov.sp.etec.VitalMotion.dto.Login;
import br.gov.sp.etec.VitalMotion.dto.Usuario;
import br.gov.sp.etec.VitalMotion.entity.UsuarioEntity;
import br.gov.sp.etec.VitalMotion.services.LoginService;
import br.gov.sp.etec.VitalMotion.services.UsuarioService;

import java.util.List;

@RestController
public class ApiController {
	
	@Autowired
	UsuarioService usuarioService;
	
	// @GetMapping("api")
	// public String executarApi() {
	//		return "Api executada com sucesso";
	// }
	
	@Autowired
	LoginService loginService;
	
	@PostMapping("autenticar")
	 public ResponseEntity<?> executarApi(@RequestBody Login login) {
		Login x = loginService.autenticar(login);		
		return ResponseEntity.ok(x);
	 }
	
	@PostMapping("cadastro-usuario") 
	public ResponseEntity<?> cadastrarUsuario(@RequestBody Usuario user){
		UsuarioEntity retorno = usuarioService.cadastroUsuario(user);
		//return ResponseEntity.ok("usuario cadastrado com sucesso" + user.toString());
		return ResponseEntity.ok(retorno);
	}
	
	@PostMapping("editar-usuario")
	public ResponseEntity<?> editarUsuario(@RequestBody Usuario user){
		UsuarioEntity usuarioEntity = usuarioService.atualizarUsuario(user);
		return ResponseEntity.ok(usuarioEntity);
	}
	
	@DeleteMapping("excluir-usuario/{id}")
	public ResponseEntity<?> excluirUsuario(@PathVariable Long id){ 
		usuarioService.excluirUsuario(id);
		return ResponseEntity.ok("Usuario deletado com sucesso!");
	}
	
	@GetMapping("listar-usuarios")
	public ResponseEntity<?> listarUsuarios(){ 
		List<UsuarioEntity> usuarios = usuarioService.buscaUsuarios();
		return ResponseEntity.ok(usuarios);
	}
}
