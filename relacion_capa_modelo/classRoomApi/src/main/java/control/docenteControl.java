package control;

import com.example.classRoomApi.Docentes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.docenteServicio;

@Controller
@RequestMapping
public class docenteControl {
    @Autowired
    docenteServicio servicio;

    public ResponseEntity<?>sabe(@RequestBody Docentes datosDocente){
            try{
                return ResponseEntity
                        .status(HttpStatus.CREATED)
                        .body(this.servicio.guardarDocente(datosDocente));
            }
            catch (Exception e) {
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .body(e.getMessage());
            }

        }
}
