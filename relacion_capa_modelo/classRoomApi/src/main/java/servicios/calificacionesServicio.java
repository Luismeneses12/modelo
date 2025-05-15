package servicios;

import com.example.classRoomApi.Calificaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.CalifiacacionesRepositorio;

import java.util.List;
import java.util.Optional;

@Service
public class calificacionesServicio {
@Autowired
    CalifiacacionesRepositorio califiacacionesRepositorio;
// guardad califiaciones
    public Calificaciones guardarcalifiaciones (Calificaciones datosCalifiacacines)throws Exception {
        try {
            return this.califiacacionesRepositorio.save(datosCalifiacacines);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // find alll user  for id
    public List<Calificaciones>listarCalificacines(Calificaciones Id_califiaciones )throws Exception{
        try {
            return califiacacionesRepositorio.findAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // find for id
    public Optional<Calificaciones>optionalCalificaciones(Calificaciones ID_califiaciones )throws Exception{
        try{
            return this.califiacacionesRepositorio.findById(ID_califiaciones);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // eliminar
    void eloiminarCalificaciones(Calificaciones Id_califiaciones)throws Exception{
        try{
            this.califiacacionesRepositorio.deleteById(Id_califiaciones);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
