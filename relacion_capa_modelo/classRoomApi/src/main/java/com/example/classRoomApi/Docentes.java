package com.example.classRoomApi;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonManagedReference;

// crar anaotaciones

@Entity
@Table(name="Docentes")

public class Docentes {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer Id_docente;
    @Column(name="Docente",length=100,nullable=true)
    private String Especialidad;
    // bloque de codigo para las relacion con la clase padre usurio
    @OneToOne
    @JoinColumn(name="Usuario")
    private Usuario usuario;
    // relacion para oneto many docente curso
    @OneToMany(mappedBy="Docents" ,cascade=CascadeType.ALL)
    @JsonManagedReference
    private List<Curso>curso;
    // bloque de codigo para los construtores

    public Docentes() {
    }

    public Docentes(Integer id_docente, String especialidad) {
        Id_docente = id_docente;
        Especialidad = especialidad;
    }
// bloque de codigo get y set

    public Integer getId_docente() {
        return Id_docente;
    }

    public String getEspecialidad() {
        return Especialidad;
    }

    public void setId_docente(Integer id_docente) {
        Id_docente = id_docente;
    }

    public void setEspecialidad(String especialidad) {
        Especialidad = especialidad;
    }
}
