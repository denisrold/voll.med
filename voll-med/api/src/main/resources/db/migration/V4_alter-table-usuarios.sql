ALTER TABLE usuarios
ADD COLUMN role_id INT DEFAULT 3,
ADD CONSTRAINT fk_role_id
  FOREIGN KEY (role_id)
  REFERENCES roles(id);

UPDATE usuarios
SET role_id = 4;