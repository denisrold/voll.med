Readme en construccion.

HTTP CRUD:
Path:"/medico"
- Registrar un doctor
- 
POST METHOD:
- Respuesta al cliente: JSON-> Medico creado // Header -> get location: http://localhost:8080/medicos/10

- {"nombre":"Jorge Corazón",		     // No debe estar en blanco 
"email":"jorgecorazon@voll.med",    // debe ser un formato de email Valido
"telefono":"0303456",              // Deben ser un string.
"documento":"22223568",           // Deben ser numeros. 
"especialidad":"CARDIOLOGIA",    // Es un ENUM  ORTOPEDIA, CARDIOLOGIA, GINECOLOGIA, PEDIATRIA.
"direccion": {                  //No deben estar en blanco.
	"calle":"23",
	"distrito":"Sistole",
	"ciudad":"Cardilandia",
	"numero":"2323",
	"complemento": "a"
	}}


METODO GET: Obteniendo una lista de medicos.

"nombre"		
"email"
"documento"
"especialidad"

-Order nombre=asc
-Pagination 10 per page

METODO PUT:
Espera un "id" por body.
Retorna al cliente: JSON(id, nombre, email, documento, direccion)
Datos modificables:
"nombre"
"documento"

"direccion":{
"calle":"23",
"distrito":"Sistole",
"ciudad":"Cardilandia",
"numero":"2323",
"complemento": "a"
}

METODO DELETE LOGICO:
Path: "/medicos/id"
No borra el registro de la base de datos.


METODO DELETE (no-logico) DESACTIVADO.
Espera un id por Path Variable. 
Path: "/medicos/id"
Borra el registro de la base de datos. 


METODO GET DETAIL MEDICO:
Path: "/medicos/id"
RESPONSE CON LA INFO DEL MEDICO DE ESE ID. 


Tramiento de Errores:
Personalizados en archivo -> infra -> errores -> TratadorDeErrores


post "/login"
UserAuthentification:
Spring Security - ByScript 
Auth0 - JWT

Espera: usuario:""  y clave: ""
Responde con un JWT, en formato json.


Filtros, Seguridad, Authorizacion.

Tipos de cuenta: Admin, Usuario (en construcción.)
