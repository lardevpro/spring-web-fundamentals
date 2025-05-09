![spring](https://github.com/user-attachments/assets/393f81b2-c86f-4af3-a225-1cc1221cff82)


# Proyecto Spring MVC - Conexión con Base de Datos

Este proyecto está en construcción y tiene como objetivo demostrar el uso del patrón **MVC (Modelo-Vista-Controlador)** en **Spring Framework**. Actualmente, se están implementando diversas funcionalidades relacionadas con la validación de formularios, internacionalización, integración con Hibernate, y más.

## Tecnologías utilizadas

- **Spring Framework**
- **Hibernate ORM**
- **JSP / Thymeleaf**
- **MySQL**
- **Java 8**

## Funcionalidades Implementadas

### 1. **MVC en Spring**
El proyecto sigue el patrón de diseño **Modelo-Vista-Controlador (MVC)**, que separa la lógica de negocio, la presentación y el control de flujo de la aplicación. Actualmente, el controlador maneja las rutas y las vistas mediante `@RequestMapping` y `addAttribute`.

- **`@RequestMapping`**: Utilizado tanto en la clase como en los métodos para definir rutas relativas.
- **`addAttribute`**: Para enviar datos del controlador a la vista.

### 2. **Formularios y Data Binding**
Se utilizan **etiquetas MVC** para crear formularios y realizar **data binding** entre los datos del formulario HTML y los objetos Java. Las etiquetas `<form:form>`, `<form:input>`, entre otras, facilitan la integración de los datos del usuario en el backend.

### 3. **Validación de Formularios**
Se está utilizando **Hibernate Validator** para validar los campos del formulario de manera sencilla mediante anotaciones como `@NotNull`, `@Size`, y más.

- **`BindingResult`**: Para manejar errores de validación de forma eficiente.
- **Validación personalizada**: Se están creando validaciones personalizadas con anotaciones para mejorar la seguridad y la flexibilidad.

### 4. **Thymeleaf**
Se está utilizando **Thymeleaf** como motor de plantillas para generar vistas dinámicas y seguras. Thymeleaf permite vincular datos del backend con las vistas de una manera limpia y sencilla.

### 5. **Internacionalización de Mensajes**
El proyecto incluye la **internacionalización de mensajes** mediante la clase `ResourceBundleMessageSource`, lo que permite personalizar los mensajes de error y otros textos según el idioma del usuario.

### 6. **Expresiones Regulares en Validaciones**
Las **expresiones regulares** se utilizan en la validación de formularios, como en los códigos postales, para asegurar que los datos ingresados cumplan con el formato esperado.

### 7. **Hibernate ORM (Mapeo Objeto-Relacional)**
**Hibernate** se utiliza como framework ORM para mapear objetos Java a tablas de bases de datos y automatizar las operaciones CRUD (Crear, Leer, Actualizar y Eliminar).

---

## **Próximas Funcionalidades a Implementar**

Este proyecto aún está en construcción y se seguirán añadiendo nuevas características, tales como:

- Integración de más validaciones personalizadas.
- Mejora de la seguridad en las conexiones a la base de datos.
- Soporte para más motores de plantillas.
- Optimización de la internacionalización para múltiples idiomas.

---



 
