package control;

import com.example.classRoomApi.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.usuarioServicio;

@Controller
@RequestMapping
public class usuarioControl {
 @Autowired
 usuarioServicio servicio;

 public ResponseEntity<?>save(@RequestBody Usuario datosUsuario){
     try{
         return ResponseEntity
                 .status(HttpStatus.CREATED)
                 .body(this.servicio.guardarUsuario(datosUsuario));
     }
     catch (Exception e) {
         return ResponseEntity
                 .status(HttpStatus.BAD_REQUEST)
                 .body(e.getMessage());
     }
 }
}
