package cl.descalante.app.usuarios.Service;

import java.util.List;

import cl.descalante.app.usuarios.Entity.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	public Usuario findById(Long id);
	public Usuario save(Usuario usuario);
	public void deleteById(Long id);
	
}
