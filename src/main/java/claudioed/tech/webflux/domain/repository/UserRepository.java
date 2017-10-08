package claudioed.tech.webflux.domain.repository;

import claudioed.tech.webflux.domain.User;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;

/**
 * @author claudioed on 05/10/17. Project webflux-in-practice
 */
public interface UserRepository extends ReactiveCassandraRepository<User,String> {}
