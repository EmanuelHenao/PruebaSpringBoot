# Solución Prueba técnica para desarrollador backend.

## 1. Estrategia de branching.

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.001.png)

Para el desarrollo se optó por una variante de la estrategia ***GitFlow,*** la cual consiste en tener varias ramas (master, develop, feature) las cuales tiene las siguientes características:

- En la rama *develop* se llevará todo el desarrollo del código.
- En la rama *feature* se **crea** cuando se necesite desarrollar una nueva característica/microservico/etc. Y cuando este ya esté terminado se unirá con la rama *develop* integrando la nueva funcionalidad y también se eliminará después de realizar este proceso. Esta rama se llamó según el modulo que se estuviera trabajando.
- La rama *master* se aloja todo el código de producción.
\***
` `Se eligió esta ya que permite llevar un orden según cada funcionalidad.

A continuación, se presenta el historial de la solución:

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.002.png)

Nota: cada uno de los mensajes de los commits tiene un formato de envió según que se esté modificando, por ejemplo, para la documentación se utilizó “Docs”.

Dirección Repositorio: <https://bitbucket.org/pruebastecnicasemanuel/springbootmicroservices/src/master/>

</br>
</br>

## 2. Arquitectura
---
</br>
Para la solución se planteó la siguiente arquitectura:

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.003.png)

Se crearon **3 micro-servicios** los cuales tiene bases de datos separadas y interactúan entre ellos:

- **servicioTareas:** Se encarga de gestionar todas las solicitudes respecto a *tareas*, tiene varios endpoints que hacen referencia a CRUD y algunos filtros de búsqueda.

- **servicioUsuarios:** Se encarga de gestionar todas las solicitudes respecto a *Usuarios*, tiene varios endpoints que hacen referencia a CRUD y algunos filtros de búsqueda.
- **sevicioRelacionUsuarioTareas:** Posee un único endpoint que se encarga de relacionar a cada uno de los usuarios con sus tareas, para esto les realiza solicitudes a los otros dos servicios anteriores.



- **ServidorEureka:** Es un servidor de nombres, que permite relacionar la dirección con el nombre que le dimos a cada servicio, para esto cuando cada uno de los servicios se despliega se registran en este servidor de nombres. Como se muestra a continuación.


![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.005.png)

Este servidor nos otorga facilidad al momento de:

- Levantar varias instancias de un mismo servicio en diferente puerto, ya que este nos agrupa según el servicio.
- consumir otros servicios, ya que no se debe cambiar de dirección de consumo cada vez que se levante unas nuevas instancias de un mismo servicio.
- Balancear la carga según la demanda del servicio.

</br>
</br>

## 3. Datos
***

A nivel de datos se utilizó JPA para persistir los datos, así como también JpaRepository para facilitar las consultas.

Es importante resaltar que cada uno de los servicios tiene su propio BD en memoria, para los cual se utilizó H2.

Las entidades creadas fueron:

- Para el ServiceTarea

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.006.png)

- Para el ServiceUsuario

` `![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.007.png)

Consola de H2

User: ema
contraseña:123

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.008.png)

Datos por Default

- Para el ServiceUsuario

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.009.png)

- Para el ServiceTarea

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.010.png)


</br>
</br>

## 4. Documentación
***

Para la documentación de cada Service se utilizó Swagger.

![](./img/Aspose.Words.febf8a81-1a0d-43c7-a1f0-87a6eb50b603.011.png)





