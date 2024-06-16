USE wm;

select * from prefeitos;
select * from cidades;

UPDATE cidades
SET estado_id = 19
WHERE id = 3;

select * from cidades c inner join prefeitos p on c.id = p.cidade_id;

select * from cidades c left join prefeitos p on c.id = p.cidade_id;

select * from cidades c left outer join prefeitos p on c.id = p.cidade_id;
	
select * from cidades c right join prefeitos p on c.id = p.cidade_id;


select * from cidades c left outer join prefeitos p on c.id = p.cidade_id
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

-- unio.all -> vai trazer duplicações

select * from cidades c left outer join prefeitos p on c.id = p.cidade_id
union all
select * from cidades c right join prefeitos p on c.id = p.cidade_id;