HTTP:

Path:"/medico"
- Registering a doctor
POST METHOD:  
{
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
METODO GET :
"nombre":"Jorge Corazón",		
"email":"jorgecorazon@voll.med",
"documento":"22223568",  
"especialidad":"CARDIOLOGIA"

-Order Asc
-Pagination

