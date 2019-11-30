
package Extra;

import Controller.ClienteController;
import Model.Cliente;


public class DataInput {

    public static void main(String[] args) {
        
        Cliente cli = new Cliente();
        try {
            cli.setNome("Yegooo");
            cli.setRg("988899");
            cli.setCpf("00000000000");
            
            new ClienteController().create(cli);
            System.out.println("cadastrou ");
            
        } catch (Exception e) {
            System.out.println("cadastrou" + e.getMessage());
        }
        
        
        
        
    }
    
}
