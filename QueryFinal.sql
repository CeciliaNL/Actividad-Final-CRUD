CREATE database Institucion;
use Institucion;

CREATE TABLE estudiantes (
  nombreUsuario varchar(50) NOT NULL,
  contrasena varchar(10) NOT NULL,
  nombreEstudiante varchar(50) NOT NULL,
  apellidoEstudiante varchar(50) NOT NULL,
  dniEstudiante int NOT NULL,
  telefonoEstudiante varchar(20),
  emailEstudiante varchar(50) NOT NULL,
  cursoEstudiante int NOT NULL,
  nombreYApellidoTutor varchar(50) NOT NULL,
  PRIMARY KEY (nombreUsuario),
  UNIQUE KEY dni_email_telefono (dniEstudiante, emailEstudiante, telefonoEstudiante)
);

select * from estudiantes;


INSERT INTO estudiantes VALUES ('DaLedes123','DaLedesma1','Dalia','Ledesma',41304701,'2235917773','dalia01@gmail.com',4,'Emma Ledesma'),
("Joaco13","Sanchez603","Joaquin","Sanchez",42938131,"223541813","joaco13@gmail.com",4,"Sergio Sanchez"),
("Juanita03","JuaniP","Juana","Pérez",43124862,"2235931422","juanita03@gmail.com",4,"Silvina Pérez"),
("Luciano135","Lucho23","Luciano","Vera",42202317,"2235991223","luchovera@gmail.com",3,"Juan Vera"),
("Morita16","Panda75","Mora","Goméz",41131433,"2235848349","moragomez@gmail.com",5,"Berenice Nuñez"),
("RodrigoPonce86","RodriPo","Rodrigo","Ponce",41137414,"2235489221","rodriponce@gmail.com",5,"Julieta Ponce"),
("RosaRodrigurez","RosaRo123","Rosa","Rodriguez",42553973,"2235142016","rosarodrifuez73@gmail.com",3,"José Rodriguez"),
("SebasLarrea","Larrea743","Sebastian","Larrea",40589172,"2235414102","sebas_Larrea@gmail.com",3,"Francesca Ruiz"),
("Sofia14","Sonic13","Sofia","Nuñez",40287325,"223531315","sofianunez@gmail.com",5,"Franco Berguecio")
;


CREATE TABLE profesores (
  nombreUsuarioProfesor varchar(50) NOT NULL,
  contrasenaProfesor varchar(10) NOT NULL,
  nombreProfesor varchar(50) NOT NULL,
  apellidoProfesor varchar(50) NOT NULL,
  cuilProfesor bigint NOT NULL,
  telefonoProfesor varchar(20),
  emailProfesor varchar(50) NOT NULL,
  plantaOSuplente varchar(50) NOT NULL,
  materiasProfesor varchar(50) NOT NULL,
  cursoProfesor int NOT NULL,
  PRIMARY KEY (nombreUsuarioProfesor),
  UNIQUE KEY cuil_email_telefono_ (cuilProfesor, emailProfesor, telefonoProfesor)
);

select * from profesores;


INSERT INTO profesores VALUES ("EzeProfe1985","Loop24","Ezequiel","Coronel",31193194171,"115413190","ezequielcoronel@gmail.com","PLANTA","Matemáticas",5),
("GustavoCerati79","Bocanada","Gustavo","Cerati",20275432310,"1124097122","gustistereo@gmail.com","PLANTA","Música",4),
("JuliaSoria9","Soria77","Julia","Soria",10225938323,"2235512981","soriaprofe@outlook.com","SUPLENTE","Literatura",5),
("LorenzoBueno","Sami22","Lorenzo","Bueno",17203916705,"117885416","lorenzobuenoprofesor@hotmail.com","SUPLENTE","Educación Física",4),
("Natinati","Colombia4","Natalia","Bustamante",19380320018,"2612406357","natinati42@gmail.com","PLANTA","Quimica",3)
;


CREATE TABLE materias(
nombreMateria varchar(50) NOT NULL,
cursoMateria varchar(50) NOT NULL,
profesorMateria varchar(50) NOT NULL,
PRIMARY KEY (nombreMateria),
FOREIGN KEY (profesorMateria) REFERENCES profesores(nombreUsuarioProfesor)
);

select * from materias;


INSERT INTO materias VALUES ("Matemáticas", 5, "EzeProfe1985"),
("Música", 4, "GustavoCerati79"),
("Literatura", 5, "JuliaSoria9"),
("Eduación Fisica", 4, "LorenzoBueno"),
("Quimica", 3, "Natinati")
;
