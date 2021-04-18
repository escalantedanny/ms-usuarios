package cl.descalante.app.usuarios.dao;

import org.springframework.data.repository.CrudRepository;

import cl.descalante.app.usuarios.Entity.Usuario;

public interface UsuariosDao extends CrudRepository<Usuario, Long> {

}
