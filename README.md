# Client Server Secure

Este laboratorio tiene como fin, comunicar dos servidores (un cliente y un servidor) de tal manera de que todas las conexiones que se realicen esten aseguradas, tanto con la base de datos como con el explorador

## Como empezar

### Prerequisites

Para poder correr los servidores localmente es necesario tener instalado los sigientes programas:

* maven
* git
* heroku
SI no se posee alguno de estos programas estos son manuales de instalacion de cada uno de ellos

**Maven**

`Windows`
https://docs.wso2.com/display/IS323/Installing+Apache+Maven+on+Windows

`Linux`
https://www.javahelps.com/2017/10/install-apache-maven-on-linux.html

`Mac Oxs`
https://www.mkyong.com/maven/install-maven-on-mac-osx/

**Git**

`All plataforms` https://git-scm.com/book/es/v1/Empezando-Instalando-Git


### Installing

Para instalar la aplicacion es necesario clonar el proyecto con el siguiente comando

````
git clone https://github.com/GrCross/ClientServerSecure
````

una vez descargado el proyecto se encontraran dos carpetas ``client`` y ``server`` en donde se encontraran los programas correspondientes, para poder compilar los dos programas se usa el comando:

````
mvn compile
````

Una vez compilado los proyectos es necesario correrlos de la siguiente manera:

````
mvn spring-boot:run
````
para poder abrir el cliente como el servidor, en la raiz se encuentran los certificados correspondientes a cada una de las aplicaciones, estos se tienen que cargar de acuerdo a el explorador que se este utilizando.

Una vez cargado los certificados de cada uno, se procede a correr los programas de la siguiente manera:

**servidor**
````
https://localhost:9002/server/data
````

**cliente**
````
https://localhost:9001
````
## Built With

* [Maven](https://maven.apache.org/)
* [Spring](https://docs.spring.io/spring-security/site/docs/current/reference/htmlsingle/) - 

## Authors

* **Daniel Rosales** - *Initial work* - [GrCross](https://github.com/GrCross)

## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details
