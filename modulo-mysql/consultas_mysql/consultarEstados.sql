SELECT * FROM  estados

SELECT sigla, nome as 'Nome do estado' FROM estados 
WHERE regiao = 'Nordeste'

SELECT 
nome, 
regiao, 
populacao
from estados
WHERE populacao >= 10
order by populacao desc