package CheckenProduction.entity.sql;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.persistence.*;

@Entity
//@Table(name = "users")

public class UserEntity {

    public void User(String first_name, String last_name, String email, String password) {}
//
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//
//    @Column(nullable = false)
//    private String first_name;
//
//    @Column(nullable = false)
//    private String last_name;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @Column(nullable = true, unique = true)
//    private String phone_number;
//
//    @Column(nullable = true)
//    private int age;
//
//    @Column(nullable = false, length = 100)
//    private String password;
//
//
//    // Getters and Setters
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getFullName() {
//        return first_name + " " + last_name;
//    }
//
//    public String getFirstName() {
//        return first_name;
//    }
//
//    public void setFirstName(String first_name) {
//        this.first_name = first_name;
//    }
//
//    public String getLastName() {
//        return last_name;
//    }
//
//    public void setLastName(String last_name) {
//        this.last_name = last_name;
//    }
//
//    public void setPhoneNumber(String phone_number) {
//        this.phone_number = phone_number;
//    }
//
//    public String getPhoneNumber() {
//        return phone_number;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String email) {
//        this.password = password;
//    }
//
//    public void setAge(int age) {
//         this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }

//    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//    public static String encodePassword(String rawPassword) {
//        return passwordEncoder.encode(rawPassword);
//    }
//
//    public static boolean matches(String rawPassword, String encodedPassword) {
//        return passwordEncoder.matches(rawPassword, encodedPassword);
//    }
}
