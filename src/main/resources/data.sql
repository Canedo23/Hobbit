INSERT INTO Personajes (nombre, raza, alianza)
VALUES  ("Aragorn", "Humano", "LA_COMUNIDAD"),
        ("Gandal", "Maia", "LA_COMUNIDAD"),
        ("Frodo", "Hobbit", "LA_COMUNIDAD"),
        ("Sauron", "Maia", "Mordor"),
        ("Legolas", "Elfo", "LA_COMUNIDAD"),
        ("Bilbo", "Hobbit", "Aventurero");

INSERT INTO artefactos (nombre, tipo) VALUES 
('Anillo Unico', 'Anillo'),
('Espada Anduril', 'Espada'),
('Baculo de Gandalf', 'Baculo'),
('Dardo', 'Espada'),
('Manto Elfico', 'Armadura');

INSERT INTO posesiones (id_posesion, id_personaje, id_artefacto, fecha_inicio, fecha_fin) VALUES 
(1, 3, 1, '3018-09-23', '3021-09-29'),  
(2, 6, 1, '2941-01-01', '3001-09-22'),  
(3, 1, 2, '3019-03-15', NULL),         
(4, 2, 3, '3018-12-25', NULL),         
(5, 6, 4, '2941-01-01', '3001-09-22'),  
(6, 3, 4, '3001-09-22', '3021-09-29'), 
(7, 5, 5, '3018-10-25', NULL);