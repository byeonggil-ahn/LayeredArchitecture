package layeredarchitecture.service;

import layeredarchitecture.domain.User;
import layeredarchitecture.dto.UserRequestDto;

public interface UserService {

    User createUser(UserRequestDto dto);

}
