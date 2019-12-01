
package Controller.Views;

import Controller.Validations;
import Extra.UserDAO;
import Interface.UserInterface;

public class LoginController implements UserInterface {

    @Override
    public boolean checkLogin(String login, String senha) throws Exception {
  
        Validations.nome(login);
        Validations.senha(senha);
        
        return new UserDAO().checkLogin(login, senha);

    }
    
    
    
    
    
}
