## Pasos para la instalación de la aplicación

Primero debemos instalar docker y docker compose de acuerdo a nuestro sistema operativo.
[Docker Install](https://docs.docker.com/install/)

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

Recomendamos usar Visual Studio Code el cual nos permite trabajar mejor la aplicación mediante su consola.

Para ejecutar la aplicación debemos usar el comando:
```
Phthon manage.py runserver
```
Esperamos y luego abrimos la url
[http://localhost:8000](http://localhost:8000)

### Información adicional del sistema

Framework: Django
Usuario: test
Contraseña: Demo1234
Base de datos: Postgres
