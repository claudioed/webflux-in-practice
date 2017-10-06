package claudioed.tech.webflux.service;

import claudioed.tech.webflux.domain.User;
import claudioed.tech.webflux.repository.UserRepository;
import lombok.NonNull;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author claudioed on 05/10/17. Project webflux-in-practice
 */
@Service
public class UserService {

  private final UserRepository userRepository;

  public UserService(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  public Mono<User> save(@NonNull User user) {
    return this.userRepository.save(user);
  }

  public Mono<User> loadById(@NonNull String id) {
    return this.userRepository.findById(id);
  }

}
