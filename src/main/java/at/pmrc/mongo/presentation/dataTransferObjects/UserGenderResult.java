package at.pmrc.mongo.presentation.dataTransferObjects;

import at.pmrc.mongo.model.User;

public record UserGenderResult(int _id,
                               String firstname,
                               String lastname,
                               String gender) {

    public UserGenderResult(User user) {
        this(user.get_id(), user.getFirstname(), user.getLastname(), user.getGender());
    }

    public UserGenderResult(UserRequest userRequest) {
        this(userRequest._id(), userRequest.firstname(), userRequest.firstname(), userRequest.gender());
    }
}