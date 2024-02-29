USE mysql;
DROP USER IF EXISTS 'usuario_root'@'%';
CREATE USER 'usuario_root'@'%' IDENTIFIED BY 'usuario_root';
GRANT ALL PRIVILEGES ON libreria.* TO 'usuario_root'@'%';

FLUSH PRIVILEGES;
CREATE SCHEMA IF NOT EXISTS libreria_db;
USE libreria_db; 

-- Crear la base de datos para la librer\'eda
CREATE DATABASE IF NOT EXISTS libreria_db;
USE libreria_db;

-- Tabla para almacenar la informaci\'f3n de los libros
CREATE TABLE IF NOT EXISTS libros (
    id INT AUTO_INCREMENT PRIMARY KEY,
    titulo VARCHAR(100) NOT NULL,
    autor VARCHAR(100) NOT NULL,
    precio DECIMAL(10, 2) NOT NULL,
    categoria VARCHAR(50) NOT NULL
);

-- Tabla para almacenar la informaci\'f3n de los clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    mensaje TEXT
);

-- Insertar datos de ejemplo en la tabla de libros (opcional)
INSERT INTO libros (titulo, autor, precio, categoria) VALUES
    ('El nombre del viento', 'Patrick Rothfuss', 25.99, 'Fantas\'eda'),
    ('Cien a\'f1os de soledad', 'Gabriel Garc\'eda M\'e1rquez', 19.99, 'Realismo m\'e1gico'),
    ('1984', 'George Orwell', 15.50, 'Ciencia ficci\'f3n');

-- Verificar la creaci\'f3n de las tablas
SHOW TABLES;
