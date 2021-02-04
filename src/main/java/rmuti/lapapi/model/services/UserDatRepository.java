package rmuti.lapapi.model.services;

import org.springframework.data.jpa.repository.JpaRepository;
import rmuti.lapapi.model.tables.UserData;

import java.util.Optional;

public interface UserDatRepository extends JpaRepository<UserData,Integer> {
    public UserData findByUserNameAndPassWord(String userName , String passWord);

}
