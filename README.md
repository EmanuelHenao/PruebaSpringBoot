#Prueba Tecnica

Consiste en inplementar una Arquitectura de Microservicios utilizando SpringBoot.

Se crearon 3 microservicos los cuales tiene bases de datos separadas y interactúan entre ellos:
•	servicioTareas: Se encarga de gestionar todas las solicitudes respecto a tareas, tiene varios endpoints que hacen referencia a CRUD y algunos filtos de búsqueda.

•	servicioUsuarios: Se encarga de gestionar todas las solicitudes respecto a Usuarios, tiene varios endpoints que hacen referencia a CRUD y algunos filtos de búsqueda.

•	sevicioRelacionUsuarioTareas: Posee un único endpoint que se encarga de relacionar a cada uno de los usuarios con sus tareas, para esto les realiza solicitudes a los otros dos servicios anteriores.

•	ServidorEureka: Es un servidor de nombres, que permite relacionar la dirección con el nombre que le dimos a cada servicio, para esto cuando cada uno de los servicios se despliega se registran en este servidor de nombres. Como se muestra a continuación.


se genero la documentacion con SWAGGER

para mas info ver el PDF.
