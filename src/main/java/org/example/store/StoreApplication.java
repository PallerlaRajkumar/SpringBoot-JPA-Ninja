package org.example.store;

import lombok.Builder;
//import org.example.store.entities.User;
import org.example.store.entities.User;
import org.example.store.repositories.UserRepository;
import org.example.store.services.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import  org.example.store.entities.User.*;

import java.math.BigDecimal;

@Builder
@SpringBootApplication
public class StoreApplication {

    public static void main(String[] args) {

     //Configurable
        ApplicationContext context = SpringApplication.run(StoreApplication.class, args);

       var service = context.getBean(UserService.class);
       service.fetchSortedProducts();
       service.fetchPaginatedProducts(0,10);

      // service.fetchProductsByCriteria();
      //  service.printLoyalProfiles();
       // service.fetchProducts();
           // service.fetchUsers();
       // service.fetchProducts();
       // service.updateProductPrices();
      //  service.manageProducts();
//        service.deleteRelated();
//      service.persistRelated();
//        service.fetchAddress();
//        service.showEntityStates();
//        service.showRelatedEntities();
      //  var repository = context.getBean(UserRepository.class);
       // var user =  repository.findById(1L).orElseThrow();
       // repository.deleteById(1L);

     //   repository.findAll().forEach(u -> System.out.println(u.getEmail()));


     //  System.out.println(user.getEmail());

//        UserRepository repository = context.getBean(UserRepository.class);
//        User user = User.builder()
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
