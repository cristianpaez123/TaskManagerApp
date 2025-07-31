🧠 Justificación Técnica
Durante el desarrollo y refactorización del módulo TaskManager, se tomaron decisiones técnicas clave que mejoran la calidad, mantenibilidad y escalabilidad del sistema:

🔹 1. Separación de responsabilidades (SRP)
Se desacopló la lógica de negocio (TaskManager) del almacenamiento (TaskRepository) y del envío de tareas (TaskSender), aplicando el principio de responsabilidad única. Esto permite modificar o reemplazar una parte del sistema sin afectar las demás.

🔹 2. Uso de interfaces y abstracción
Se definieron interfaces como TaskRepository y TaskSender para trabajar sobre abstracciones en lugar de implementaciones concretas. Esto mejora la flexibilidad y facilita el uso de distintas implementaciones (por ejemplo, un repositorio en memoria para pruebas o uno con base de datos en producción).

🔹 3. Inyección de dependencias
Se aplicó la inyección de dependencias de forma manual a través del constructor, lo que facilita la reutilización y el testeo de los componentes sin necesidad de frameworks adicionales.

🔹 4. Manejo seguro de errores
El método de sincronización (send) utiliza Result para manejar errores de forma segura y controlada, evitando el uso de excepciones no gestionadas y permitiendo una mejor experiencia de depuración y pruebas.

🔹 5. Código orientado a pruebas
Gracias a la separación por capas y el uso de interfaces, el módulo puede ser probado fácilmente con mocks o fakes, lo que mejora la calidad del software y permite realizar pruebas unitarias de forma aislada.

🔹 6. Arquitectura limpia simplificada
El diseño se basa en principios de Clean Architecture, manteniendo un dominio puro (modelo Task) sin dependencias externas, y desacoplando infraestructura de lógica de negocio.


