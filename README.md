# 🚗 Sistema de Gestión para Concesionaria - Proyecto Mejorado

## 📌 Descripción
Sistema completo para gestión de vehículos en una concesionaria, desarrollado en **Java 21** como parte de la propuesta de **TodoCode Academy**.  
La consigna propone crear un inventario de autos que luego serán vendidos, diferenciando entre autos usados y 0km (los cuales **no tienen patente cargada**).

Este proyecto implementa un CRUD básico utilizando **JPA con EclipseLink** como proveedor de persistencia, y conexión a base de datos **MySQL**.

Además, se incorporaron **mejoras propias** como un filtro por patente, resaltado visual para autos 0km y pruebas unitarias.

## 🚀 Características Mejoradas

### 🔍 Filtros Avanzados
- **Búsqueda por patente**: Permite buscar rápidamente autos registrados por número de patente.
- **Resaltado visual**: Las filas de vehículos **sin patente** (autos 0km) se destacan con un color especial para facilitar su identificación en el inventario.

### 🛡️ Validaciones y Control
- Validación de campos obligatorios antes de guardar un auto.
- Verificación de que los autos 0km no tengan patente asignada.
- Gestión completa de errores con mensajes amigables al usuario.

### 🧪 Tests Unitarios
El sistema incluye **tests automatizados con JUnit 5** que validan la lógica del proyecto:

- **Altas, bajas y modificaciones** en la base de datos.
- **Búsquedas y validaciones de consistencia** de datos.
- Control de errores comunes.
  
Los tests se encuentran en `src/test/java` y pueden ejecutarse desde NetBeans o con Maven.

### 📚 JavaDoc Completo
Cada clase y método del proyecto está documentado con **JavaDoc**, facilitando su comprensión y mantenimiento.  
La documentación describe el propósito de cada clase, los parámetros esperados y el comportamiento de los métodos.

## ⚙️ Tecnologías

| Componente       | Tecnología           |
|------------------|----------------------|
| Lenguaje         | Java 21              |
| IDE              | NetBeans 22          |
| Persistencia     | JPA (EclipseLink)    |
| Base de datos    | MySQL 8.x            |
| Interfaz gráfica | Swing                |
| Gestor de builds | Maven                |
| Testing          | JUnit 5              |

## 📋 Requisitos

1. **Java Development Kit 21**
2. **NetBeans 22** (recomendado para soporte visual e imágenes)
3. **MySQL Server** con:
   - Base de datos llamada `concesionaria`
   - Usuario con permisos adecuados (configurado en `persistence.xml`)
4. **MySQL Connector/J 8.0.17** o superior

## 🛠️ Instalación

1. Clonar el repositorio:
   ```bash
   git clone https://github.com/cendra-n/ConcesionariaJpa.git
Crear la base de datos en MySQL:

sql
Copiar
Editar
CREATE DATABASE concesionaria;
Configurar el archivo persistence.xml:

xml
Copiar
Editar
<property name="javax.persistence.jdbc.url" value="jdbc:mysql://localhost:3306/concesionaria"/>
<property name="javax.persistence.jdbc.user" value="tu_usuario"/>
<property name="javax.persistence.jdbc.password" value="tu_contraseña"/>
Abrir el proyecto en NetBeans 22 como proyecto Maven.

▶️ Ejecución
Ejecutar la clase principal Principal.java.

Se abrirá la interfaz gráfica para gestionar los vehículos.

📚 Documentación
El proyecto incluye:

JavaDoc en todas las clases y métodos

Comentarios explicativos en el código fuente

Pruebas unitarias que permiten validar el correcto funcionamiento del sistema

✨ Créditos
Este proyecto fue desarrollado a partir del ejercicio propuesto por TodoCode Academy, con las siguientes mejoras propias:

Filtro dinámico por patente

Resaltado visual de autos 0km

Pruebas unitarias con JUnit

Documentación profesional con JavaDoc

Interfaz gráfica clara y funcional

🆘 Soporte
En caso de errores o problemas:

Verificá que el servidor MySQL esté corriendo correctamente.

Asegurate de tener NetBeans 22 y Java 21 instalados.

Revisá que el persistence.xml tenga los datos correctos de conexión.

Confirmá que el conector MySQL está correctamente agregado en las dependencias Maven.
