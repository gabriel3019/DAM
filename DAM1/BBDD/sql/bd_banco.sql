create database bd_banco;
use bd_banco;




create table cuentas(
c_num_cta int auto_increment primary key,
c_nif varchar(9) not null,
c_titular varchar(50) not null,
c_fecha_creacion date not null,
c_saldo decimal(10,2)
);


create table movimientos(
	m_id int auto_increment primary key,
	m_c_num_cta int not null, 
	m_fecha datetime not null,
	m_importe decimal(10,2),
	m_concepto varchar(50),
foreign key (m_c_num_cta) references cuentas(c_num_cta)
);

