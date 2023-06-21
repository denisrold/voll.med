HTTP:

Registering a doctor
POST METHOD:  Path:"/medico"
{
"nombre":"Jorge Corazón",
"email":"jorgecorazon@voll.med",   // debe ser un formato de email Valido
"documento":"22223568",            // Deben ser numeros. 
"especialidad":"CARDIOLOGIA",      // Es un ENUM  ORTOPEDIA, CARDIOLOGIA, GINECOLOGIA, PEDIATRIA.
	
"direccion": {                     //No deben estar en blanco.
	"calle":"23",
	"distrito":"Sistole",
	"ciudad":"Cardilandia",
	"numero":"2323",
	"complemento": "a"
	}
}