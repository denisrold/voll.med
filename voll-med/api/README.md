<h1>HTTP CRUD</h1>
<h2>Registrar un doctor</h2>
<h3>Método POST:</h3>
Path: "/medico"
<p>Respuesta al cliente: JSON -> Medico creado</p>
<p>Header -> getLocation: /medicos/{id}</p>
<p>Ejemplo de cuerpo de solicitud:</p>
<pre>
{
  "nombre": "Jorge Corazón",
  "email": "jorgecorazon@voll.med",
  "telefono": "0303456",
  "documento": "22223568",
  "especialidad": "CARDIOLOGIA",
  "direccion": {
    "calle": "23",
    "distrito": "Sistole",
    "ciudad": "Cardilandia",
    "numero": "2323",
    "complemento": "a"
  }
}
</pre>
<h2>Obtener una lista de médicos</h2>
<h3>Método GET:</h3>
<p>Parámetros:</p>
<ul>
  <li>Ordenar por nombre en orden ascendente: "nombre=asc"</li>
  <li>Paginación, 10 por página</li>
</ul>
<h2>Actualizar información de un médico</h2>
<h3>Método PUT:</h3>
<p>Cuerpo de la solicitud: JSON con "id" y los datos modificables ("nombre" y "documento").</p>
<p>Retorna al cliente: JSON con los datos actualizados.</p>
<p>Ejemplo de cuerpo de solicitud:</p>
<pre>
{
  "id": "123",
  "nombre": "Nuevo Nombre",
  "documento": "98765432",
  "direccion": {
    "calle": "25",
    "distrito": "Diastole",
    "ciudad": "Cardilandia",
    "numero": "2323",
    "complemento": "b"
  }
}
</pre>
<h2>Eliminar un médico de forma lógica</h2>
<h3>Método DELETE:</h3>
<p>Ruta: "/medicos/id"</p>
<p>No se borra el registro de la base de datos.</p>
<h2>Eliminar un médico de forma física (desactivado)</h2>
<h3>Método DELETE:</h3>
<p>Ruta: "/medicos/id"</p>
<p>Borra el registro de la base de datos.</p>
<h2>Obtener detalles de un médico</h2>
<h3>Método GET:</h3>
<p>Ruta: "/medicos/id"</p>
<p>Retorna la información detallada del médico con ese ID.</p>

<h1>Autenticación de usuarios</h1>
<p>Ruta POST: "/login"</p>
<ul>
  <li>User Authentication: Spring Security - ByScript Auth0 - JWT</li>
  <li>Espera los parámetros "usuario" y "clave".</li>
  <li>Retorna un JWT en formato JSON.</li>
</ul>
<h2>Tipos de usuario</h2>
<p>Los tipos de usuario son: "ADMIN", "PACIENTE", "MEDICO".</p>
<h2>Crear un usuario</h2>
<p>Ruta POST: "/usuario"</p>
<p>JSON con los siguientes campos:</p>
<pre>
{
  "login": "String",
  "clave": "String",
  "rol": "PACIENTE", "MEDICO", "USUARIO"
}
</pre>
<h1>Autorizaciones</h1>
<p>Usuarios STANDAR:</p>
<ul>
  <li>PUT "/usuario": Espera JSON {"id": "6"} y permite actualizar el login y la clave.</li>
</ul>
<p>Usuarios ADMIN:</p>
<ul>
  <li>DELETE LOGICO "/usuario/id"</li>
  <li>Obtener lista de usuarios paginada: GET "/usuario"</li>
  <li>Obtener usuario por ID: GET "/usuario/id"</li>
  <li>Actualizar el rol de un usuario: PUT "/usuario/". Espera JSON {"id": "6", "role_id"} y permite actualizar el tipo de usuario.</li>
</ul>

<h1>Tratamiento de errores</h1>
<p>Se manejan errores personalizados en el archivo <a href="https://github.com/denisrold/voll.med/blob/master/voll-med/api/src/main/java/voll/med/api/infra/errores/TratadorDeErrores.java"><b>TratadorDeErrores</b></a></p>
