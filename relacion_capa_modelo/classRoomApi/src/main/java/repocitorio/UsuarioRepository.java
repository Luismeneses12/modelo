package repocitorio;

import com.example.classRoomApi.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface UsuarioRepository  extends JpaRepository<Usuario, Integer> {
    List<Usuario> findAll(Usuario idUsuario);
}
