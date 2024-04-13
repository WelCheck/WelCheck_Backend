package K2LJ.WelCheck_Backend.memberpackage.controller.requestdto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class SignInDTO {
    @NotBlank
    String userId;
    @NotBlank
    String password;
}
