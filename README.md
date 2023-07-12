
# dockerized.postgresql
## Tecnologías
- Java
- Spring Boot
- PostgreSQL
- Docker

## Funcionalidad de la aplicación
Esta app está creada a través de java con el framework de spring boot, la cual crea 2 api rest para la obteción de la lista de usuarios (GET) 
y la creación de los mismos(POST) y los guarda en una base de datos postgreSQL.

Una vez que hayamos hecho toda la lógica, pasamos a la doquerización de nuestra app. Lo primero que tenemos que crear son los archivos
que nos ayudará a la hora de crear nuestros contenedores de docker, como pueden ser:

- docker-compose.yml (será el encargado de tener toda la configuración de nuestro contenedor)
- dockerfile (el cual será el encargado de crear la imagen de nuestro microservicio)

Antes de crear el archivo dockerfile, tendremos que crear un .jar de nuestra aplicación y lo podremos hacer desde la misma terminal de nuestro IDE, que 
en mi caso es Intellij con el siguiente comando:

```
./mvnw clean package -DskipTests

```

Evitamos también agregar los test para evitar problemas a la hora de compilar el proyecto. 
Como es bien sabido, el archivo .jar de nuestra aplicación se encuentra en la carpeta target de de nuestro proyecto.
Una vez hecho todo esto procederemos a levantar docker con el siguiente comanndo:

```
docker-compose up

```

Y con todo esto, ya tendríamso corriendo nuestro primero API rest en docker con una base de datos en postgreSQL

PD: Importante verificar POSTMAN que las APIs funciones correctamente.
