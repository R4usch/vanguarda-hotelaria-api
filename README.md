# Vanguarda Hotelaria API

## Requisitos
  - Spring Boot v4.26.0 RELEASE
  - JavaSE 17
  - Eclipse 4.31.0v20240229-1022

## 1. Instalação Spring Boot
  - Com o Eclipse IDE aberto, procure na barra da parte superior da tela a partição "help". Ao clicar na mesma, uma lista de opções será aberta, clique em "Eclipse Marketplace".
  - Com o Marketplace aberto procure na barra de pesquisa por "Spring Tool Suite" (última versão disponível). 
  - Clique em "Install Now", "Next", aceite os Termos da Licença e "Finish".
  - Clique em instalar.
  - Quando necessário marque a checkbox, e clique em "Trust Selected".
  - Espere a instalação ser concluída.
  - Reinicie o Eclipse IDE.

  OBSERVAÇÂO: O projeto deve ser executado a partir da classe principal "HotelariaApplication", clicando na seta para baixo ao lado do ícone do botão "Run", "Run as..." e selecionando a opção "Spring Boot App". Vale a pena ressaltar que o código atual do Spring Boot não irá funcionar sem a implementação das Classes requisitadas, isto porque as rotas "PUT" e "POST" recebem dados, atrevés do ".json", e convertem seus atributos em uma variável do tipo da classe mencionada.

## 2. Importar no Eclipse IDE
  - Clone este repositório
  - Abra o Eclipse IDE
  - Entre em File > Import
  - Selecione Maven > Existing Maven Projects
  - Clique em Browser e selecione a pasta hotelaria, onde foi clonado o repositorio. Exemplo C:\Users\seu-nome\Documents\Github\vanguarda-hotelaria-api\hotelaria
  - Clique em Finish

## Passo a Passo para conectar o Azure com o Mysql Workbench:

- Dentro do Mysql Workbench clice no símbolo "+" na guia de Conexões para adicionar uma nova conexão
- Insira um nome para a conexão no campo Nome da Conexão.
- Selecione Standard (TCP/IP) como Tipo de Conexão.
- Insira bd-hotel.mysql.database.azure.com no campo hostname.
- Insira Adm_BDjv como nome de usuário e insira a senha "Host123@c".
- Vá para o Guia SSL e atualize o campo "Use SSL" para Require.
- No campo "SSL CA file", insira o local do arquivo DigiCertGlobalRootCA.crt.pem
- CLique em Testar Conexão para testar.
- Se a conexão for bem-sucedida, clique em OK para salvar a conexão.


## Passo a Passo para conexão do Banco de dads local:

- Faça o download do xampp no link "https://sourceforge.net/projects/xampp/files/XAMPP%20Windows/8.2.12/xampp-windows-x64-8.2.12-0-VS16-installer.exe/download"
- Aperta em ok caso apareca um alerta
- Clica em next até que começe a instalação do XAMPP
- Após a instalação inicie-o
- Aperte no botão start nos módulos "Apache" e "MySQL".
- Clique em Admin para acessar o banco de dados no navegador.
- Após acessar o banco, clique em novo, coloque o nome da tabela que deseja e aperte no botão criar.
- Após criar o banco de dados, acesse a aba "SQL" e digite os comandos abaixo para a criação das tabelas:
CREATE TABLE Cliente (
    ID_cliente VARCHAR(15) PRIMARY KEY,
    Senha VARCHAR(10) NOT NULL
);

CREATE TABLE Hotel (
    idHotel INT PRIMARY KEY,
    Nome VARCHAR(50) NOT NULL,
    Rua VARCHAR(30),
    Bairro VARCHAR(30),
    Cidade VARCHAR(30),
    Estado VARCHAR(30),
    CEP VARCHAR(15)
);

CREATE TABLE Quarto (
    Id_Quarto VARCHAR(45) PRIMARY KEY,
    Hotel_idHotel INT,
    Tipo_quarto VARCHAR(45),
    Reservado TINYINT,
    FOREIGN KEY (Hotel_idHotel) REFERENCES Hotel(idHotel)
);

CREATE TABLE Formulario (
    Nome VARCHAR(50),
    Sobrenome VARCHAR(30),
    Endereco_email VARCHAR(45),
    Telefone VARCHAR(15),
    CPF VARCHAR(45) PRIMARY KEY,
    Data_entrada DATE,
    Data_saida DATE,
    Cliente_ID_cliente VARCHAR(15),
    Hotel_idHotel INT,
    Quarto_Id_Quarto VARCHAR(45),
    FOREIGN KEY (Cliente_ID_cliente) REFERENCES Cliente(ID_cliente),
    FOREIGN KEY (Hotel_idHotel) REFERENCES Hotel(idHotel),
    FOREIGN KEY (Quarto_Id_Quarto) REFERENCES Quarto(Id_Quarto)
);

CREATE TABLE Reserva (
    idReserva INT PRIMARY KEY,
    Cliente_ID_cliente VARCHAR(15),
    Hotel_idHotel INT,
    Quarto_Id_Quarto VARCHAR(45),
    FOREIGN KEY (Cliente_ID_cliente) REFERENCES Cliente(ID_cliente),
    FOREIGN KEY (Hotel_idHotel) REFERENCES Hotel(idHotel),
    FOREIGN KEY (Quarto_Id_Quarto) REFERENCES Quarto(Id_Quarto)
);

-Dentro da aplicação Spring Boot, acesse src, main, resources e entre no arquivo application.propiets.
- Adicione o código abaixo:

spring.datasourcer.url =
jdbc:musql://localrost:3306/nome_escolhido_BancodeDados
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name = com.musql.cj.jdbc.Driver
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

# Participantes
  - Rafael Rausch Dias
  - Luiz Felipe
  - Lucas Gaiga
  - Brenda Taiane
  - Leonardo Nasser
  - Pedro Gabriel
