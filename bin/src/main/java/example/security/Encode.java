package example.security;

import org.mindrot.jbcrypt.*;
import java.io.IOException;
import javax.xml.bind.DatatypeConverter;

public class Encode {

  public String hashpw(String pass){
    return  BCrypt.hashpw(pass, BCrypt.gensalt());
  }

  public boolean verify(String pass, String hash){

      return BCrypt.checkpw(pass, hash);
  }
}
