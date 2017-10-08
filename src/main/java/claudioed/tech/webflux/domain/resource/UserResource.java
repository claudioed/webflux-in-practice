package claudioed.tech.webflux.domain.resource;

import claudioed.tech.webflux.domain.User;
import claudioed.tech.webflux.domain.service.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author claudioed on 05/10/17. Project webflux-in-practice
 */
@RestController
@RequestMapping("/api/user")
public class UserResource {

  private final UserService userService;

  public UserResource(UserService userService) {
    this.userService = userService;
  }

  @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
      produces = MediaType.APPLICATION_JSON_VALUE)
  public Mono<ResponseEntity<User>> newOne(@RequestBody User user){
    return this.userService.save(user).map(data -> ResponseEntity.status(201).body(data));
  }

  @GetMapping("/{id}")
  public Mono<ResponseEntity<User>> loadById(@PathVariable("id") String id){
    return this.userService.loadById(id).map(data -> ResponseEntity.status(200).body(data));
  }

}
