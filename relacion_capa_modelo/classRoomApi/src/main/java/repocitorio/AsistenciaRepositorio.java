package repocitorio;

import com.example.classRoomApi.Asistencia;
import com.example.classRoomApi.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface AsistenciaRepositorio extends JpaRepository<Asistencia,Integer> {
    List<Asistencia> findAll(Asistencia idAsistencia);

    void deleteById(Estudiante idEstuduante);
//
}
