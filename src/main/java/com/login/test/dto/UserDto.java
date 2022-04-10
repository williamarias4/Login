
package com.login.test.dto;

import javax.validation.constraints.NotBlank;
import lombok.Data;

/**
 *
 * @author willi
 */
@Data
public class UserDto {
    
    @NotBlank
    private String username;
    @NotBlank
    private String password;
    private String reset_password_token;
}
