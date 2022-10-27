package br.com.oticanewlook.oticanewlook.servico;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.Optional;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CookieService {
    public static void setCookie(HttpServletResponse response, String id, String valor, int segundos)
            throws IOException {
        Cookie cookie = new Cookie(id, URLEncoder.encode(valor, "UTF-8"));
        cookie.setMaxAge(segundos);
        cookie.setHttpOnly(true);
        response.addCookie(cookie);
    }

    public static String getCookie(HttpServletRequest request, String id) throws UnsupportedEncodingException {
        String resultado = Optional.ofNullable(request.getCookies())
                .flatMap(cookies -> Arrays.stream(cookies)
                        .filter(cookie -> id.equals(cookie.getName()))
                        .findAny())
                .map(e -> e.getValue())
                .orElse(null);

        resultado = URLDecoder.decode(resultado, "UTF-8");
        return resultado;
    }
}
