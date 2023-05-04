# PruebaEvPatronesdeConstruccion_2022

Mi repositorio es: https://github.com/rodriiMatamoros/PruebaEvPatronesdeConstruccion_2022.git

## Ejercicio 1

El Servicio de Emergencias Sanitarias de Madrid, antes conocido como 112, está organizado en una jerarquía de bases. Algunas de estas bases realmente disponen de personal y ambulancias (por ejemplo la de Villanueva de la Cañada), mientras que otras son «unidades administrativas» que agrupan un conjunto de bases (por ejemplo Majadahonda, que agrupa la unidad del Hospital Clínico Universitario Puerta de Hierro y la de Alcobendas entre otras).

Para cada base, interesa modelar los siguientes datos:

Nombre de la base.
Número de ambulancias, que en el caso de las bases compuestas es la suma de las ambulancias disponibles en las bases que las componen en ese momento.
Tiempo medio de asistencia, que en el caso de las bases compuestas es la media de los tiempos medios de asistencia registrados en las bases que las componen en ese momento.
Elaborar un diseño que permita modelar adecuadamente esta situación, implentando completamente en Replit las clases que modelan las bases, sean del tipo que sean. Definir los patrones de diseño utilizado

### Porque un Builder?

En este ejercicio hemos utilizado el patrón creacional Builder para construir objetos complejos de manera más sencilla. El patrón Builder separa la construcción de un objeto complejo de su representación, permitiendo que el mismo proceso de construcción pueda crear diferentes representaciones.

En este caso, hemos utilizado el patrón Builder para crear instancias de la clase Base y sus subclases (BaseSimple y BaseCompuesta). Cada tipo de Base tiene su propio Builder que se encarga de construir la Base de forma adecuada. Esto permite crear objetos complejos con una sintaxis más clara y fácil de leer.

En resumen, hemos utilizado el patrón creacional Builder en este ejercicio para separar la construcción de objetos complejos de su representación y simplificar la creación de instancias de la clase Base y sus subclases. Esto ha permitido crear objetos complejos con una sintaxis más clara y fácil de leer, y con la flexibilidad necesaria para adaptarse a diferentes escenarios.







## Ejercicio 2

En una aplicación de venta y configuración de ordenadores personales se considera un ordenador como la suma de varios componentes (una unidad central y varios elementos periféricos). El mínimo imprescindible para que se considere un ordenador es la unidad central, un dispositivo de entrada y otro de salida, pero pueden añadirse todos los que deseemos ofertar o que nos pidan los clientes. Para crearlo habrá que dar esos componentes mínimos y se puede modificar la configuración en cualquier momento añadiendo, quitando o cambiando exclusivamente periféricos. Por último, el precio de venta del ordenador es la suma de sus componentes.

Todos componentes tienen información sobre el nombre del fabricante, el modelo y el precio de venta, que cambia con frecuencia.

Los dispositivos de entrada que manejamos actualmente son el teclado, el ratón y la tableta gráfica. En todos los casos necesitamos saber el tipo de conector que utiliza (será un STRING) y los puertos válidos(varios valores de tipo entero).

Los dispositivos de salida de que disponemos son las pantallas y las impresoras (de inyección y láser).

También tenemos que saber los puertos válidos. Además para las impresoras necesitamos saber el tipo de cartucho o "tóner ütilizado y el número de páginas impresas desde el último cambio de "tóner"(sólo para impresoras láser).

Por último tenemos un dispositivo especial, la pantalla táctil que sirve de dispositivo de entrada y de salida simultáneamente.

Diseñe las clases y relaciones que representen una solución adecuada para este problema. Escriba en Replit al menos las clases que representen el ordenador, los dos primeros niveles de la jerarquía de componentes y las impresoras láser. Definir los patrones de diseño utilizado
