# Farmasis

Farmasis es una aplicación web diseñada para la gestión y administración integral de una farmacia. La plataforma permite la administración eficiente de inventario, así como el registro de clientes frecuentes, provedores, pedidos y otras funcionalidades clave para la correcta y eficiente gestión del negocio.

## Características principales
- Gestión de productos: Consulta, creación, edición y eliminación de productos.
- Gestión de clientes: Consulta, creación, edición y eliminación de clientes.
- Registro y administración de notas representando recordatorios o tareas pendientes a realizar.
- Interfaz de usuario moderna basada en Bootstrap para una experiencia intuitiva.


## Tecnologías empleadas
- Java 17 o superior
- Spring Boot
- Thymeleaf
- Bootstrap 5

## Estructura del proyecto
```
src/
  main/
    java/
      com/farmasis/
        controller/        # Controladores Spring MVC
        model/             # Entidades del dominio
        repository/        # Repositorios JPA
    resources/
      templates/           # Vistas Thymeleaf
      static/              # Recursos estáticos (CSS, JS)
```

## Instalación y ejecución
1. Clone el repositorio:
   ```bash
   git clone <url-del-repo>
   ```
2. Acceda al directorio del proyecto:
   ```bash
   cd Farmasis
   ```
3. Ejecute la aplicación utilizando Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Ingrese a la aplicación a través de [http://localhost:8080](http://localhost:8080)

## Personalización
- Las vistas pueden ser modificadas en `src/main/resources/templates`.
- Los estilos y scripts adicionales pueden agregarse en `src/main/resources/static`.

## Licencia
Este proyecto se distribuye bajo la licencia MIT.
