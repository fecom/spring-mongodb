package sk.fecom.spring.boot.mongodb.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "users")
public class Users {

	@Id
	private String id;
	private String user;
	private String password;

	public Users(String username, String password) {
		this.user = username;
		this.password = password;
	}
}
