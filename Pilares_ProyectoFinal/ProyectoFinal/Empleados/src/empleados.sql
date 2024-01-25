DROP DATABASE IF EXISTS empleados;
CREATE DATABASE empleados;
USE empleados;

CREATE TABLE generos(
    idGenero INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(20)
);