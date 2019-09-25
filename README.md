## Pasos para la instalación de la aplicación

Primero debemos instalar docker [Docker Install](https://docs.docker.com/install/)
y docker compose de acuerdo a nuestro sistema operativo [Docker compose Install]
(https://www.digitalocean.com/community/tutorials/how-to-install-docker-compose-on-ubuntu-16-04)

Cuando ya hayamos descargado Docker ahora debemos clonar el proyecto
de GitHub recomendamos usar la consola que nos brinda Git(se debe descargar)
debemos poner en la consola el comando:
```
git clone https://github.com/Casvill/Invention.git
```
Ahora debemos cambiar de rama usando los siguientes comandos:
```
cd Invention
git checkout version_django
```
Ahora ejecutamos el contenedor.
La primera vez se demora más de lo usual

```docker-compose up -d```

Esperamos y luego abrimos la url
[http://localhost:8000](http://localhost:8000)


### Información adicional del sistema

Framework: Django
Usuario: test
Contraseña: Demo1234
Base de datos: Postgres
