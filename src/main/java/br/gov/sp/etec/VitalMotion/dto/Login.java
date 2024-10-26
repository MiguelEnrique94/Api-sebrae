package br.gov.sp.etec.VitalMotion.dto;

public class Login {
	
	private	String email;
	private	String senha;
	private boolean isAutenticado;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public boolean isAutenticado() {
		return isAutenticado;
	}
	public void setAutenticado(boolean isAutenticado) {
		this.isAutenticado = isAutenticado;
	}
	

}
