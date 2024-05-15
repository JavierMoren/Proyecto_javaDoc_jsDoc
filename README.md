# Proyecto_javaDoc_jsDoc

## Descripción del Proyecto

Este proyecto es una aplicación de gestión de una biblioteca virtual que permite llevar un registro de libros y reservas. La aplicación incluye clases Java y JavaScript para representar libros y reservas, así como una interfaz de usuario que permite a los usuarios realizar diversas operaciones.

## Instrucciones de Clonación y Configuración

Para clonar este repositorio y configurarlo en tu entorno de desarrollo, sigue estos pasos:

1. Abre tu terminal.

2. Ejecuta el siguiente comando para clonar el repositorio: git clone https://github.com/JavierMoren/Proyecto_javaDoc_jsDoc.git

3. Accede al directorio del proyecto


4. Configura tu entorno de desarrollo y dependencias según corresponda 

## Ejecución en Local

A continuación, se describen los pasos para ejecutar la aplicación en tu entorno local:

1. Abre tu IDE preferido.

2. Abre el proyecto clonado en el IDE.

3. Ejecuta el archivo `Main.java` para iniciar la aplicación.

## Documentación Generada

Puedes encontrar la documentación generada en los siguientes enlaces:

- Documentación Java (Javadoc): [Enlace a Javadoc](docs/javadoc/)
- Documentación JavaScript (JSDoc): [Enlace a JSDoc](docs/jsdoc/)

## Comandos Utilizados para Generar Documentación

Los siguientes comandos se utilizaron para generar la documentación:

Para Java (Javadoc): javadoc -d [path to javadoc destination directory] -sourcepath [path to package directory] [package name]

Para JavaScript (JSDoc): jsdoc [path to package directory] -r -d [path to javadoc destination directory]


## Estructura de Directorios

La estructura de directorios del proyecto es la siguiente:

- /Proyecto_javaDoc_jsDoc
    - /src
        - /java
            - Main.java
            - Libro.java
            - Reserva.java
        - /js
            - main.js
            - Libro.js
            - Reserva.js
        - /css
            - styles.css
    - /docs
        - /javadoc
        - /jsdoc
    - README.md
    - CHANGELOG.md


## Descripción de Archivos y Clases

- `Main.java`: Clase principal en Java para ejecutar la aplicación.
- `Libro.java`: Clase de entidad 'Libro' en Java con atributos: título, autor, ISBN y estado (enum: disponible o reservado).
- `Reserva.java`: Clase de entidad 'Reserva' en Java con atributos: usuario, libro, fechaReserva y fechaDevolución.
- `main.js`: Contiene la lógica relacionada con la interfaz de usuario en JavaScript, incluyendo funciones para mostrar u ocultar un formulario y mostrar la lista de libros y reservas.
- `Libro.js`: Clase de entidad 'Libro' en JavaScript con los mismos atributos que `Libro.java`.
- `Reserva.js`: Clase de entidad 'Reserva' en JavaScript con los mismos atributos que `Reserva.java`.
- `styles.css`: Archivo de estilos de la aplicación que define colores, tipografías, encabezados, párrafos, etc.
- `javadoc/`: Directorio que contendrá la documentación generada para el código Java.
- `jsdoc/`: Directorio que contendrá la documentación generada para el código JavaScript.







