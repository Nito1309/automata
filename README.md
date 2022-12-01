# Automata
Autómata que es capaz de identificar los siguientes tokens:
        Palabra reservada (if, else, switch, case, default, for, while, break, int, String, double, char)
        Identificador (Inicia con letra, sin espacios en blanco, sin caracteres especiales, excepto el guión bajo)
        Operador relacional (<, <=, >, >=, ==, !=)
        Operador lógico (&&, ||, !)
        Operador aritmético (+, -, *, /, %)
        Asignación ( = )
        Número Entero
        Número decimal
        Comentario ( Con el formato /* */)
        Parentesis ( (,) )
        Llave ( {, } )
        
Las entradas para el autómata serán cualquier valor alfanumérico, caracteres especiales, espacios en blanco,
tabuladores y saltos de linea (Enter)

Así mismo, se deberá de realizar una aplicación de software, en el lenguaje y plataforma que el equipo requiera,
para implementar el autómata, El Sistema deberá de funcionar de la siguiente forma:
 La aplicación debe recibir un archivo externo(Con extensión .txt)
 El archivo contendrá una serie de tokens que deberán de ser identificados por el sistema, cada token que
contenga el archivo estará separado por un espacio en blanco, un tabulador o un terminador de línea.
 La aplicación deberá de hacer un recorrido por todo el archivo y deberá identificar los tokens contenidos
en el mismo. Si existen token erróneos el sistema deberá identificarlos.
 Una vez que el archivo haya sido analizado, el sistema deberá de imprimir un reporte de la cantidad y tipo
de tokens identificados, así mismo, la cantidad de tokens erróneos.
 La interfaz del sistema debe ser en un entorno visual, es decir, con ventanas, botones, cajas de texto,
etiquetas, tablas, etc.
 El lenguaje de programación es a elección de cada uno de ustedes, consideren que la interfaz del sistema
debe ser visual, por lo tanto, eligan un lenguaje que se adapte de mejor forma a este requerimiento,
algunas sugerencias pueden ser : Java, Php, C#, Visual C++, Phyton. Inclusive, si lo desean, pueden utilizar
alguna plataforma para dispositivos móviles como Android Studio (Java o Kotlin)

Consideraciones importantes:
Para identificar los tokens del archivo, se debe de realizar estrictamente a través del autómata, es decir, el sistema,
una vez que reciba el archivo externo, deberá de recorrerlo caracter por caracter para identificar las coincidencias,
cada caracter representa una entrada para el autómata.
Los únicos tokens que se pueden identificar sin el autómata son las palabras reservadas.
“Si se utiliza una expresión regular para identificar los tokens se anula el proyecto”
Es indistino el uso de mayúsculas y minúsculas, a excepción de las palabras reservadas (Todas deben escribirse en
minúsculas)
