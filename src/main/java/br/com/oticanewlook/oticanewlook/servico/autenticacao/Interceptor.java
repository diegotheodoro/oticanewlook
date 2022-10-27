package br.com.oticanewlook.oticanewlook.servico.autenticacao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

import br.com.oticanewlook.oticanewlook.servico.CookieService;

@Component
public class Interceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
            throws Exception {

        try {
            if (CookieService.getCookie(request, "funcionarioID") != null) {
                return true;
            }
        } catch (Exception erro) {
        }

        response.sendRedirect("/");
        return false;
    }
}
