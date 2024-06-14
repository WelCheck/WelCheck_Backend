package K2LJ.WelCheck_Backend.kakaoapi;

import org.springframework.stereotype.Controller;

public interface KakaoApiController {
    //query받아서, 실제 주소를 반환하는 api
    public String searchAddress(String query);
}
