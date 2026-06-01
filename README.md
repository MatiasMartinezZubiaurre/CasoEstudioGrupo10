# Proyecto - Grupo – UTEC

## Descripción
Este proyecto consiste en la implementación de clases en Java para gestionar un sistema de **convocatorias y postulaciones a becas**. Incluye las entidades principales como Convocatoria, Postulación, Usuario (postulante), Tutor, Evaluador, Rúbrica, Criterios y Evaluaciones, permitiendo modelar el flujo completo desde la publicación de una convocatoria hasta la evaluación y asignación de puntajes a los postulantes.

---

## Estructura del proyecto
- Cada clase está implementada en su propio archivo `.java`.
- Se utilizan relaciones entre clases como **herencia** (Persona → Usuario, Tutor, Evaluador), **agregación** y **composición**.
- Todas las clases implementan el método `toString()` y cuentan con constructores adecuados.
- No se incluye el método `main()`, ya que no es necesario para esta entrega.

### Clases implementadas:
- `Persona.java`
- `Usuario.java`
- `Tutor.java`
- `Evaluador.java`
- `Convocatoria.java`
- `Postulacion.java`
- `Documento.java`
- `Evaluacion.java`
- `Criterio.java`
- `CriterioRubrica.java`
- `Rubrica.java`

---

## Supuestos de diseño
- Un tutor puede supervisar un máximo de 3 becarios.
- Cada postulación puede recibir hasta 2 evaluaciones.
- Los criterios de evaluación tienen puntajes mínimo y máximo, y ponderación.
- Una rúbrica calcula el puntaje total ponderado de sus criterios.
- Una convocatoria se considera abierta según las fechas de apertura y cierre.
- El puntaje final de una postulación es el promedio de las evaluaciones recibidas.

---

## Participantes

| Nombre completo     | Usuario GitLab          | Aporte principal                        |
|---------------------|-------------------------|-----------------------------------------|
| Matias Martinez     | @MatiasMartinezZubiaurre| Clases principales y coordinación       |
| Franco Moreno       | @franco.moreno          | Clases de Criterio y Rúbrica            |
| Diego Gomez         | @diego.gomez            | Clases de Tutor y Postulación           |
| Ivan Rodriguez      | @ivan.rodriguez         | Clases de Convocatoria y Documento      |
| Kevin Vidal         | @kevin.vidal            | Clases de Usuario y Evaluador           |

NOTA IMPORTANTE:

Debemos aclarar que no habíamos visto ni utilizado previamente el manejo mediante cuentas individuales de GitHub y commits por integrante. Nuestro equipo se organizó principalmente a través de Discord, donde cada integrante desarrollaba su parte en su propio proyecto de IntelliJ, compartiendo su pantalla y avances con el resto del equipo por ese medio.
Posteriormente, el coordinador del equipo, Matías Martínez, integraba todas las partes en un único proyecto "general" en IntelliJ.
Reconocemos que todavía no comprendemos completamente el funcionamiento de GitHub y recién el último día, al momento de realizar la entrega, leímos la importancia del historial individual de commits para verificar la participación de cada integrante.
Por este motivo, no es posible comprobar la participación individual mediante el historial de commits del repositorio. Aun así, completamos la sección de "Aporte principal" basándonos de forma aproximada en las tareas realizadas por cada integrante, aclarando que dicha información no puede ser verificada mediante GitHub en esta entrega.

Para las próximas entregas, este aspecto será gestionado correctamente.



---

## Requisitos técnicos
- Proyecto desarrollado en **Java (versión 17)**.
- Estructura clara y coherente del código.
- Uso correcto de colecciones (`ArrayList`), herencia y encapsulación.
- Comentarios explicativos incluidos donde se consideró necesario.
