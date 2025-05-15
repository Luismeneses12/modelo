package servicios;

import com.example.classRoomApi.Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.InscripcionesRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class inscripciponServicio {
@Autowired
    InscripcionesRepositorio inscripcionesRepositorio;
// guardar
    public Inscripcion guardarInscripcion( Inscripcion datoInscritos)throws Exception{
        try{
            return inscripcionesRepositorio.save(datoInscritos);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // listar inscricion
    public List<Inscripcion>inscripcionList(Inscripcion Id_inscricion)throws Exception{
        try {
            return this.inscripcionesRepositorio.findAll(Id_inscricion);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // por id
    public Optional<Inscripcion>optionalInscripcion(Inscripcion Id_insciriocion)throws Exception{
        try{
            return  this.inscripcionesRepositorio.findById(Id_insciriocion.getId_inscripcion());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    void elinarInscricion(Inscripcion Id_inscripcion)throws Exception{
        try {
            this.inscripcionesRepositorio.deleteById(Id_inscripcion.getId_inscripcion());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
