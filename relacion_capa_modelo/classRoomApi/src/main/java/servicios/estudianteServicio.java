package servicios;

import com.example.classRoomApi.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.AsistenciaRepositorio;
import repocitorio.EstudiantesRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class estudianteServicio {
@Autowired
public EstudiantesRepositorio estudiantesRepositorio;
//guardar usuario
    public Estudiante guardarEstudiante(Estudiante datosEstudiante)throws Exception{
        try{
            return  this.estudiantesRepositorio.save(datosEstudiante);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // buscar todos
    public List<Estudiante>listarEstudiante(Estudiante ID_estudiante)throws Exception{
        try {
            return this.estudiantesRepositorio.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // buscar por uno id
    public Optional<Estudiante>optionalEstudiante(Estudiante ID_estuadiante)throws Exception{
        try{
            return  estudiantesRepositorio.findAllById(ID_estuadiante);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // eliminar Estudiante
    void eliminarEstruduante (Estudiante Id_estudiante)throws Exception{
        try {
            estudiantesRepositorio.deleteById(Id_estudiante);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
