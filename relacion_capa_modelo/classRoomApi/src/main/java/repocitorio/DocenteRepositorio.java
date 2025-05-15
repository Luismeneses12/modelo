package repocitorio;

import com.example.classRoomApi.Docentes;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface DocenteRepositorio extends JpaRepository<Docentes,Integer> {
    List<Docentes> findAll(Docentes idDocente);

  //  void delete(Integer idDocente);
// si tengo consultas personalizada se hace en este espacio
}
