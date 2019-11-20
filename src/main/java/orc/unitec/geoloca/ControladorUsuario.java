
package orc.unitec.geoloca;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.Arrays;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class ControladorUsuario {
    
 @Autowired//inyeccion dedependencias: oculta implementaciones concretas y expone las abstractas solamente
    RepoUsuario repoUsuario;
    
    @GetMapping("/usuario")
    public List<Usuario>  obtenerUsuarios(){
        //simulamos un usuario
        //**findAll**  está heredado de MongoRepository<Usuario, String> 
        return repoUsuario.findAll();//esto es el equivalente al select * from usuario
    }
    // Metodo POST para guardar un Usuario
    //
    @PostMapping("/usuario")
    public Estatus guardarUsuario(@RequestBody String json) throws Exception{
        //Mapeamos el objeto llegado
        ObjectMapper maper=new ObjectMapper();// de un objeto json lo convierte a objeto java y o guarda en mongo db a travez del repositorio
        Usuario u= maper.readValue(json,Usuario.class);
        //Ya despues de mapear guardamos 
        repoUsuario.save(u);
        //generamos el estatus
        Estatus e=new Estatus();
        e.setMensaje("Usuario ya se guardo!!");
        e.setSuccess(true);
        return e;
    }
}