package repocitorio;
import com.example.classRoomApi.Inscripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InscripcionesRepositorio  extends JpaRepository<Inscripcion,Integer> {
    List<Inscripcion> findAll(Inscripcion idInscricion);
}
