# SISTEMA DE CONTROL ESCOLAR

## EJERCICIO NIVEL: INTERMEDIO

### EJERCICIO 1  
### Sistema Escolar con Clases y Menú Interactivo

Se desarrolló un programa en Java que simula un sistema de control escolar.  
El sistema permite administrar:

- Materias  
- Cursos  
- Profesores  
- Alumnos  
- Menú interactivo en consola  

---

## Descripción General del Programa

El programa modela las siguientes relaciones:

- Un **curso** está compuesto por **tres materias**.
- Un **profesor** imparte una materia.
- Un **alumno** pertenece a un curso.
- El sistema cuenta con un **menú interactivo** para visualizar información.

---

## Estructura de Clases

### 1️ Clase `Materia`

Representa una materia dentro del curso.

#### Atributos:

| Parámetro | Tipo | Descripción |
|------------|--------|-------------|
| `name` | String | Nombre de la materia |
| `key` | String | Clave de la materia |
| `credits` | int | Número de créditos |
| `weeklyhours` | int | Horas semanales |

Incluye:
- Constructor por defecto
- Constructor con parámetros
- Constructor copia
- Métodos getters

---

### 2️ Clase `curso`

Representa un curso formado por tres materias.

#### Atributos:

| Parámetro | Tipo | Descripción |
|------------|--------|-------------|
| `name` | String | Nombre del curso |
| `materia1` | Materia | Primera materia |
| `materia2` | Materia | Segunda materia |
| `materia3` | Materia | Tercera materia |

Incluye:
- Constructor por defecto
- Constructor con parámetros
- Constructor copia
- Métodos getters

Relación: **Composición** (el curso está formado obligatoriamente por 3 materias).

---

### 3️ Clase `professor`

Representa un profesor que imparte una materia.

#### Atributos:

| Parámetro | Tipo | Descripción |
|------------|--------|-------------|
| `name` | String | Nombre del profesor |
| `nominatednumber` | String | Número de nómina |
| `hourlywage` | double | Sueldo por hora |
| `materia` | Materia | Materia que imparte |

Incluye:
- Constructor por defecto
- Constructor con parámetros
- Método `asignarmateria()`
- Métodos getters

Relación: **Agregación** (el profesor puede existir sin materia asignada).

---

### 4️ Clase `student`

Representa a un alumno inscrito en un curso.

#### Atributos:

| Parámetro | Tipo | Descripción |
|------------|--------|-------------|
| `ID` | String | Matrícula del alumno |
| `name` | String | Nombre del alumno |
| `age` | int | Edad del alumno |
| `curso` | curso | Curso al que pertenece |

Incluye:
- Constructor por defecto
- Constructor con parámetros
- Constructor copia
- Métodos getters

Relación: **Agregación** (el alumno pertenece a un curso).

---

## Funcionamiento del Menú

El sistema cuenta con el siguiente menú principal:

```
----- ESCUELA -----
1) Ver Materias
2) Ver Alumnos
3) Ver Profesores
4) Salir
```

---

###  Opción 1 – Ver Materias

Muestra un submenú:

```
--- MATERIAS ---
1) Matematicas
2) Programacion
3) Fisica
4) Regresar
```

Al seleccionar una materia se muestra:

- Nombre de la materia
- Clave
- Curso al que pertenece
- Profesor asignado
- Lista de alumnos inscritos

También incluye opción para regresar al menú principal.

---

###  Opción 2 – Ver Alumnos

Muestra la información de los tres alumnos:

- Nombre
- Matrícula
- Edad

---

###  Opción 3 – Ver Profesores

Muestra la información de los tres profesores:

- Nombre
- Número de nómina
- Materia que imparten

---

###  Opción 4 – Salir

Muestra un mensaje de despedida y finaliza el programa:

```
Gracias por usar el sistema escolar. Hasta luego 👋
```

---

##  Conceptos Aplicados

- Programación Orientada a Objetos (POO)
- Encapsulamiento
- Constructores (por defecto, parámetros y copia)
- Relaciones entre clases:
  - Composición
  - Agregación
- Uso de `Scanner`
- Uso de estructuras `switch`
- Uso de ciclo `do-while`
- Métodos auxiliares para mostrar información

---

##  Conclusión

Este sistema cumple con:

✔ Modelado de abstracciones  
✔ Implementación de relaciones entre clases  
✔ Menú interactivo funcional  
✔ Uso correcto de objetos  
✔ Organización clara del código  

El programa simula correctamente un sistema básico de control escolar utilizando los principios fundamentales de la Programación Orientada a Objetos en Java.





Hola profe, la documentacion lo hice con chat, disculpe, que tenga lindo fin de semana.
![alt text](image.png)
