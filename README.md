## Pasos para la instalación de la aplicación

Primero debemos instalar docker y docker compose. [Docker Install](https://docs.docker.com/install/)
Debemos registrarnos en la pagina principal y descargar el instalador, por lo general al descargar docker desde el instalador, ahi tambien viene incluido docker compose. 

Tambien debemos tener activada la virtualización en nuestro PC.

Si tenemos windows 10 podemos ver en el administrador de tareas - rendimiento - cpu y vemos que donde dice virutalización diga "Habilitado". 

Para verificar que ya tenemos Docker podemos poner docker --version
Y para verificar docker compose podemos poner docker-compose

Cuando ya tengamos instalado Docker y Docker compose, ahora debemos clonar el proyecto
de GitHub en el cmd ponemos:
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

### Para conectar la base de datos con postgresSQL

"SECRET_KEY": "ac46^mkhg3=jf!x4txu$^cg812w+z^ct7vcuso8btlc@fyal73"<br>
"DATABASES":<br>
"default": <br>
"ENGINE": "django.db.backends.postgresql_psycopg2"<br>
"NAME": "bmuortco"<br>
"USER": "bmuortco"<br>
"PASSWORD": "8roxusbFnVarGYswAZkE05rMVoF51rsz"<br>
"HOST": "raja.db.elephantsql.com"<br>
"PORT": 5432<br>

### Información adicional del sistema

Framework: Django<br>
Usuario: test<br>
Contraseña: Demo1234<br>
Base de datos: Postgres<br>
