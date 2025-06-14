# Farmasis

Farmasis es una aplicación web para la gestión de productos y notas en una farmacia. Permite agregar, listar y administrar productos, así como registrar notas asociadas.

## Características principales
- Gestión de productos: alta, edición y listado.
- Registro de notas
- Interfaz moderna basada en Bootstrap.

## Tecnologías utilizadas
- Java 17+
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
1. Clona el repositorio:
   ```bash
   git clone <url-del-repo>
   ```
2. Entra al directorio del proyecto:
   ```bash
   cd Farmasis
   ```
3. Ejecuta la aplicación con Maven:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Accede a la aplicación en [http://localhost:8080](http://localhost:8080)

## Personalización
- Puedes modificar las vistas en `src/main/resources/templates`.
- Los estilos y scripts adicionales pueden agregarse en `src/main/resources/static`.

## Licencia
Este proyecto está bajo la licencia MIT.
