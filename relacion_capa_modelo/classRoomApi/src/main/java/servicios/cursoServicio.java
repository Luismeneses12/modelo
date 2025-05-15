package servicios;

import com.example.classRoomApi.Curso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.CursoRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class cursoServicio {
@Autowired
    CursoRepositorio cursoRepositorio;
// guardar
    public Curso guardaCurso (Curso datosCurso){
        try {
           return cursoRepositorio.save(datosCurso);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
// find all for id
List<Curso>listarCurso(Curso Id_curso)throws Exception {
    try {
        return this.cursoRepositorio.findAll(Id_curso);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}

// buscar por id
    Optional<Curso>optionalCurso(Curso Id_curso)throws Exception{
        try{
            return this.cursoRepositorio.findById(Id_curso.getId_curso());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
// eliminar
    void eliminar (Curso Id_curso)throws Exception{
        try {
            cursoRepositorio.deleteById(Id_curso.getId_curso());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }




}
