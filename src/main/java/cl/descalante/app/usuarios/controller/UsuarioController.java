package cl.descalante.app.usuarios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cl.descalante.app.usuarios.Entity.Usuario;
import cl.descalante.app.usuarios.Service.IUsuarioService;

@RequestMapping(value = "/api/v1")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT })
@RestController
public class UsuarioController {
	
	@Autowired
	private IUsuarioService usuarioService;
	
	@GetMapping("/usuarios")
	public List<Usuario> listarUsuarios	(){
		return usuarioService.findAll();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario detalleUsuario(@PathVariable Long id ){
		return usuarioService.findById(id);
	}	
	
	@PostMapping("/save")
	public Usuario guardarUsuario(@RequestBody Usuario usuario) {
		return usuarioService.save(usuario);
	}
	
	@DeleteMapping("/usuario/{id}")
	public void deleteUsuario(@RequestBody Long id) {
		usuarioService.deleteById(id);
	}
	
}
