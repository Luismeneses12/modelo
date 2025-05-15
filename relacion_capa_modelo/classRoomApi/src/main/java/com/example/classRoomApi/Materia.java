package com.example.classRoomApi;
import java.util.List;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
@Entity
@Table(name="Materia")
public class Materia {
    // atrivutos d ela clase y  coluna¿nas de la tabla de datos
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id_materia;
    @Column(name="nombre",length=100,nullable=false)
    private String nombre;
    // relacion manytoOne con clase curso
    @ManyToOne
    @JoinColumn(name="Id_curso",referencedColumnName="Id_curso")
    @JsonBackReference
    private Curso surso;
    // relacion con la clase califiaciones
    @OneToMany(mappedBy="materia")
    @JsonManagedReference
    private List<Calificaciones>califiaciones;
    //metodo contrutor

    public Materia() {
    }

    public Materia(Integer id_materia, String nombre) {
        Id_materia = id_materia;
        this.nombre = nombre;
    }
    //get y set

    public Integer getId_materia() {
        return Id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_materia(Integer id_materia) {
        Id_materia = id_materia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
