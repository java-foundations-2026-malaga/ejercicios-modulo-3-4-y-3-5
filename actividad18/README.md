# JFo 3.4 y 3.5 - Actividad 18

## Pide dos numeros y suma

Solicita dos enteros por consola, calcula la suma e imprime el resultado.

## Objetivo

- Leer el codigo base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorreccion.
- Hacer `git add`, `git commit` y `git push`.

## Datos de entrada

El test escribe estos datos por teclado, uno por linea:

```text
4
6
```

El test tambien prueba el programa con otros datos, asi que no escribas el resultado directamente.

## Salida esperada

```text
Suma: 10
```

## Instrucciones para Eclipse

1. Importa este proyecto en Eclipse como un proyecto Maven.
2. Abre `src/main/java/modulo3_4_3_5_actividad18/Actividad18.java`.
3. Corrige o completa el codigo.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta los tests desde `src/test/java/modulo3_4_3_5_actividad18/Actividad18Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
