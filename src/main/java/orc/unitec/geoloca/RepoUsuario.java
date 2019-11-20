package orc.unitec.geoloca;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Aaron
 */
public interface RepoUsuario extends MongoRepository<Usuario, String>{
    
    
}
