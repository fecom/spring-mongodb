package sk.fecom.spring.boot.mongodb.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import sk.fecom.spring.boot.mongodb.domain.Users;

import java.util.List;

public interface UserRepository extends MongoRepository<Users, String> {

}
