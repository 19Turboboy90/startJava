CREATE table Jaeger (
  id serial PRIMARY KEY, 
  modelName text, 
  mark      char(6), 
  height    numeric , 
  weight    numeric, 
  status    text, 
  origin    text, 
  launch    date,
  kaijuKill integer
);