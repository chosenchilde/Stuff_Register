DROP TABLE IF EXISTS things;

CREATE TABLE things(
    id INT PRIMARY KEY,
    name VARCHAR(63),
    description VARCHAR(127)
);

INSERT INTO things (name, description) VALUES
('Anel de Prata','Ornamento de prata pura.'),
('Colar de Pedra','Cordão de lã com pedras preciosas.'),
('Brincos de Ouro','Dourados como o sol.'),
('Cinto de Couro','Couro sintético.'),
('Chapéu de Palha','Caindo aos pedaços, mas ainda serve.');

