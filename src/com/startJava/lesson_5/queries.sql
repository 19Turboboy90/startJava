select * from Jaeger;

select * from Jaeger where status = 'activ';

select * from Jaeger where mark = 'mark-5' or mark = 'mark-3';

select * from Jaeger order by mark desc;

select * from Jaeger where launch = (select min(launch) from Jaeger);

select * from Jaeger where kaijukill = (select max(kaijukill) from Jaeger);

select * from Jaeger where kaijukill = (select min(kaijukill) from Jaeger);

select avg(weight) from Jaeger;

update Jaeger set kaijukill = kaijukill + 1 where status = 'activ';

delete from Jaeger where status = 'destroyed';
