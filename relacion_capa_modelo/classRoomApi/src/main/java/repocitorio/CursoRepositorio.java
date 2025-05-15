package repocitorio;

import com.example.classRoomApi.Curso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CursoRepositorio extends JpaRepository<Curso,Integer>
{

    List<Curso> findAll(Curso idCurso);
}
