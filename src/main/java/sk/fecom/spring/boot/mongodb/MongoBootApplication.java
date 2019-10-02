package sk.fecom.spring.boot.mongodb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sk.fecom.spring.boot.mongodb.repo.UserRepository;

@SpringBootApplication
public class MongoBootApplication implements CommandLineRunner {

    @Autowired
    UserRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(MongoBootApplication.class, args);
    }

    @Override
    public void run(String... args) {
        listAll();
    }

    private void listAll() {
        System.out.println("Listing sample data");
        repository.findAll().forEach(u -> System.out.println(u));
    }
}