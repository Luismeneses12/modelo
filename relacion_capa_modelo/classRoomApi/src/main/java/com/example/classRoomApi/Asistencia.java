package com.example.classRoomApi;
import  java.time.LocalTime;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonBackReference;
import ayuda.Tipo_usuario;
@Entity
@Table(name="Asistencia")
public class Asistencia {
    // variables clase y cloumnas db
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer ID_asistencia;
    @Column(name="Fecha_asistencia",nullable=false)
    private LocalTime Fecha_asistenmcia;
    @Column(name="estado",nullable=false)
    private Tipo_usuario estado;
    // relaciones
    @ManyToOne
    @JoinColumn(name="fk_curso",referencedColumnName="Id_curso")
    @JsonBackReference
    private Curso curso;
    // relacion manyToOne con la clase estuduante
    @ManyToOne
    @JoinColumn(name="fk_estudiante",referencedColumnName="Id_estudiante")
    @JsonBackReference
    private Estudiante estudiante;
    //metodos contrustutores

    public Asistencia() {
    }

    public Asistencia(Integer ID_asistencia, LocalTime fecha_asistenmcia, Tipo_usuario estado, Curso curso) {
        this.ID_asistencia = ID_asistencia;
        Fecha_asistenmcia = fecha_asistenmcia;
        this.estado = estado;
        this.curso = curso;
    }
    //metodos get y set


    public Integer getID_asistencia() {
        return ID_asistencia;
    }

    public LocalTime getFecha_asistenmcia() {
        return Fecha_asistenmcia;
    }

    public Tipo_usuario getEstado() {
        return estado;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setID_asistencia(Integer ID_asistencia) {
        this.ID_asistencia = ID_asistencia;
    }

    public void setFecha_asistenmcia(LocalTime fecha_asistenmcia) {
        Fecha_asistenmcia = fecha_asistenmcia;
    }

    public void setEstado(Tipo_usuario estado) {
        this.estado = estado;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

}
