package cl.descalante.app.usuarios.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.descalante.app.usuarios.Entity.Usuario;
import cl.descalante.app.usuarios.dao.UsuariosDao;
import cl.descalante.app.usuarios.exception.CustomError;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServiceUsuarioImpl implements IUsuarioService {

	@Autowired
	private UsuariosDao usuariosDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() throws CustomError {
		try {			
			return (List<Usuario>) usuariosDao.findAll();
		} catch (Exception e) {
			throw new CustomError("Servidor caido");
		}
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) throws CustomError {
		try {			
			log.info("id {}", id);
			if( usuariosDao.findById(id).orElse(null) == null ) {
				throw new CustomError("usuario invalido");
			} else {				
				return usuariosDao.findById(id).orElse(null);
			}
		} catch (NullPointerException e) {
			throw new CustomError("usuario invalido");
		} catch (Exception e) {
			throw new CustomError("usuario invalido");
		}
	}

	@Override
	@Transactional(readOnly = false)
	public Usuario save(Usuario usuario) throws CustomError {
		try {			
			return usuariosDao.save(usuario);
		} catch (Exception e) {
			throw new CustomError("Error al guardar usuario");
		}
	}

	@Override
	@Transactional(readOnly = false)
	public void deleteById(Long id) throws CustomError {
		try {			
			usuariosDao.deleteById(id);
		} catch (Exception e) {
			throw new CustomError("Error al eliminar usuario");
		}
	}

}
