package cl.descalante.app.usuarios.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cl.descalante.app.usuarios.Entity.Usuario;
import cl.descalante.app.usuarios.dao.UsuariosDao;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ServiceUsuarioImpl implements IUsuarioService {

	@Autowired
	private UsuariosDao usuariosDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuariosDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(Long id) {
		log.info("id {}", id);
		return usuariosDao.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return usuariosDao.save(usuario);
	}

	@Override
	public void deleteById(Long id) {
		usuariosDao.deleteById(id);
	}

}
