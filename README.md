Ejercicio Nro. 2:

Desarrollar una clase que mediante el uso de dos datos miembros de tipo ArrayList, uno
con valores enteros y otro con objetos de la clase base Golosinas implementada en la
Guía Nro.1, incluya los siguientes métodos:

a) Constructor alternativo: recibe como primer parámetro la capacidad inicial de la
colección de enteros y llena esas posiciones con valores generados al azar de 4
dígitos enteros positivos. Como segundo parámetro, un vector con varios objetos
de la clase Golosinas y los asigna al ArrayList correspondiente.

b) maximoValor(): devuelve el máximo valor almacenado en la colección de enteros.

c) quitarObjeto (Objeto Golosinas): elimina el objeto recibido como parámetro. Si no
existe, lanza una excepción propia.

d) ordenDescendente(): devuelve la colección de objetos de la clase Golosinas
ordenada en forma descendente, según el precio.

e) hayRepetidos(): indica si existen valores repetidos en la colección de objetos
Golosinas, según un criterio diferente al punto c.

f) igualValores(List &lt;Integer&gt;): indica si la colección recibida como argumento
tiene algún valor en común, respecto a la estructura existente.

g) agregar(List &lt;Golosinas&gt;): agrega la lista recibida como argumento al final del
ArrayList propio.

h) busquedaMultiple(Integer): retorna la cantidad de veces que se encuentra un
número en la colección. De no existir, lanza la misma excepción del punto c.

i) distintosValores(List &lt;Golosinas&gt;): devuelve un ArrayList con aquellos objetos
que no coinciden con los recibidos como argumentos.

j) copiarLista(int pos1, int pos1): copiar en una lista nueva las posiciones de la lista
de enteros, comprendidas entre los argumentos recibidos.

Desarrollar un programa que genere un objeto cualquiera de dicha clase y ejecute todos
los métodos mencionados mostrando los resultados en pantalla y en un archivo TXT con
formato libre, re direccionando la salida estándar.
