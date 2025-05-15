package repocitorio;

import com.example.classRoomApi.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MateriaRepositorio  extends JpaRepository<Materia,Integer> {
    List<Materia> findAll(Materia idMateria);
}
