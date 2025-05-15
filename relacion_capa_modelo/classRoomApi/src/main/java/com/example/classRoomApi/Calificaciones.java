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

    //get y set/


}
