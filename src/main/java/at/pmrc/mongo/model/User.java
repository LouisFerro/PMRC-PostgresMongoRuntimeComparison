package at.pmrc.mongo.model;

import lombok.*;
import jakarta.persistence.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor

@Document(collection = "users")
public class User {

    @Id
    private ObjectId _id;
    private String firstname;
    private String lastname;
    private String email;
    private String password;
    private String gender;
    private String year;
}