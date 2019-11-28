package Extra;

abstract class BaseDoBanco {

/*
    
CREATE TABLE cliente (
nome varchar(100) NOT NULL,
rg varchar(10) NOT NULL,
cpf varchar(11) PRIMARY KEY
);

CREATE TABLE funcionario (
matricula int AUTO_INCREMENT PRIMARY KEY ,
nome varchar(100)  NOT NULL,
rg varchar(10) NOT NULL,
cpf varchar(11) NOT NULL UNIQUE,
salario numeric(8,2)  NOT NULL
);

CREATE TABLE problema (
codigo int AUTO_INCREMENT PRIMARY KEY,
nome varchar(30) NOT NULL,
descricao varchar(255)
);


CREATE TABLE ordemservico (
numero int AUTO_INCREMENT PRIMARY KEY,
descricaoservico varchar(255),
codigo_problema int NOT NULL,
descricaoproblema varchar(255) NOT NULL,
datacadastro datetime NOT NULL,
matricula_funcionario int NOT NULL,
cpf_cliente varchar(11) NOT NULL,
datasolucao datetime,
datacancelamento datetime,
motivocancelamento varchar(255),
FOREIGN KEY(matricula_funcionario) REFERENCES funcionario (matricula),
FOREIGN KEY(cpf_cliente) REFERENCES cliente (cpf),
FOREIGN KEY(codigo_problema) REFERENCES problema (codigo)
);
    
*/
    
    
   /******************** INSETs ************/
    /*
    //Cliente↓
INSERT INTO cliente (nome, rg, cpf) 
VALUES 
('Lukas', '9311567', '110645045403'),
('Cassiano', '5445214', '11111111111'),
('Marco', '4577878', '22222222222'),
('Gustavo', '7885521', '33333333333'),
('Caio', '7879998', '44444444444'),
('Rya', '9999999', '5555555555');
    
    
    //Funcionario↓
INSERT INTO funcionario (`matricula`, `nome`, `rg`, `cpf`, `salario`) 
VALUES 
(NULL, 'Marco Lindo', '666666', '77777777777', '1500'),
(NULL, 'Cassiano Viado', '3325648', '66666666666', '1500'),
(NULL, 'GustOvão', '1211232', '88888888888', '1500'),
(NULL, 'Leon Tzum', '7878798', '99999999999', '1500'),
(NULL, 'Afonso Braguilha', '5547632', '00000000001', '1500');

    //Problema ↓
INSERT INTO problema (`codigo`, `nome`, `descricao`) 
VALUES 
(NULL, 'Placa Mãe', 'A placa mão simplesmente nao funciona mais!!'),
(NULL, 'Religião', 'Ela vem iludindo a sociedade por muito tempo!! CHEGA!!'),
(NULL, 'Passagem', 'falta passagem para vim para faculdade'),
(NULL, 'IA altamente desenvolvida', 'meu pc é uma IA altamente desenvolvida e tem suas proprias vontades');
    
    
    
//Ordem de Serviço↓

INSERT INTO `ordemservico` 
(`numero`,`descricaoproblema`,`datacadastro`,`datacancelamento`,`datasolucao`,`descricaoservico`,`motivocancelamento`,`matricula_funcionario`,`cpf_cliente`,`codigo_problema`,`status`)  
VALUES
(NULL, 'gzuz não voltou', '27/11/2019', NULL, NULL, NULL, NULL, '5', '11064504540', '4', 'Em Andamento'), 
(NULL, 'arrumar a casa', '30/11/2019', NULL, NULL, NULL, NULL, '4', '22222222222', '5', 'Em Andamento'),
(NULL, 'casa de macaco', '30/11/2019', NULL, NULL, NULL, NULL, '6', '44444444444', '5', 'Em Andamento'),
(NULL, 'problemaao chatao veii', '28/11/2019', NULL, NULL, NULL, NULL, '8', '11111111111', '6', 'Em Andamento');


    
    
    
    
    */
}
