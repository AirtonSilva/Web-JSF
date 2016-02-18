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
	private String auxiliar;

	public UsuarioBean() {
	
		this.usuario = new Usuario();
		this.usuarioDao = new UsuarioDAO();
		this.usuarios = new ArrayList<Usuario>();
		this.auxiliar = " ";
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

	public String listar(){
		
		usuarios = usuarioDao.consultaUser();
		
		return "exibirUsuarios.xhtml";
	}
	
	public String getAuxiliar() {
		return auxiliar;
	}

	public void setAuxiliar(String auxiliar) {
		this.auxiliar = auxiliar;
	}

}