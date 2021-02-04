package rmuti.lapapi.controller;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rmuti.lapapi.model.services.UserDatRepository;
import rmuti.lapapi.model.tables.UserData;

@RestController
@RequestMapping("/user")
public class UserDataController {
    @Autowired
    private UserDatRepository userDatRepository; // UserData

    @PostMapping("/login")

    public Object login(@RequestParam String userName ,@RequestParam String passWord){
        APIResponse res = new APIResponse();
        UserData userData = userDatRepository.findByUserNameAndPassWord(userName,passWord);
        if(userData == null){
            res.setData(0);
        }
        else
        {
            res.setData(1);
        }
        return res;

    }

    @PostMapping("/register")
    public Object registor(UserData userData) {
        APIResponse res = new APIResponse();
        userDatRepository.save(userData);
        return res;
    }
}
