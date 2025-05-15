package servicios;

import com.example.classRoomApi.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class usuarioServicio {
@Autowired
    UsuarioRepository usuarioRepository;
// guarde
     public Usuario guardarUsuario(Usuario datosUsiuario)throws Exception{
        try{
            return this.usuarioRepository.save(datosUsiuario);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // listr
    List<Usuario>usuarioList(Usuario Id_usuario){
        try{
            return  this.usuarioRepository.findAll(Id_usuario);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // find by id
    Optional<Usuario>optionalUsuario(Usuario Id_usurio)throws Exception{
        try{
            return this.usuarioRepository.findById(Id_usurio.getID_usuario());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    // elinar
    void elinimarUsuario(Usuario Id_usurario)throws Exception{
        try{
            this.usuarioRepository.deleteById(Id_usurario.getID_usuario());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
