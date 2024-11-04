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