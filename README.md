# 🚗 Sistema de Gestión de Concesionaria - Proyecto JPA

## 📌 Descripción

Proyecto desarrollado como parte del curso de **TodoCode Academy**, el cual propone la creación de un sistema de inventario para una **concesionaria de autos**.  
El sistema permite gestionar vehículos que luego serán vendidos, incorporando un CRUD completo con funcionalidades extra agregadas por el desarrollador.

## 🚀 Características Mejoradas

### 🔍 Filtros Avanzados
- **Búsqueda por patente**: Permite localizar autos rápidamente usando su número de patente.
- **Resaltado visual**: Se marca la fila de los vehículos sin patente, representando los autos 0km disponibles para la venta.

### 🛡️ Validaciones y Control
- Autos 0km no deben tener patente cargada
- Validación de datos antes de guardar
- Control de errores mediante excepciones y validación visual en la interfaz

### 🧪 Tests Unitarios
El proyecto cuenta con pruebas automatizadas utilizando **JUnit 5**, con foco en garantizar la estabilidad del sistema.  
Los tests abarcan:

- **ControladoraLogicaTest**: Verifica el correcto funcionamiento del alta, baja, modificación y búsqueda de autos en la lógica central.
- **AutomovilValidatorTest**: Asegura que los datos de entrada del auto cumplan con los requisitos básicos (no nulos, longitudes válidas, coherencia de patente).

Estas pruebas ayudan a prevenir errores en fases tempranas del desarrollo, facilitando el mantenimiento y la escalabilidad del sistema.

### 📚 JavaDoc Completo
Cada clase y método del sistema está documentado mediante **JavaDoc**, permitiendo comprender fácilmente la funcionalidad general y específica del código.

## ⚙️ Tecnologías

| Componente       | Tecnología           |
|------------------|----------------------|
| Lenguaje         | Java 21              |
| IDE              | NetBeans 22          |
| Persistencia     | JPA con EclipseLink  |
| Base de datos    | MySQL 8.x            |
| Interfaz gráfica | Swing                |
| Gestor de builds | Maven                |
| Testing          | JUnit 5              |

## 📋 Requisitos

1. **Java Development Kit 21+**
2. **NetBeans 22** (requerido para el manejo correcto de imágenes en Swing)
3. **MySQL Server** con:
   - Base de datos llamada `concesionaria`
   - Usuario con permisos (ajustar en `persistence.xml`)
4. **MySQL Connector/J 8.0.17** o superior

## 🛠️ Instalación

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/tuusuario/ConcesionariaJpa.git
