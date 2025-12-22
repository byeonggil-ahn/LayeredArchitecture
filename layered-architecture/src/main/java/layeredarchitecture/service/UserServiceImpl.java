package layeredarchitecture.service;

import org.springframework.stereotype.Service;

import layeredarchitecture.domain.User;
import layeredarchitecture.dto.UserRequestDto;
import layeredarchitecture.repository.UserRepository;

/**
 * Service 구현체
 * - 비즈니스 로직 처리
 * - Repository 조합
 */
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // 생성자 주입 (권장)
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(UserRequestDto dto) {
        // DTO → Entity 변환
        User user = new User(1L, dto.getName());

        // 저장 후 결과 반환
        return userRepository.save(user);
    }
}