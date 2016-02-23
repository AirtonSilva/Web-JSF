package br.edu.ifpb.managedBean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.edu.ifpb.dao.UsuarioDAO;
import br.edu.ifpb.entidade.Usuario;

@SessionScoped
@ManagedBean
public class UsuarioBean {
	
	private Usuario usuario;
	private UsuarioDAO usuarioDao;
	private ArrayList<Usuario> usuarios;
	private Usuario listar;
	private String nome;

	public UsuarioBean() {
	
		this.usuario = new Usuario();
		this.usuarioDao = new UsuarioDAO();
		this.usuarios = new ArrayList<Usuario>();
	}
		
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public UsuarioDAO getUsuarioDao() {
		return usuarioDao;
	}
	public void setUsuarioDao(UsuarioDAO usuarioDao) {
		this.usuarioDao = usuarioDao;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	//public String listar(){
		
		//usuarios = usuarioDao.consultaUser();
		
	//	return "exibirUsuarios.xhtml";
	//}
	public String listar(){
		listar.setNome(nome);
		
		System.out.println(listar.getNome());
		
		return null;		
	}
	
	public Usuario getListar() {
		return listar;
	}

	public void setListar(Usuario listar) {
		this.listar = listar;
	}


	
}