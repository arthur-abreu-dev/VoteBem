create database SGSA;
use SGSA;
select * from Aluno;
select * from coordenador;
select * from professor;
SELECT id FROM usuario WHERE email = '' AND senha ='';
select * from tema where nome <> '';
insert into tema(nome,ponto) values('',0);
delete from Aluno;
delete from usuario;
SET SQL_SAFE_UPDATES = 0;
drop database SGSA;

create database VoteBemPU;
use VoteBemPU;
select * from VoteBemPU.usuario;
drop database VoteBemPU;

insert into Aluno(cpf,email,idade,nome,rg,senha,tipo)values(2,'arthur',19,'Arthur',2,'admin','A');

CREATE TRIGGER TRG_InsertUser
ON dbo.SGSA
AFTER INSERT AS
BEGIN
INSERT INTO Usuario
SELECT  FROM INSERTED
END
GO
        drop database SGSA;
        
        
select
        usuario0_.email as col_0_0_ 
    from
        Usuario usuario0_ 
    where
        usuario0_.id=1;
