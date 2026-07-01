# Práctica u2: Uso de Set y Map para gestión de personas

### Nombre: Valeria Jimenez
### Fecha: 30/06/2026

## EXPLICACION DE MI CODIGO ENLA PRACTICA DE USO DE SETS Y MAPS :

## Método A: filtrarYOrdenar()

### ¿Qué implementación de Set se utilizó?

Para este método utilicé un `TreeSet<Persona>`.

### ¿Por qué se eligió esta implementación?

Elegí `TreeSet` porque me permite almacenar elementos sin duplicados y además mantenerlos ordenados automáticamente. De esta forma no necesito recorrer la colección nuevamente para ordenarla después.

### ¿Cómo se garantiza la unicidad de los datos?

La unicidad se garantiza gracias al comportamiento de `TreeSet`, ya que no permite almacenar elementos considerados iguales según el comparador definido. Si una persona ya existe con los mismos criterios de comparación, no se agrega nuevamente.

### ¿Cómo se conserva o define el orden de los resultados?

Se definió un comparador personalizado que ordena las personas de la siguiente manera:

1. Por edad de mayor a menor.
2. Si dos personas tienen la misma edad, se ordenan alfabéticamente por nombre.

Esto permite que los resultados siempre aparezcan organizados de forma consistente.

### ¿Cómo funciona la lógica aplicada?

Primero se crea un `TreeSet` con un comparador personalizado. Luego se recorre la lista de personas recibida como parámetro. Si la edad de una persona es mayor o igual a la edad mínima indicada, se agrega al conjunto. Finalmente se retorna el conjunto ya filtrado y ordenado.

---

## Método B: agruparPorRangoEdad()

### ¿Qué implementación de Map y Set se utilizó?

Para este método utilicé:

- `TreeMap<String, Set<String>>`
- `LinkedHashSet<String>`

### ¿Por qué se eligieron estas implementaciones?

Elegí `TreeMap` porque mantiene las claves ordenadas automáticamente, facilitando la visualización de los grupos de edad.

Elegí `LinkedHashSet` porque evita elementos duplicados y conserva el orden en que los nombres fueron agregados.

### ¿Cómo se garantiza la unicidad de los datos?

La unicidad se garantiza mediante `LinkedHashSet`, ya que no permite almacenar nombres repetidos dentro de un mismo grupo de edad.

### ¿Cómo se conserva o define el orden de los resultados?

Las categorías de edad se almacenan dentro de un `TreeMap`, lo que mantiene las claves ordenadas. Además, los nombres dentro de cada grupo conservan el orden de inserción gracias al uso de `LinkedHashSet`.

### ¿Cómo funciona la lógica aplicada?

Primero se crean tres categorías:

- JOVEN
- ADULTO
- MAYOR

Después se recorre la lista de personas. De cada persona se obtiene únicamente el primer nombre utilizando el método `split()`.

Luego se determina el grupo correspondiente según la edad:

- Menor de 18 años → JOVEN
- Entre 18 y 30 años → ADULTO
- Mayor de 30 años → MAYOR

Finalmente, el primer nombre se agrega al conjunto asociado a su categoría dentro del mapa.

---

## Conclusión

En esta práctica se utilizaron diferentes implementaciones de las interfaces `Set` y `Map` para resolver problemas específicos. `TreeSet` permitió filtrar y ordenar personas automáticamente, mientras que la combinación de `TreeMap` y `LinkedHashSet` facilitó la agrupación por rangos de edad manteniendo unicidad y orden en los resultados.

Personalmente elegí estas estructuras porque aprovechan características que ya vienen implementadas en Java, haciendo el código más limpio, eficiente y fácil de mantener.
