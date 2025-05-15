package control;


import com.example.classRoomApi.Asistencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import servicios.AsistenciaServicio;

@Controller
@RequestMapping
public class asistenciaControl {
    @Autowired
    AsistenciaServicio servicio;
    public ResponseEntity<?>save(@RequestBody Asistencia  datosAsistencia){
        try{
            return ResponseEntity
                    .status(HttpStatus.CREATED)
                    .body(this.servicio.asistenciaguardar(datosAsistencia));
        }
        catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }

    }

}

