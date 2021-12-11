package g18.reto3.interfaces;

//import java.util.Date;
//import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import g18.reto3.modelo.ModeloUser;

public interface InterfaceUser extends MongoRepository <ModeloUser, Integer> {
    Optional<ModeloUser> findByEmail(String email);
    Optional<ModeloUser> findByEmailAndPassword(String email,String password);
    Optional<ModeloUser> findTopByOrderByIdDesc();

    //List<ModeloUser> findBybirthtDay(Date date);
    //List<ModeloUser> findByMonthBithtDay(String monthBirthtDay);
    //List<ModeloUser> findOneByOrderByIdDesc();
}