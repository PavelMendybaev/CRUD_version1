package hiber.service;

import hiber.dao.UserDao;
import hiber.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
public class UserServiceImp implements UserService {




   @Autowired
   private UserDao userDao;





   @Transactional
   @Override
   public void add(User user) {

      userDao.add(user);
   }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }



   @Override
   @Transactional
   public User getCar(int series, String model) {
//      Session session = sessionFactory.openSession();
//
//
//
//     Query query = session.createQuery("FROM User ");
//
//
//     List<User> resultList = query.list();
//
//     User returnUser = null;
//
//     for(User user :resultList){
//        Car car = user.getCar();
//        if(car.getSeries() == series & car.getModel().equals(model)){
//            returnUser = user;
//        }
//     }
//      return returnUser;
       return null;
    }

}
