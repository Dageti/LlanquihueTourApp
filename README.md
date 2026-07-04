<h1 align="center">Welcome to LlanquihueTourApp</h1>
<p>
</p>

> Aplicación para gestionar los paquetes turísticos y empleados de Llanquihue Tour leyendo un archivo externo(.txt) y
> almacenándolos
> en ArrayList.
>
>Incluye filtros de búsquedas e interfaz interactiva simple en consola.

## Estructura

```
src/
├── ui/
│   └── Main.java
├── data/
│   └── GestorDatos.java
│   ├── GestorServicios.java
├── model/
│   ├── Chofer.java
│   ├── Cocina.java
│   ├── Direccion.java
│   ├── Empleado.java
│   ├── ExcursionCultural.java
│   ├── Guia.java
│   ├── PaseoLacustre.java
│   ├── Persona.java
│   ├── Recepcionista.java
│   ├── Rut.java
│   ├── RutaGastronomica.java
│   ├── ServicioTuristico.java
│   └── Tour.java
├── resources/
│   ├── tours.txt
│   └── trabajadores.txt
└── util/
└── RutInvalidoException.java
```

## Modelos

| Clase               | Descripción                                                                          |
|---------------------|--------------------------------------------------------------------------------------|
| `Persona`           | Clase base con atributos comunes: nombre, teléfono, dirección y RUT.                 |
| `Direccion`         | Representa la dirección de una persona (composición dentro de `Persona`).            |
| `Rut`               | Encapsula y valida el RUT de una persona (composición dentro de `Persona`).          |
| `Empleado`          | Hereda de `Persona` Agrega puesto y turno de trabajo.                                |
| `Guia`              | Hereda de `Empleado` Agrega el idioma que maneja el guía turístico.                  |
| `Chofer`            | Hereda de `Empleado` Agrega tipo de licencia y años de experiencia.                  |
| `Cocina`            | Hereda de `Empleado` Indica si la persona es chef o ayudante de cocina.              |
| `Recepcionista`     | Hereda de `Empleado` Agrega idiomas y conocimientos en primeros auxilios.            |
| `Tour`              | Representa un paquete turístico: nombre, descripción, precio y cantidad de personas. |
| `ServicioTuristico` | Superclase de jerarquía de servicios. atributos comunes: nombre y duracionHoras.     |
| `RutaGastronomica`  | Hereda de `ServicioTuristico`. Agrega numeroDeParadas.                               |
| `PaseoLacustre`     | Hereda de `ServicioTuristico`. Agrega tipoEmbarcacion.                               |
| `ExcursionCultural` | Hereda de `ServicioTuristico`. Agrega lugarHistorico.                                |

## Jerarquía de Servicios Turisticos (semana 6)

Se incorporaron 3 subclases que heredan mediante super los atributos de la superclase `ServicioTuristico`. </br>
Además se incorporó una opción extra en el menu interactivo para mostrar el contenido de esta semana.

```
ServicioTuristico (superclase)
├── RutaGastronomica
├── PaseoLacustre
└── ExcursionCultural
```

## Semana 7

> Se agregaron los cambios solicitados para la semana 7 donde se aplica polimorfismo a las clases entre superclase y
> clases hijas.

## Instrucciones de ejecución

> - Clonar repositorio.
> - Abrir en un IDE compatible con JAVA
> - Ejecutar Main.java

## Author

👤 **Matías Rivas Gallardo**

* Github: [@dageti](https://github.com/dageti)

