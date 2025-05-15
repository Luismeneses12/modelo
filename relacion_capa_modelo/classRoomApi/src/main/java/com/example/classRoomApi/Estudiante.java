package com.example.classRoomApi;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import  java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;
@Entity
@Table(name="Estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_estuduante;
    @Column(name="Grado")
    private Integer Grado;
    @Column(name="Fecha_nacimiento")
    private LocalTime Fecha_nacimiento;
    @Column(name="Direccion",length=255)
    private String Direccion;
// este estacio es para hacer las entidades relacion
    // relacion uno a uno
    @OneToOne
    @JoinColumn(name="Id_Usuario")
    private Usuario usuario;
    // relacion con la tabla  asistencia
    @OneToMany(mappedBy="Id_estudiante")
    @JsonManagedReference
    private List<Asistencia>asistencia;
    // relacion one to many con califiaciones
    @OneToMany(mappedBy="Id_estudiante")
    @JsonManagedReference
    private List<Materia>materia;
    // relacion con inscripciones
    @OneToOne(mappedBy="Id_estusiante")
    @JsonManagedReference
    private List<Inscripcion>inscripcion;
// este espacio e spara hacer los metodos construtores de la clase

    public Estudiante() {
    }

    public Estudiante(Integer Id_estuduante, Integer grado, LocalTime fecha_nacimiento, String direccion) {
        this.Id_estuduante = Id_estuduante;
        Grado = grado;
        Fecha_nacimiento = fecha_nacimiento;
        Direccion = direccion;
    }
    // este bloque d ecpdigo se hace los get y los set para acceder a los datos

    public Integer getID_estuduante() {
        return Id_estuduante;
    }

    public Integer getGrado() {
        return Grado;
    }

    public LocalTime getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setID_estuduante(Integer Id_estuduante) {
        this.Id_estuduante = Id_estuduante;
    }

    public void setGrado(Integer grado) {
        Grado = grado;
    }

    public void setFecha_nacimiento(LocalTime fecha_nacimiento) {
        Fecha_nacimiento = fecha_nacimiento;
    }

    public void setDireccion(String direccion) {
        Direccion = direccion;
    }
}
