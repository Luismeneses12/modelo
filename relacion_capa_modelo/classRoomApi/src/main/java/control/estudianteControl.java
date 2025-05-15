package control;

import com.example.classRoomApi.Estudiante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.estudianteServicio;

@Controller
@RequestMapping
public class estudianteControl {
    @Autowired
    estudianteServicio servicio;

    public ResponseEntity<?>save(@RequestBody Estudiante datosEstudiante) {
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarEstudiante(datosEstudiante));
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }
    }
}
