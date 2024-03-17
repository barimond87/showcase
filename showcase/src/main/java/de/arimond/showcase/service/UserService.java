package de.arimond.showcase.service;

import de.arimond.showcase.models.user.UserApiModel;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private UserApiModel getUser(String username){
        UserApiModel model = new UserApiModel("user1","123","userdata");
        return model;
    }
}
