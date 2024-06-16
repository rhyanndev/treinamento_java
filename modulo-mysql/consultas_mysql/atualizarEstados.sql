UPDATE estados
SET nome = "Maranhão"
WHERE sigla = 'MA'

SELECT nome FROM estados where sigla = 'MA'

-- Também possível utilizar:
SELECT estados.'nome' FROM estados where sigla = 'MA'
SELECT est.nome FROM estados est where sigla = 'MA'


UPDATE estados
SET nome = 'Paraná', 
    populacao = 11.32
WHERE sigla = 'PR'


SELECT 
    est.nome, 
    sigla, 
    populacao 
FROM estados est 
where sigla = 'PR'