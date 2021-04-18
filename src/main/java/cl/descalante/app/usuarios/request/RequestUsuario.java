package cl.descalante.app.usuarios.request;

import java.io.Serializable;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class RequestUsuario implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3982529087468033619L;
	
	@JsonProperty("usu_name")
	private String usuName;
	@JsonProperty("usu_password")
	private String usuPassword;
	@JsonProperty("usu_rut")
	private String usuRut;
	@JsonProperty("usu_status")
	private String usuStatus;
	@JsonProperty("usu_direccion")
	private String usuDireccion;
	@JsonProperty("usu_contact")
	private String usuContact;
	@JsonProperty("usu_mphone")
	private String usuMphone;
	@JsonProperty("usu_email")
	private String usuEmail;
	@JsonProperty("usu_webpage")
	private String usuWebpage;
	@JsonProperty("usu_facebook")
	private String usuFacebook;
	@JsonProperty("usu_twitter")
	private String usuTwitter;
	@JsonProperty("usu_instagram")
	private String usuInstagram;
	@JsonProperty("usu_dateborn")
	private Date usuDateborn;
	@JsonProperty("usu_gender")
	private String usuGender;
	@JsonProperty("usu_picture")
	private String usuPicture;
	@JsonProperty("usu_dateregist")
	private Date usuDateregist;
	@JsonProperty("usu_rol")
	private String usuRol;
	@JsonProperty("usu_id_sucursal")
	private String usuIdSucursal;

}
