package pmrc.at.mongo.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

@Document(collection = "users")
public class users extends AbstractPersistable<Long> {

    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String gender;
    private String year;
}