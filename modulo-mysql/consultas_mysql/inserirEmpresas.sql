ALTER TABLE empresas MODIFY cnpj VARCHAR(14);
INSERT INTO empresas
        (nome, cnpj)
VALUES
        ('Bradesco', 33445566000121),
        ('Vale', 77889900000143),
        ('Cielo', 66554433000129);

-- Descrever a tabela
DESC empresas;
DESC prefeitos;

SELECT * FROM empresas;
SELECT * FROM cidades;

INSERT INTO empresas_unidades
            (empresa_id, cidade_id, sede)
    VALUES
            (1, 1, 1),
            (1, 2, 0),
            (2, 1, 0),
            (2, 2, 1);
