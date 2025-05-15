package com.example.classRoomApi;
import java.time.LocalTime;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
@Entity
@Table(name="calificaciones" )
public class Calificaciones {
// atribitos
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer Id_calificaciones;
    @Column(name="notas")
    private Float notas;
    @Column(name="Fecha_evaluacion")
    private LocalTime Fecha_evaluacion;

    //relacione
    @ManyToOne
    @JoinColumn(name="fk_estudiante",referencedColumnName="Id_estuidiante")
    private Estudiante estudiante;
    // reclacion matareria
    @ManyToOne
    @JoinColumn(name="fk_docente",referencedColumnName="Id_materia")
    private Materia materia;
    // construtor

    public Calificaciones() {
    }

    public Calificaciones(Integer id_calificaciones, Float notas, LocalTime fecha_evaluacion, Estudiante estudiante) {
        Id_calificaciones = id_calificaciones;
        this.notas = notas;
        Fecha_evaluacion = fecha_evaluacion;
        this.estudiante = estudiante;
    }
    //get y set/


    public Integer getId_calificaciones() {
        return Id_calificaciones;
    }

    public void setId_calificaciones(Integer id_calificaciones) {
        Id_calificaciones = id_calificaciones;
    }

    public Float getNotas() {
        return notas;
    }

    public void setNotas(Float notas) {
        this.notas = notas;
    }

    public LocalTime getFecha_evaluacion() {
        return Fecha_evaluacion;
    }

    public void setFecha_evaluacion(LocalTime fecha_evaluacion) {
        Fecha_evaluacion = fecha_evaluacion;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Materia getMateria() {
        return materia;
    }

    public void setMateria(Materia materia) {
        this.materia = materia;
    }
}
