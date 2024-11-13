create database canciones_db;
use canciones_db;
INSERT INTO canciones (titulo, artista, album, genero, idioma, fecha_creacion, fecha_actualizacion)
VALUES ('Bohemian Rhapsody', 'Queen', 'A Night at the Opera', 'Rock', 'Inglés', NOW(), NOW()), 
('Imagine', 'John Lennon', 'Imagine', 'Rock', 'Inglés', NOW(), NOW());