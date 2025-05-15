package repocitorio;
import com.example.classRoomApi.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface EstudiantesRepositorio extends JpaRepository<Estudiante, Integer> {

    List<Estudiante> findAll(Estudiante idEstudiante);

    Optional<Estudiante> findAllById(Estudiante idEstuadiante);

    void deleteById(Estudiante idEstudiante);
}
