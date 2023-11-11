package io.pro.educare.application.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.converter.Converter;
import org.springframework.security.authentication.AbstractAuthenticationToken;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;


@EnableWebSecurity
@Configuration
@EnableMethodSecurity(securedEnabled = true, jsr250Enabled = true)
public class SecurityManager {
    private final String EDUCARE_ADMIN = "educare_admin";
    /*school*/
    private final String EDUCARE_SCHOOL_CREATE = "educare_school_create";
    private final String EDUCARE_SCHOOL_RETRIEVE = "educare_school_create";
    private final String EDUCARE_SCHOOL_DELETE = "educare_school_create";
    private final String EDUCARE_SCHOOL_UPDATE = "educare_school_create";

    /*employee*/
    private final String EDUCARE_EMPLOYEE_CREATE = "educare_employee_create";
    private final String EDUCARE_EMPLOYEE_RETRIEVE = "educare_employee_retrieve";
    private final String EDUCARE_EMPLOYEE_DELETE = "educare_employee_delete";
    private final String EDUCARE_EMPLOYEE_UPDATE = "educare_employee_update";

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http
                .authorizeHttpRequests(
                        authorize -> authorize
                                .requestMatchers(new AntPathRequestMatcher("/school/**", "POST")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_SCHOOL_CREATE)
                                .requestMatchers(new AntPathRequestMatcher("/school/**", "GET")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_EMPLOYEE_RETRIEVE)
                                .requestMatchers(new AntPathRequestMatcher("/school/**", "DELETE")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_EMPLOYEE_DELETE)
                                .requestMatchers(new AntPathRequestMatcher("/school/**", "PUT")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_SCHOOL_UPDATE)

                                .requestMatchers(new AntPathRequestMatcher("/employee/**", "POST")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_EMPLOYEE_CREATE)
                                .requestMatchers(new AntPathRequestMatcher("/employee/**", "GET")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_EMPLOYEE_RETRIEVE)
                                .requestMatchers(new AntPathRequestMatcher("/employee/**", "DELETE")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_EMPLOYEE_DELETE)
                                .requestMatchers(new AntPathRequestMatcher("/employee/**", "PUT")).hasAnyRole(EDUCARE_ADMIN, EDUCARE_EMPLOYEE_UPDATE)
                                .anyRequest().hasAnyRole()
                )
                .oauth2ResourceServer(
                        auth -> auth.jwt(jwtConfigurer ->
                                jwtConfigurer.jwtAuthenticationConverter(new KeycloakDecoder()))
                )
                .build();
    }

    private static class KeycloakDecoder implements Converter<Jwt, AbstractAuthenticationToken> {

        @Override
        public AbstractAuthenticationToken convert(Jwt source) {
            return null;
        }

        @Override
        public <U> Converter<Jwt, U> andThen(Converter<? super AbstractAuthenticationToken, ? extends U> after) {
            return Converter.super.andThen(after);
        }
    }
}
