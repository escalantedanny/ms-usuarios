package cl.descalante.app.usuarios.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tbl_usuario")
public class Usuario implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "usu_name")
	private String usuName;
	@Column(name = "usu_password")
	private String usuPassword;
	@Column(name = "usu_rut")
	private String usuRut;
	@Column(name = "usu_status")
	private String usuStatus;
	@Column(name= "usu_direccion")
	private String usuDireccion;
	@Column(name = "usu_contact")
	private String usuContact;
	@Column(name = "usu_mphone")
	private String usuMphone;
	@Column(name = "usu_email")
	private String usuEmail;
	@Column(name = "usu_webpage")
	private String usuWebpage;
	@Column(name = "usu_facebook")
	private String usuFacebook;
	@Column(name = "usu_twitter")
	private String usuTwitter;
	@Column(name = "usu_instagram")
	private String usuInstagram;
	@Column(name = "usu_dateborn")
	private Date usuDateborn;
	@Column(name = "usu_gender")
	private String usuGender;
	@Column(name = "usu_picture")
	private String usuPicture;
	@Column(name = "usu_dateregist")
	private Date usuDateregist;
	@Column(name = "usu_rol")
	private String usuRol;
	@Column(name = "usu_id_sucursal")
	private String usuIdSucursal;
	
	private static final long serialVersionUID = -922472834459252187L;

}
