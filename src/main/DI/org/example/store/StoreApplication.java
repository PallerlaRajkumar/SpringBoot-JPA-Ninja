package org.example.store;

import java.util.ArrayList;

import lombok.Builder;
import org.example.store.entities.Address;
import org.example.store.entities.Profile;
import org.example.store.entities.Tag;
//import org.example.store.entities.User;
import org.example.store.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import static org.example.store.User.*;

@Builder
@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

     //Configurable
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

//        UserRepository repository = context.getBean(UserRepository.class);
//        User user = User.builder()
//                .id(1L)
//                .name("john")  // Add the actual name
//                .email("john@gmail.com")
//                .password("password")  // Should be hashed before saving
//                .build();
//
//
//        repository.save(user);


//      var orderService = context.getBean(OrderService.class).placeOrder();
//          var OrderService = context.getBean(OrderService.class);
//          var OrderService2 = context.getBean(OrderService.class);
//
//          OrderService.placeOrder();
//
//
//          var resource = context.getBean(HeavyResource.class);
//          //notificationManager.sendNotification("Hello");
//
//        var userService = context.getBean(UserService.class);
//        userService.registerUser(new User( 1L,  "pallerla@gmail.com",  "123456", null));
//        userService.registerUser(new User( 2L,  "pallerla1@gmail.com",  "123456", null));
//
//
//
//
//        context.close();


//        var user = User.builder()
//                .id(1L)
//                .name("John Doe")
//                .password("password")
//                .email("pallerla@gmail.com")
//                .addresses(new ArrayList<>())
//                .build();
//
//  var address = Address.builder()
//          .street("street")
//          .city("city")
//          .state("state")
//          .zip("zip")
//          .build();
//
//  user.getAddresses().add(address);
//        System.out.println(user);


       // var tag = new Tag("tag1");
       // user.addTag(String.valueOf(tag));
//        user.addTag("tag1");
//
//        var profile = Profile.builder()
//                .bio("bio")
//                        .build();
//        user.setProfile(profile);
//        profile.setUser(user);
//        System.out.println(user);


    }
}
