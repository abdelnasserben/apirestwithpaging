CREATE TABLE IF NOT EXISTS employees (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  salary VARCHAR(50) NOT NULL
);

INSERT INTO employees (first_name, last_name, salary) VALUES
('Colleen ','Myers','$1000'),
('Monica ','Webb','$1100'),
('David ','Case','$1200'),
('Jonathan ','Powers','$1300'),
('Mark ','Ochoa','$1400'),
('Joel ','Madden','$1500'),
('Jose ','Alvarado','$1600'),
('Louis ','Keith','$1700'),
('Natalie ','Garcia','$1800'),
('John ','Hill','$1900'),
('Kathy ','Allen','$2000'),
('Deborah ','Hernandez','$2100'),
('John ','Robles','$2200'),
('Antonio ','Bishop','$2300'),
('Sarah ','Stewart','$2400'),
('Patrick ','Knight','$2500'),
('Tracey ','Stanley','$2600'),
('Wendy ','Anderson','$2700'),
('Gabriel ','Norris','$2800');