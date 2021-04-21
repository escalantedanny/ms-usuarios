package cl.descalante.app.usuarios.Service;

import java.util.List;

import cl.descalante.app.usuarios.Entity.Usuario;
import cl.descalante.app.usuarios.exception.CustomError;

public interface IUsuarioService {
	
	public List<Usuario> findAll() throws CustomError;
	public Usuario findById(Long id) throws CustomError;
	public Usuario save(Usuario usuario) throws CustomError;
	public void deleteById(Long id) throws CustomError;
	
}
