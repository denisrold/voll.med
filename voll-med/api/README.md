HTTP:

Path:"/medico"
- Registering a doctor
POST METHOD:
- Respuesta al cliente: JSON-> Medico creado // Header -> get location: http://localhost:8080/medicos/10

- {
"nombre":"Jorge Corazón",		     // No debe estar en blanco 
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
	}
}

Obteniendo una lista de medicos. 
METODO GET:

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


 
