package br.com.oticanewlook.oticanewlook.servico.autenticacao;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@Deprecated
public class InterceptorAppConfig extends WebMvcConfigurerAdapter{

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new Interceptor())
                .excludePathPatterns(
                        "/",
                        "/logar",
                        "/css/**",
                        "/image/**",
                        "/js/**"
                        );
    }
}
