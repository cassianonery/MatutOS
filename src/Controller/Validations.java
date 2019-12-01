
package Controller;

import java.sql.Date;

public class Validations {

    //Tratamento dos inputs de NUMEROS em locais NÃO permitidos↓------------------------------------------------------------------
    public static boolean numbers(String palavra){
        if (palavra.trim().equals("")) {
            return false;
        }
        String numeros = "0123456789";
        for (int i = 0; i < palavra.length(); i++) {
            String l = palavra.substring(i, i +1);
            
            if (numeros.contains(l) == false) {
                return false;
            }
        } 
        return true;      
    }
    
    
    //Trata os CPFs↓------------------------------------------------------------------
    public static void cpf(String cpf) throws Exception{
        if (cpf == null) {
             throw new Exception("O CPF é um campo OBRIGATORIO");
        }
        if (cpf.equals("") || cpf.isEmpty()) {
            throw new Exception("Favor insira o CPF corretamente");
        }
        if (cpf.length() != 11) {
           throw new Exception("O CPF não pode conter menos de 11 digitos");
        }
        if (numbers(cpf) == false) {
            throw new Exception("O CPF NÃO DEVE conter letras, apenas NUMEROS");
        }        
    }
    //Trata os RGs↓------------------------------------------------------------------
    public static void rg(String rg) throws Exception{
         if (rg == null) {
             throw new Exception("O RG é um campo OBRIGATORIO");
        }
        if (rg.equals("") || rg.isEmpty()) {
             throw new Exception("Favor insira o RG corretamente");
        }
        if (rg.length() < 6 ) {
            throw new Exception("O RG deve conter no minimo 6 digitos");
        }
        if (rg.length() > 10) {
            throw new Exception("O RG deve conter no maximo 10 digitos");
        }
        if (numbers(rg) == false) {
            throw new Exception("O RG NÃO DEVE conter letras, apenas NUMEROS");
        }       
    }
    
     //Trata os NOMES↓------------------------------------------------------------------
    public static void nome(String nome) throws Exception{
         if (nome == null) {
             throw new Exception("O NOME é um campo OBRIGATORIO");
        }
        if (nome.equals("") || nome.isEmpty()) {
            throw new Exception("Favor insira o NOME corretamente");
        }
        if (nome.length() < 3) {
            throw new Exception("Quantidade de caracters minima é 3");
        }
        if (nome.length() > 100) {
           throw new Exception("Quantidades de caracters exedidos a 100");
        }   
        //TEST↓-------------------------------------------
        if (numbers(nome) == true) {
            throw new Exception("O NOME NÃO DEVE conter NUMEROS, apenas LETAS");
        }
    }
    //Trata os SALARIOS↓------------------------------------------------------------------
    public static void salario(float salario) throws Exception{
      
        if (salario == 0) {
            throw new Exception("Salário NÃO pode ser 0(ZERO)");
        }       
        if (salario < 1000) {
            throw new Exception("Salário minimo é de 1000 reais..");
        }
        if (salario > Float.MAX_VALUE) {
            throw new Exception("Salário passou dos limites, calma ae filhão!!");
        } 
    }
    //Trata as DESCRIÇÕES↓------------------------------------------------------------------
    public static void descrição(String descricao) throws Exception{
         if (descricao == null) {
             throw new Exception("A DESCRIÇÃO é um campo OBRIGATORIO");
        }
        if (descricao.equals("") || descricao.isEmpty()) {
            throw new Exception("Favor insira a DESCRIÇÃO corretamente");
        }
        if (descricao.length() < 10) {
            throw new Exception("A DESCRIÇÃO tem uma quantidade MINIMA de 10 caracters");
        }
        if (descricao.length() > 255) {
           throw new Exception("Quantidades de caracters exedidos a 255");
        }   
    }  
    public static void data(Date data) throws Exception{
        if (data == null) {
            throw new Exception("A DATA é um campo OBRIGATORIO");
        }
         if (data.equals("")) {
            throw new Exception("Favor insira a DATA corretamente");
        }
    }   
    //Trata os NUMEROS das ORDENS DE SERVIÇOS↓ (PREVENTIVO)------------------------------------------------------------------
    public static void numeroOs(int numero)throws Exception{
        if (numero == 0) {
            throw new Exception("O numero da OS nao pode ser 0");
        }
        if (numero < 0) {
            throw new Exception("O numero da OS nao pode ser menor que 0");
        }
        if (numero > Integer.MAX_VALUE) {
            throw new Exception("Numero da OS passou dos limites...");
        }
    }
    
    //Tratamento das MATRICULAS dos FUNCIONARIOS↓ (PREVENTIVO)↓------------------------------------------------------------------
    public static void matricula(int matricula) throws Exception{
        if (matricula == 0) {
             throw new Exception("O numero da Matricula nao pode ser 0");
        }
        if (matricula < 0) {
             throw new Exception("O numero da Matricula nao pode ser menor que 0");
        }
        if (matricula > Integer.MAX_VALUE) {
             throw new Exception("Numero da Matricula passou dos limites..., vamo demitir uma galera ae!");
        }
    }  
    
    //Tratamento dos CODIGO dos PROBLEMAS↓ (PREVENTIVO)↓---------------------------------------------------------------------------
    public static void codigoProb(int codigo)throws Exception{
        if (codigo == 0) {
            throw new Exception("O numero do Problema nao pode ser 0");
        }
        if (codigo < 0) {
            throw new Exception("O numero da Problema nao pode ser menor que 0");
        }
        if (codigo > Integer.MAX_VALUE) {
            throw new Exception("Numero dos Problemas passou dos limites..., vamo manerar nas broncas ae!");
        }
    }  
    
    //Tratando a SENHA do Login↓↓----------------------------------------------------------------------------------------------------------
    public static void senha(String senha)throws Exception {

        if (senha == null) {
             throw new Exception("A SENHA é um campo OBRIGATORIO");
        }
        if (senha.equals("") || senha.isEmpty()) {
            throw new Exception("Favor insira a SENHA corretamente");
        }
        if (senha.length() < 4) {
            throw new Exception("Quantidade de caracters minima é 4");
        }
        if (senha.length() > 100) {
           throw new Exception("Quantidades de caracters exedidos a 100");
        }   
        
    }
}
