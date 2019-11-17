package technicalblog.service;

import technicalblog.model.User;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public boolean login(User user){
        if(user.getUsername().equals( "validUser" )){
           return true;
        }
        else {
            return false;
        }
    }
}
