# 🏠 SmartHomeController

**SmartHomeController** es una aplicación desarrollada en Java que simula el control centralizado de dispositivos inteligentes del hogar, como luces y termostatos. Utiliza múltiples patrones de diseño para asegurar una arquitectura flexible, escalable y mantenible.

---

## 📌 Descripción

Este sistema permite:

- Encender y apagar dispositivos inteligentes.
- Monitorear su estado en tiempo real.
- Notificar automáticamente los cambios a un panel central.
- Recorrer todos los dispositivos registrados dinámicamente.

---

## 🎯 Problema que Resuelve

En hogares modernos existen múltiples dispositivos inteligentes que requieren ser gestionados desde una única plataforma. Este sistema simula una solución que:

- Crea e instancia distintos tipos de dispositivos.
- Los controla de forma unificada.
- Notifica sus estados al panel central.
- Permite recorrer los dispositivos fácilmente.

---

## 🧠 Patrones de Diseño Aplicados

### 1. 🧱 Singleton *(Creacional)*
- **Dónde**: `SmartHomeController.java`  
- **Por qué**: Asegura que exista solo una instancia del controlador central.  
- **Cómo**: Implementando una instancia estática única accesible con `getInstance()`.

### 2. 🏭 Factory *(Creacional)*
- **Dónde**: `DeviceFactory.java`  
- **Por qué**: Permite crear dispositivos sin acoplarse a clases concretas.  
- **Cómo**: Método `createDevice(String tipo, String nombre)` retorna la instancia correspondiente.

### 3. 🌉 Bridge *(Estructural)*
- **Dónde**: `Device.java`, `DeviceImpl.java`, `BasicDeviceImpl.java`  
- **Por qué**: Separa la abstracción del dispositivo de su implementación real.  
- **Cómo**: Las clases concretas heredan de `Device` y delegan en `DeviceImpl`.

### 4. 👀 Observer *(Comportamiento)*
- **Dónde**: `DeviceSubject.java`, `CentralPanel.java`  
- **Por qué**: Los dispositivos notifican al panel de control cuando cambia su estado.  
- **Cómo**: Se implementa el patrón `Subject/Observer` para suscripción y notificación.

### 5. 🔁 Iterator *(Libre elección)*
- **Dónde**: `DeviceCollection.java`  
- **Por qué**: Permite recorrer dispositivos sin exponer la estructura interna.  
- **Cómo**: Se implementa `Iterable<Device>` y se usa `for-each`.

---

## 🚀 Cómo Ejecutar el Proyecto

1. Asegúrate de tener **Java 11** o superior instalado.
2. Compila el proyecto:

```bash
javac -d bin src/**/*.java
```

3. Ejecuta el programa:

```bash
java -cp bin Main
```

---

## 📁 Estructura del Proyecto

```
SmartHomeController/
├── img/               # Imágenes, diagramas, etc.
├── src/               # Código fuente Java
│   ├── controller/    # Controlador principal
│   ├── devices/       # Dispositivos inteligentes
│   ├── factory/       # Patrón Factory
│   ├── observer/      # Patrón Observer
│   ├── iterator/      # Patrón Iterator
│   └── Main.java      # Clase principal
├── README.md          # Documentación del sistema
```

---

## 👨‍💻 Autor

**Matías Baeza**  
Estudiante de Ingeniería en Informática  
Proyecto de Patrones de Diseño – 2025

---
