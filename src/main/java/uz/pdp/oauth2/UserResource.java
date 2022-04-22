package uz.pdp.oauth2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class UserResource {
    @GetMapping("/hello")
     public String hello(){
        return "hello world";
    }
    @GetMapping("/user")
    public ResponseEntity<Principal> getUser(Principal principal){
        return ResponseEntity.ok(principal);

    }

}
