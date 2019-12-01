package Extra;

import DAO.*;
import Model.*;

public class Data_Input {

    public static void main(String[] args) {

        //CADASTANDO CLIENTES↓
        try {
            Cliente cli = new Cliente();

            //1
            cli.setNome("Lukas Rodrigues");
            cli.setRg("9311567");
            cli.setCpf("10645045403");
            new ClienteDAO().create(cli);

            //2
            cli.setNome("Isabella Cristina");
            cli.setRg("10359210");
            cli.setCpf("10755793412");
            new ClienteDAO().create(cli);

            //3
            cli.setNome("Wainy Kleia");
            cli.setRg("1504359");
            cli.setCpf("01129276678");
            new ClienteDAO().create(cli);

            //4
            cli.setNome("Cassiano Nery");
            cli.setRg("147235");
            cli.setCpf("24242424269");
            new ClienteDAO().create(cli);

            //5
            cli.setNome("Gerusa Melo");
            cli.setRg("9999999");
            cli.setCpf("11111111111");
            new ClienteDAO().create(cli);
            
            //6
            cli.setNome("Helio Filho");
            cli.setRg("88888888");
            cli.setCpf("22222222222");
            new ClienteDAO().create(cli);
            
            System.out.println("Cliente cadastrados --SOUT ");
        } catch (Exception e) {
            System.out.println("Clientes cadastrados --CATCH" + e.getMessage());
        }

        //CADASTRANDO FUNCIONARIOS↓
        try {
            Funcionario func = new Funcionario();

            //1
            func.setNome("Ryan Buceteiro");
            func.setRg("7777777");
            func.setCpf("33333333333");
            func.setSalario(5000);
            new FuncionarioDAO().create(func);

            //2
            func.setNome("Ana Julia");
            func.setRg("6666666");
            func.setCpf("44444444444");
            func.setSalario(3000);
            new FuncionarioDAO().create(func);

            //3
            func.setNome("Yego Freitas");
            func.setRg("5555555");
            func.setCpf("55555555555");
            func.setSalario(1500);
            new FuncionarioDAO().create(func);

            //4
            func.setNome("Afonso Braguilha");
            func.setRg("4444444");
            func.setCpf("66666666666");
            func.setSalario(1500);
            new FuncionarioDAO().create(func);

            //5
            func.setNome("Gustavão");
            func.setRg("33333333");
            func.setCpf("77777777777");
            func.setSalario(1500);
            new FuncionarioDAO().create(func);

            //6
            func.setNome("Leon Leonino");
            func.setRg("2222222");
            func.setCpf("88888888888");
            func.setSalario(1500);
            new FuncionarioDAO().create(func);

            System.out.println("Funcionario cadastrados --SOUT ");
        } catch (Exception e) {
            System.out.println("Funcionario cadastrados --CATCH" + e.getMessage());
        }

        //CADASTRANDO PROBLEMAS↓
        try {
            Problema prob = new Problema();

            //1
            prob.setNome("Igreja");
            prob.setDescricao("Infelizmente por muitos anos ela vem iludindo o povo");
            new ProblemaDAO().create(prob);
            
            //2
            prob.setNome("Dinheiro");
            prob.setDescricao("TA EM FALTA!! PRECISO DE MAIS");
            new ProblemaDAO().create(prob);

            //3
            prob.setNome("Trabalho");
            prob.setDescricao("Aho UÓ, precisa ter mais no brasil!!");
            new ProblemaDAO().create(prob);
            
            //4
            prob.setNome("Brasil");
            prob.setDescricao("O problema em sí, não é o Brasil mas sim quem governa ele!!");
            new ProblemaDAO().create(prob);

            //5
            prob.setNome("Marco");
            prob.setDescricao("TA ERRADO, TODO ERRADO!!!");
            new ProblemaDAO().create(prob);

            //6
            prob.setNome("ALUNOS");
            prob.setDescricao("PORRA MAGO, FAZ ESSA MERDA DIREITO!!");
            new ProblemaDAO().create(prob);
            
            System.out.println("Problema cadastrados --SOUT ");
        } catch (Exception e) {
            System.out.println("Problema cadastrados --CATCH" + e.getMessage());
        }

    }

}
