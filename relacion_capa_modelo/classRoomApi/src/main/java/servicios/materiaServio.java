package servicios;

import com.example.classRoomApi.Materia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.MateriaRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class materiaServio {
@Autowired
    MateriaRepositorio materiaRepositorio;
// guardada
    public Materia guardarmateri (Materia datosMateria)throws Exception{
        try {
            return  this.materiaRepositorio.save(datosMateria);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // find all
    List<Materia>materiaList(Materia Id_materia)throws Exception{
        try{
            return this.materiaRepositorio.findAll(Id_materia);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
// find all by id
    Optional<Materia>materiaOptional(Materia Id_materia)throws Exception{
        try{
           return this.materiaRepositorio.findById(Id_materia.getId_materia());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
// elminar
    void elimanarmateria (Materia Id_materia)throws Exception{
        try{
            this.materiaRepositorio.deleteById(Id_materia.getId_materia());
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
