package jp.bootware.authesample;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootTest
public class AuthenticationSampleAppTest {

  @Autowired PasswordEncoder passwordEncoder;

  @Test
  public void encryptedPassword() {
    System.out.println(passwordEncoder.encode("password"));
  }
}