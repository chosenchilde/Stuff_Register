DROP DATABASE IF EXISTS things;
CREATE DATABASE things CHARACTER SET utf8 COLLATE utf8_general_ci;
USE things;

CREATE TABLE things(
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(63),
    description VARCHAR(127)
);

INSERT INTO things (name, description) VALUES
('Anel de Prata','Ornamento de prata pura.'),
('Colar de Pedra','Cordão de lã com pedras preciosas.'),
('Brincos de Ouro','Dourados como o sol.'),
('Cinto de Couro','Couro sintético.'),
('Chapéu de Palha','Caindo aos pedaços, mas ainda serve.');

