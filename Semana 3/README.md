# 🚚 Semana 3 — Aplicación de Cálculo de Despacho

Este proyecto corresponde a la actividad formativa de la semana 3 del Taller de Aplicaciones Móviles en AIEP. Se desarrolla una aplicación en Java que calcula el costo de despacho según reglas de negocio específicas, sin utilizar herramientas IDE, y ejecutada mediante la JVM.

---

## 🧠 Objetivo de la Actividad

- Comprender el proceso de compilación y ejecución en Java sin IDE.
- Utilizar entrada/salida estándar (`Scanner` y `System.out`) para simular una aplicación móvil.
- Aplicar lógica condicional para resolver un caso de estudio real.
- Documentar el proceso completo en GitHub, incluyendo código, requerimientos y cronograma.

---

## 📦 Requerimientos del Caso de Estudio

### Funcionales

- Solicitar al usuario los siguientes datos:
  - Marca
  - Modelo
  - Cilindrada
  - Tipo de combustible
  - Capacidad en pasajeros
  - Total de la compra
  - Distancia de despacho

- Calcular el costo de despacho según:
  - Compra ≥ $50.000 y distancia ≤ 20 km → despacho gratuito.
  - Compra entre $25.000 y $49.999 → $150 por km.
  - Compra < $25.000 → $300 por km.

- Mostrar todos los datos ingresados y el costo calculado.


### No funcionales

- Validación de entradas numéricas.
- Comentarios explicativos en cada línea de código.
- Ejecución por línea de comandos (`javac` y `java`).
- Documentación clara y trazable.


---


## 👤 Historias de Usuario

- Como comprador, quiero ingresar los datos de mi vehículo y compra para saber si tengo despacho gratuito o cuánto debo pagar.

- Como operador logístico, necesito validar los datos ingresados y calcular el costo de despacho de forma rápida y confiable.

- Como desarrollador, quiero que el programa sea modular, claro y ejecutable desde la terminal, para facilitar pruebas y mantenimiento.




## 🧠 Documentación del Proceso

El desarrollo se realizó siguiendo buenas prácticas de trazabilidad y hospitalidad digital:

- Se utilizó Scanner para capturar entradas desde consola, validando que los valores numéricos fueran correctos.

- Se aplicó lógica condicional para determinar el costo de despacho según el monto de compra y la distancia.

- Cada línea del código incluye comentarios explicativos que facilitan la comprensión del flujo.

- El programa se compiló y ejecutó desde la terminal utilizando javac y java, sin uso de IDE.

- Se documentó el proyecto en GitHub, incluyendo este README, el código fuente y los pasos de ejecución.



---

## 🧪 Ejecución del Programa

### Compilación

```bash
javac DespachoApp.java
```

## 🚀 Ejecución


```bash
java DespachoApp
```

