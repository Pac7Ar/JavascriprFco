DROP DATABASE IF EXISTS crud;
CREATE DATABASE crud;
USE crud;

CREATE TABLE login(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100),
    email VARCHAR(100) not null unique,
    usuario VARCHAR(100) not null unique,
    contrasenia VARCHAR(100) not null
);

CREATE TABLE generos(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(20)
);

CREATE TABLE empleados(
	id INT PRIMARY KEY AUTO_INCREMENT,
    nombre VARCHAR(100) not null,
    domicilio VARCHAR(100) not null,
    telefono VARCHAR(12) NOT NULL,
    email VARCHAR(100) NOT NULL,
    fecha_nacimiento DATE NOT NULL,
    id_genero INT,
    CONSTRAINT empleados_id_genero_genero_id
    FOREIGN KEY empleados(id_genero)
    REFERENCES generos(id)
);

INSERT INTO generos VALUES (null,"FEMENINO"),(null,"MASCULINO");

INSERT INTO empleados VALUES (null, 'Alfonso González', 'Av Torres 204', '55-4859-4589', 'alfonso@test.com', '2000-05-12', 2);
INSERT INTO empleados VALUES (null, 'Elena Rodríguez', 'Calle 34 #56-78', '55-7890-1234', 'elena@test.com', '1995-08-21', 1);
INSERT INTO empleados VALUES (null, 'Carlos Pérez', 'Av. Principal 123', '55-2345-6789', 'carlos@test.com', '1988-12-07', 2);
INSERT INTO empleados VALUES (null, 'Laura Martínez', 'Calle del Sol 45', '55-1111-2222', 'laura@test.com', '1992-03-15', 1);
INSERT INTO empleados VALUES (null, 'Roberto Sánchez', 'Av. Central 789', '55-3333-4444', 'roberto@test.com', '1985-09-30', 2);
INSERT INTO empleados VALUES (null, 'Sofía López', 'Calle 12 #67-89', '55-7777-8888', 'sofia@test.com', '1997-06-25', 1);
INSERT INTO empleados VALUES (null, 'Javier Fernández', 'Av. Norte 567', '55-5555-6666', 'javier@test.com', '1982-11-18', 2);
INSERT INTO empleados VALUES (null, 'Marta Ramírez', 'Calle 90 #23-45', '55-9999-0000', 'marta@test.com', '1990-02-09', 1);
INSERT INTO empleados VALUES (null, 'David Torres', 'Av. Sur 321', '55-1212-3434', 'david@test.com', '1980-07-03', 2);
INSERT INTO empleados VALUES (null, 'Carmen García', 'Calle 56 #78-90', '55-6789-9876', 'carmen@test.com', '1987-04-17', 1);

SELECT * FROM empleados;