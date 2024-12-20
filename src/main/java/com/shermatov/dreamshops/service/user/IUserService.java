package com.shermatov.dreamshops.service.user;

import com.shermatov.dreamshops.dto.UserDto;
import com.shermatov.dreamshops.model.User;
import com.shermatov.dreamshops.request.CreateUserRequest;
import com.shermatov.dreamshops.request.UserUpdateRequest;

import java.util.List;

public interface IUserService {
    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);

    User getAuthenticatedUser();

    List<User> getAllUsers();
}
