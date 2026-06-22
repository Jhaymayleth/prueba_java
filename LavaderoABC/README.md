# Sistema de Gestión - Lavadero ABC

## Descripción del proyecto

Aplicación desarrollada en Java para gestionar los procesos principales de un lavadero de vehículos.

El sistema permite administrar información de clientes, vehículos, empleados, productos, servicios, categorías, cubículos y órdenes de venta.

El proyecto está desarrollado como un prototipo funcional aplicando programación orientada a objetos (POO) y una estructura organizada por capas.

---

## Objetivo

Diseñar un sistema que permita representar las principales entidades del negocio de un lavadero de carros, facilitando el registro y consulta de información relacionada con la atención de clientes, venta de productos y aplicación de servicios.

---

## Tecnologías utilizadas

- Java
- Programación Orientada a Objetos (POO)
- Java Swing (Interfaz gráfica)
- Visual Studio Code
- Git / GitHub

---

## Estructura del proyecto

```

LavaderoABC
│
├── src
│   │
│   └── lavadero
│       │
│       ├── modelo
│       │   ├── Cliente.java
│       │   ├── Vehiculo.java
│       │   ├── Empleado.java
│       │   ├── Cargo.java
│       │   ├── Contrato.java
│       │   ├── Producto.java
│       │   ├── Servicio.java
│       │   ├── Categoria.java
│       │   ├── Cubiculo.java
│       │   ├── OrdenVenta.java
│       │   ├── DetalleVenta.java
│       │   └── ServicioAplicado.java
│       │
│       ├── vista
│       │   ├── VentanaPrincipal.java
│       │   ├── Formularios.java
│       │   ├── Botones.java
│       │   └── Tablas.java
│       │
│       └── Main.java
│
└── README.md

```

---

## Módulos principales

### Clientes

Permite registrar y consultar la información de los clientes:

- Identificación
- Nombre
- Apellidos
- Teléfono
- Correo

Un cliente puede tener asociados varios vehículos.

---

### Vehículos

Gestiona los automóviles atendidos:

- Placa
- Marca
- Tipo
- Color

Relación:

Cliente 1 ---- N Vehículos

---

### Empleados

Administra los trabajadores del lavadero:

- Datos personales
- Cargo
- Contrato
- Funciones asignadas

---

### Productos y Servicios

Permite manejar el catálogo disponible:

Productos:

- Código
- Nombre
- Marca
- Precio
- Stock

Servicios:

- Código
- Nombre
- Precio
- Descripción


Ambos pertenecen a una categoría.

---

### Órdenes de venta

Representa las solicitudes realizadas por los clientes.

Incluye:

- Cliente
- Empleado encargado
- Productos
- Servicios
- Detalles de venta
- Total de la compra

---

### Cubículos

Controla las áreas disponibles para aplicar servicios:

Estados:

- Disponible
- Ocupado

---

## Arquitectura del proyecto

El sistema está organizado utilizando una separación básica:

### Modelo

Contiene las clases principales del negocio.

Ejemplo:



Cliente
Producto
Vehiculo
Servicio
Empleado



---

### Vista

Contiene los elementos de interfaz gráfica:

- Ventanas
- Formularios
- Botones
- Tablas

---

## Ejecución del proyecto

1. Abrir el proyecto en Visual Studio Code.

2. Verificar que Java esté instalado.

3. Ejecutar:



src/lavadero/Main.java



4. La aplicación iniciará el sistema del Lavadero ABC.

---

## Funcionalidades implementadas

Actualmente el sistema permite:

✔ Crear entidades del negocio  
✔ Manejar relaciones entre clases  
✔ Registrar clientes  
✔ Registrar productos  
✔ Gestionar vehículos  
✔ Controlar cubículos  
✔ Crear órdenes de venta  
✔ Interfaz gráfica inicial  

---

## Autor

Jose Mauricio Rangel Nuñez

Proyecto académico - Ingeniería de Software

Sistema de gestión para Lavadero ABC

