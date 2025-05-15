package servicios;

import com.example.classRoomApi.Docentes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repocitorio.DocenteRepositorio;

import java.util.List;

@Service
public class docenteServicio  {
@Autowired
private DocenteRepositorio docenteRepositorio;
// metodo para guacta
public Docentes guardarDocente( Docentes datosDocente)throws Exception{
 try {
 return  this.docenteRepositorio.save(datosDocente);
 }
 catch(Exception e ){
     System.out.println("erro en conxecion"+e.getMessage());
    // throws Exception
 }
    return datosDocente;
}

// se buscar por lista  a todos
public List<Docentes>listarDocdnte(Docentes Id_docente)throws Exception{
    try {
        return docenteRepositorio.findAll(Id_docente);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }
    // metodo para burcar por id
public Object optionalDocentes (Docentes Id_docente)throws Exception{
    try {
        return docenteRepositorio.findById(Id_docente.getId_docente());
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
    }

    //metodo para modificar
    public Docentes modificarDocente(Docentes Id_docente)throws Exception{
    this.docenteRepositorio.getReferenceById(Id_docente.getId_docente());
        return Id_docente;
    }

    // meto para eliminar
    public void eliminarUsuario(Docentes ID_docente)throws Exception{
    try {
        docenteRepositorio.delete(ID_docente);
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
}
