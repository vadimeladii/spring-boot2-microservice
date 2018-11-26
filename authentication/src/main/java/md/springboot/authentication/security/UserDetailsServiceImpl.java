package md.springboot.authentication.security;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

/**
 * Created by veladii on 11/25/18.
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder encoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        final List<AppUser> users = Arrays.asList(
                new AppUser(1, "omar", encoder.encode("12345"), "USER"),
                new AppUser(2, "admin", encoder.encode("12345"), "ADMIN")
        );

        for(AppUser appUser: users) {
            if(appUser.username.equals(username)) {

                List<GrantedAuthority> grantedAuthorities = AuthorityUtils
                        .commaSeparatedStringToAuthorityList("ROLE_" + appUser.role);

                return new User(appUser.username, appUser.password, grantedAuthorities);
            }
        }

        throw new UsernameNotFoundException("Username: " + username + " not found");
    }

    @Getter
    @Setter
    private static class AppUser {
        private Integer id;
        private String username, password;
        private String role;

        AppUser(Integer id, String username, String password, String role) {
            this.id = id;
            this.username = username;
            this.password = password;
            this.role = role;
        }
    }
}
