package control;

import com.example.classRoomApi.Inscripcion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.inscripciponServicio;

@Controller
@RequestMapping
public class inscripcioonContol {
    @Autowired
    inscripciponServicio servicio;

    public ResponseEntity<?>save(@RequestBody Inscripcion datosInscipcion){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarInscripcion(datosInscipcion));
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }

    }
}
