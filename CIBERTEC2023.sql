
-- Crear la base de datos si no existe
CREATE DATABASE IF NOT EXISTS hotel_bd;

-- Seleccionar la base de datos
USE hotel_bd;

-- Tabla de Clientes
CREATE TABLE IF NOT EXISTS clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL,
    telefono VARCHAR(20)
    -- Otros campos relevantes para la información del cliente
);

-- Tabla de Habitaciones
CREATE TABLE IF NOT EXISTS habitaciones (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero INT NOT NULL,
    tipo VARCHAR(50) NOT NULL,
    precio DOUBLE NOT NULL
    -- Otros campos relevantes para las habitaciones
);

-- Tabla de Reservas
CREATE TABLE IF NOT EXISTS reservas (
    id INT AUTO_INCREMENT PRIMARY KEY,
    habitacion_id INT NOT NULL,
    fecha_inicio DATE NOT NULL,
    fecha_fin DATE NOT NULL,
    total DOUBLE NOT NULL,
    estado VARCHAR(20) DEFAULT 'Pendiente' -- Puede ser 'Confirmada', 'Cancelada', etc.

);


INSERT INTO clientes (nombre, email, telefono) VALUES
('Juan Pérez', 'juan@example.com', '123-456-7890'),
('María García', 'maria@example.com', '987-654-3210'),
('Carlos López', 'carlos@example.com', '456-789-0123'),
('Ana Martínez', 'ana@example.com', '789-012-3456'),
('Pedro Ramírez', 'pedro@example.com', '321-654-0987');


INSERT INTO habitaciones (numero, tipo, precio) VALUES
(101, 'Individual', 80.00),
(102, 'Doble', 120.00),
(103, 'Suite', 200.00),
(104, 'Doble', 110.00),
(105, 'Individual', 85.00);


INSERT INTO reservas (habitacion_id, fecha_inicio, fecha_fin, total, estado) VALUES
( 2, '2023-12-01', '2023-12-05', 480.00, 'Confirmada'),
( 3, '2023-12-10', '2023-12-15', 1000.00, 'Pendiente'),
( 1, '2023-12-05', '2023-12-08', 240.00, 'Cancelada'),
( 4, '2023-12-20', '2023-12-25', 550.00, 'Pendiente'),
( 5, '2023-12-03', '2023-12-07', 340.00, 'Confirmada');

