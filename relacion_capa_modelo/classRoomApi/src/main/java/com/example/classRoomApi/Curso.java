package com.example.classRoomApi;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
@Entity
@Table(name="Curso")

public class Curso {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_curso;
    @Column(name="nombre",length=100,nullable=true)
    private String  nombre;
// linea de codigo para  relaccion  one to many
@ManyToOne
@JoinColumn(name="fk_docente",referencedColumnName="Id_docnete" )
@JsonBackReference
private Docentes docente;
//relacion curso asitencia
@OneToMany(mappedBy="Curso",cascade=CascadeType.ALL)
@JsonManagedReference
private List<Asistencia>asistencia;
//relacion curso materia one to many
@OneToMany(mappedBy="curso",cascade=CascadeType.ALL)
@JsonManagedReference
private List<Materia>materia;
//relacion con curso
@OneToMany(mappedBy="inscripcion",cascade=CascadeType.ALL)
@JsonManagedReference
private List<Inscripcion>inscripcion;
//codigo para construtores

    public Curso() {
    }

    public Curso(Integer id_curso, String nombre) {
        Id_curso = id_curso;
        this.nombre = nombre;
    }
    //codigo para get y set

    public Integer getId_curso() {
        return Id_curso;
    }

    public void setId_curso(Integer id_curso) {
        Id_curso = id_curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
