package claudioed.tech.webflux.domain;

import lombok.Data;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

/**
 * @author claudioed on 05/10/17. Project webflux-in-practice
 */
@Data
@Table("users")
public class User {

  @PrimaryKey
  String id;

  String name;

}
