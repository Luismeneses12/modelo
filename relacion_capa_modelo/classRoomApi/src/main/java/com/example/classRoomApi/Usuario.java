package com.example.classRoomApi;
import ayuda.Tipo_usuario;
import jakarta.persistence.*;
import jakarta.persistence.Id;
@Entity
// para identificar
@Table(name="Usuario")
// para crear una base de datos

public class  Usuario {
    // atributos para la base dse datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id_usuario")
    private Integer Id_usuario;
    @Column(name="nombre",length=100,unique=false)
    private String nombre;
    @Column(name="cooreo_eletronico",length=100,nullable=false)
    private String correo_eletronico;
    @Column(name="contrasena",length=100,nullable=false)
    private String contrasena;
    @Column(name="telefono",length=100,nullable=false)
    private String telefono;
    @Column(name="tipo_usuario",length=100,nullable=false)
    @Enumerated
    private Tipo_usuario tipo_usuario;
// espacio param la entidades y relaciones
@OneToOne(mappedBy="Usuario")
private Estudiante estudiante;
@OneToOne(mappedBy="Docente")
private Docentes docente;
        // metodos constructor

    public Usuario() {
    }

    public Usuario(Integer Id_usuario, String nombre, String correo_eletronico, String contrasena, String telefono, Tipo_usuario tipo_usuario) {
        this.Id_usuario = Id_usuario;
        this.nombre = nombre;
        this.correo_eletronico = correo_eletronico;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.tipo_usuario = tipo_usuario;
    }
    //  metodos set y get para para acceder a la informacion

    public Integer getID_usuario() {
        return Id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo_eletronico() {
        return correo_eletronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public Tipo_usuario getTipo_usuario() {
        return tipo_usuario;
    }

    public void setID_usuario(Integer Id_usuario) {
        this.Id_usuario = Id_usuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo_eletronico(String correo_eletronico) {
        this.correo_eletronico = correo_eletronico;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setTipo_usuario(Tipo_usuario tipo_usuario) {
        this.tipo_usuario = tipo_usuario;
    }
}
