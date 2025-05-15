package control;

import com.example.classRoomApi.Asistencia;
import com.example.classRoomApi.Calificaciones;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.calificacionesServicio;


@Controller
@RequestMapping
public class califiacacioneControl {
    @Autowired
    calificacionesServicio servicio;
    public ResponseEntity<?> save(@RequestBody Calificaciones datosCalificaciones){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.guardarcalifiaciones(datosCalificaciones));
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }

    }
}
