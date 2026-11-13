# JFo 3.4 y 3.5 - Conversion entre tipos de datos y Entrada del teclado

Esta carpeta contiene 20 actividades autocorregibles: las 01-10 corresponden a la lección 3.4 y las 11-20 a la lección 3.5.

## Actividades

01. Corrige una conversion de double a int
02. Corrige una promocion mal entendida
03. Corrige un parseInt incorrecto
04. Corrige suma de cadenas numericas
05. Corrige perdida de precision no deseada
06. Convierte texto a entero
07. Convierte texto a decimal
08. Convierte int a double automaticamente
09. Aplica casting a una nota decimal
10. Calcula una division decimal correcta
11. Corrige un programa sin import de Scanner
12. Corrige un Scanner mal creado
13. Corrige entrada numerica leida como texto
14. Corrige mezcla de nextInt y nextLine
15. Corrige entrada con JOptionPane
16. Pide y saluda por consola
17. Pide edad y calcula proximo anio
18. Pide dos numeros y suma
19. Pide datos con JOptionPane
20. Lee varios tokens de una cadena

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
