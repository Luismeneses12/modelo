package servicios;

import com.example.classRoomApi.Asistencia;
import com.example.classRoomApi.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.AsistenciaRepositorio;

import java.util.List;

@Service
public class AsistenciaServicio {
@Autowired
    AsistenciaRepositorio asistenciaRepositorio;
// guardar
    public Asistencia asistenciaguardar (Asistencia datosAsistencia)throws Exception {
        try {
            this.asistenciaRepositorio.save(datosAsistencia);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return  datosAsistencia;
    }
    //bucar por id
    public List<Asistencia>listarAsistencia(Asistencia Id_asistencia)throws Exception{
        try{
         return  asistenciaRepositorio.findAll(Id_asistencia);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //metodo para eliminar
    public  void  EliminarAsistencia(Asistencia ID_asisitencia)throws Exception{
        try{
            this.asistenciaRepositorio.deleteById(ID_asisitencia.getID_asistencia());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
