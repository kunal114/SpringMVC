package springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springMVC.FormDao.FormDao;
import springMVC.model.User;

@Service
public class FormService {

    @Autowired
    private FormDao formDao;

    public void addUser(User user){
        formDao.addUser(user);
    }
}
