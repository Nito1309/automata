# Automata
ENGLISH:
An automaton that is able to identify the following tokens: Keyword (if, else, switch, case, default, for, while, break, int, String, double, char) Identifier (starts with a letter, no spaces, no special characters, except the underscore) Relational operator (<, <=, >, >=, ==, !=) Logical operator (&&, ||, !) Arithmetic operator (+, -, , /, %) Assignment ( = ) Integer Number Decimal Number Comment (with the format / */) Parenthesis ( (,) ) Brace ( {, } )

The inputs for the automaton will be any alphanumeric value, special characters, spaces, tabs, and line breaks (Enter)

Similarly, a software application must be developed in the language and platform required by the team to implement the automaton. The system must function as follows: The application must receive an external file (with the .txt extension). The file will contain a series of tokens that must be identified by the system, each token in the file will be separated by a space, a tab, or a line terminator. The application must go through the entire file and must identify the tokens contained in it. If there are incorrect tokens, the system must identify them. Once the file has been analyzed, the system must print a report on the number and type of identified tokens, as well as the number of incorrect tokens. The interface of the system must be in a visual environment, that is, with windows, buttons, text boxes, labels, tables, etc. The programming language is at the choice of each of you, consider that the interface of the system must be visual, therefore, choose a language that best adapts to this requirement, some suggestions can be: Java, Php, C#, Visual C++, Phyton. Even if you want, you can use a platform for mobile devices such as Android Studio (Java or Kotlin)

Important considerations: To identify the tokens of the file, the automaton must be strictly used, that is, the system, once it receives the external file, must go through it character by character to identify the matches, each character represents an input for the automaton. The only tokens that can be identified without the automaton are the reserved words. "If a regular expression is used to identify the tokens, the project is nullified." It is indifferent the use of uppercase and lowercase, except for reserved words (all must be written in lowercase)


ESPAÑOL:
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
