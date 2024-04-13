package K2LJ.WelCheck_Backend.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{

        //** url경로 별 접근 권한 설정 **//
        http.authorizeHttpRequests((auth) -> auth
                .requestMatchers("/","/members", "/login").permitAll()	//루트, 로그인 페이지
                //.requestMatchers(("")).authenticated()
                //.requestMatchers("myPage").hasAnyRole("ADMIN", "USER")	//마이페이지
                //.requestMatchers("").hasRole("")
                .anyRequest().denyAll()
        );
/*
        - requestMatchers(경로들) : 경로들에 대한 권한 설정
        - anyRequest() : requestMatchers에 사용된 경로들 제외한 나머지 경로들

        - permitAll() : requestMatchers의 경로들에 모든 사용자에게 접근 허용
        - authenticated() : requestMatchers의 경로들에 로그인만 하면 접근 허용
        - hasRole() : requestMatchers의 경로들에 로그인&특정한 Role이 있어야 접근 허용
        - hasAnyRole() : requestMatchers의 경로들에 로그인&여러가지 Role들에게 접근 허용
        - denyAll() : requestMatchers의 경로들에 모든 사용자들의 접근 거부
*/

        //** 로그인 실패시 리다이렉트 경로 & 로그인 폼으로 받은 데이터 전달 경로 **//
        http.formLogin((auth) -> auth.loginPage("/login")   //loginPage() : 리다이렉트하여 보낼 로그인페이지 경로 설정
                .loginProcessingUrl("/loginProc")   //loginProcessingUrl() : 로그인폼으로 받은 데이터를 보낼 페이지 경로 설정
                .permitAll()
        );

        http.csrf((auth) -> auth.disable());

        return http.build();		//return statement 마지막에 넣어줘야함
    }

    //패스워드 암호화 서비스 객체
    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder(){
        return new BCryptPasswordEncoder();
    }

}
