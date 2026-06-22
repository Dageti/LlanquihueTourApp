<h1 align="center">Welcome to LlanquihueTourApp</h1>
<p>
</p>

> Aplicación para gestionar los paquetes turísticos y empleados de Llanquihue Tour leyendo un archivo externo(.txt) y
> almacenándolos
> en ArrayList.
>
>Incluye filtros de búsquedas e interfaz interactiva simple.

## Estructura

| Clase           | Descripción                                                                          |
|-----------------|--------------------------------------------------------------------------------------|
| `Persona`       | Clase base con atributos comunes: nombre, teléfono, dirección y RUT.                 |
| `Direccion`     | Representa la dirección de una persona (composición dentro de `Persona`).            |
| `Rut`           | Encapsula y valida el RUT de una persona (composición dentro de `Persona`).          |
| `Empleado`      | Hereda de `Persona` Agrega puesto y turno de trabajo.                                |
| `Guia`          | Hereda de `Empleado` Agrega el idioma que maneja el guía turístico.                  |
| `Chofer`        | Hereda de `Empleado` Agrega tipo de licencia y años de experiencia.                  |
| `Cocina`        | Hereda de `Empleado` Indica si la persona es chef o ayudante de cocina.              |
| `Recepcionista` | Hereda de `Empleado` Agrega idiomas y conocimientos en primeros auxilios.            |
| `Tour`          | Representa un paquete turístico: nombre, descripción, precio y cantidad de personas. |

## Instrucciones de ejecución

> - Clonar repositorio.
> - Abrir en un IDE compatible con JAVA
> - Ejecutar Main.java

## Author

👤 **Matías Rivas Gallardo**

* Github: [@dageti](https://github.com/dageti)

