package com.example.classRoomApi;
import jakarta.persistence.*;
import java.time.LocalTime;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="Inscripcion")
public class Inscripcion {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_inscripcion;
    @Column(name="fecha_inscripcion")
    private LocalTime Fecha_inscripcion;
//relacion estuduante
    @ManyToOne
    @JoinColumn(name="fk_Estudiante",referencedColumnName="Id_estudiante")
    @JsonBackReference
    private Estudiante estudiante;
// relacion curso
    @ManyToOne
    @JoinColumn(name="fk_curso",referencedColumnName="Id_curso")
    @JsonBackReference
    private Curso curso;
//construtos

    public Inscripcion() {
    }

    public Inscripcion(Integer id_inscripcion, Curso curso, Estudiante estudiante, LocalTime fecha_inscripcion) {
        Id_inscripcion = id_inscripcion;
        this.curso = curso;
        this.estudiante = estudiante;
        Fecha_inscripcion = fecha_inscripcion;
    }
    // set y get

    public Integer getId_inscripcion() {
        return Id_inscripcion;
    }

    public LocalTime getFecha_inscripcion() {
        return Fecha_inscripcion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setId_inscripcion(Integer id_inscripcion) {
        Id_inscripcion = id_inscripcion;
    }

    public void setFecha_inscripcion(LocalTime fecha_inscripcion) {
        Fecha_inscripcion = fecha_inscripcion;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
