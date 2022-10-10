package com.abdou.security;

import com.abdou.security.model.ERole;
import com.abdou.security.model.Role;
import com.abdou.security.model.User;
import com.abdou.security.service.RoleService;
import com.abdou.security.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityApplication.class, args);
    }

    //@Bean
    CommandLineRunner run(UserService userService, RoleService roleService) {
        return args -> {
            roleService.saveRole(new Role(null, ERole.ROLE_USER));
            roleService.saveRole(new Role(null, ERole.ROLE_ADMIN));
            roleService.saveRole(new Role(null, ERole.ROLE_SUPER_ADMIN));
            roleService.saveRole(new Role(null, ERole.ROLE_MANAGER));

            userService.saveUser(new User(null,"abdou12357","a_abdou@esi.dz","1234",new ArrayList<>()));
            userService.saveUser(new User(null,"hamza12357","a_hamza@esi.dz","1234",new ArrayList<>()));

            userService.addRoleToUser("abdou12357", ERole.ROLE_USER);
            userService.addRoleToUser("abdou12357", ERole.ROLE_SUPER_ADMIN);
            userService.addRoleToUser("hamza12357", ERole.ROLE_SUPER_ADMIN);
            userService.addRoleToUser("hamza12357", ERole.ROLE_MANAGER);
            userService.addRoleToUser("hamza12357", ERole.ROLE_ADMIN);
            userService.addRoleToUser("hamza12357", ERole.ROLE_USER);
        };
    }

}
