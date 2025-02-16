package CheckenProduction.services;

import CheckenProduction.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;
//    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // Register User
//    public UserEntity registerUser(String first_name,String last_name, String email, String rawPassword, int age, String phone_number) {
////        String encodedPassword = passwordEncoder.encode(rawPassword);
//        UserEntity user = new UserEntity();
//        user.setFirstName(first_name);
//        user.setLastName(last_name);
//        user.setEmail(email);
//        user.setAge(age);
//        user.setPhoneNumber(phone_number);
//        user.setPassword(rawPassword);
//        return userRepository.save(user); // Save user to database
//    }

    // Authenticate (Login)
//    public boolean login(String username, String rawPassword) {
//        UserEntity user = userRepository.findByUsername(username);
////        return user != null && passwordEncoder.matches(rawPassword, user.getPassword());
//        return user != null && rawPassword == user.getPassword();
//    }
}
