package repocitorio;

import com.example.classRoomApi.Calificaciones;
import org.springframework.stereotype.Service;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

@Service
public interface CalifiacacionesRepositorio extends JpaRepository<Calificaciones,Integer> {
    Optional<Calificaciones> findById(Calificaciones idCalifiaciones);

    void deleteById(Calificaciones idCalifiaciones);
}
