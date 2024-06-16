SELECT * FROM estados WHERE id = 25

-- add por id
INSERT INTO cidades (nome, area, estado_id)
VALUES ('Campinas', 795, 25)

INSERT INTO cidades (nome, area, estado_id)
VALUES ('Niterói', 133.9, 25)

-- add por sigla 
INSERT INTO cidades 
    (nome, area, estado_id)
VALUES (
    'Caruaru',
     920.6, 
     (SELECT id FROM estados where sigla = 'PE')
     )

     INSERT INTO cidades 
    (nome, area, estado_id)
VALUES (
    'Juazeiro do Norte',
     250.2, 
     (SELECT id FROM estados where sigla = 'CE')
     )