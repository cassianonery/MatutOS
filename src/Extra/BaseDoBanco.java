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
}
