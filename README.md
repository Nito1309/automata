# Automata

## English:

An automaton that is able to identify the following tokens:

- **Keyword**: `if`, `else`, `switch`, `case`, `default`, `for`, `while`, `break`, `int`, `String`, `double`, `char`
- **Identifier**: Starts with a letter, no spaces, no special characters, except the underscore (`_`)
- **Relational operator**: `<`, `<=`, `>`, `>=`, `==`, `!=`
- **Logical operator**: `&&`, `||`, `!`
- **Arithmetic operator**: `+`, `-`, `*`, `/`, `%`
- **Assignment**: `=`
- **Integer Number**
- **Decimal Number**
- **Comment**: With the format `/* */`
- **Parenthesis**: `(`, `)`
- **Brace**: `{`, `}`

The inputs for the automaton will be any alphanumeric value, special characters, spaces, tabs, and line breaks (Enter).

### System Requirements

A software application must be developed in the language and platform required by the team to implement the automaton. The system must function as follows:

1. The application must receive an external file (with the `.txt` extension).
2. The file will contain a series of tokens that must be identified by the system. Each token in the file will be separated by a space, a tab, or a line terminator.
3. The application must go through the entire file and identify the tokens contained in it.
4. If there are incorrect tokens, the system must identify them.
5. Once the file has been analyzed, the system must print a report on the number and type of identified tokens, as well as the number of incorrect tokens.

### Interface Requirements

The interface of the system must be in a visual environment, that is, with windows, buttons, text boxes, labels, tables, etc. The programming language is at the choice of each of you. Consider that the interface of the system must be visual, therefore, choose a language that best adapts to this requirement. Some suggestions can be:

- Java
- PHP
- C#
- Visual C++
- Python
- Android Studio (Java or Kotlin)

### Important Considerations

- To identify the tokens of the file, the automaton must be strictly used. That is, the system, once it receives the external file, must go through it character by character to identify the matches. Each character represents an input for the automaton.
- The only tokens that can be identified without the automaton are the reserved words.
- **If a regular expression is used to identify the tokens, the project is nullified.**
- The use of uppercase and lowercase is indifferent, except for reserved words (all must be written in lowercase).

---

## ESPAÑOL:

Un autómata que es capaz de identificar los siguientes tokens:

- **Palabra reservada**: `if`, `else`, `switch`, `case`, `default`, `for`, `while`, `break`, `int`, `String`, `double`, `char`
- **Identificador**: Inicia con letra, sin espacios en blanco, sin caracteres especiales, excepto el guión bajo (`_`)
- **Operador relacional**: `<`, `<=`, `>`, `>=`, `==`, `!=`
- **Operador lógico**: `&&`, `||`, `!`
- **Operador aritmético**: `+`, `-`, `*`, `/`, `%`
- **Asignación**: `=`
- **Número Entero**
- **Número Decimal**
- **Comentario**: Con el formato `/* */`
- **Paréntesis**: `(`, `)`
- **Llave**: `{`, `}`

Las entradas para el autómata serán cualquier valor alfanumérico, caracteres especiales, espacios en blanco, tabuladores y saltos de línea (Enter).

### Requisitos del Sistema

Se deberá realizar una aplicación de software, en el lenguaje y plataforma que el equipo requiera, para implementar el autómata. El sistema deberá funcionar de la siguiente forma:

1. La aplicación debe recibir un archivo externo (con extensión `.txt`).
2. El archivo contendrá una serie de tokens que deberán ser identificados por el sistema. Cada token que contenga el archivo estará separado por un espacio en blanco, un tabulador o un terminador de línea.
3. La aplicación deberá hacer un recorrido por todo el archivo y deberá identificar los tokens contenidos en el mismo.
4. Si existen tokens erróneos, el sistema deberá identificarlos.
5. Una vez que el archivo haya sido analizado, el sistema deberá imprimir un reporte de la cantidad y tipo de tokens identificados, así como la cantidad de tokens erróneos.

### Requisitos de la Interfaz

La interfaz del sistema debe ser en un entorno visual, es decir, con ventanas, botones, cajas de texto, etiquetas, tablas, etc. El lenguaje de programación es a elección de cada uno de ustedes. Consideren que la interfaz del sistema debe ser visual, por lo tanto, elijan un lenguaje que se adapte de mejor forma a este requerimiento. Algunas sugerencias pueden ser:

- Java
- PHP
- C#
- Visual C++
- Python
- Android Studio (Java o Kotlin)

### Consideraciones Importantes

- Para identificar los tokens del archivo, se debe realizar estrictamente a través del autómata. Es decir, el sistema, una vez que reciba el archivo externo, deberá recorrerlo carácter por carácter para identificar las coincidencias. Cada carácter representa una entrada para el autómata.
- Los únicos tokens que se pueden identificar sin el autómata son las palabras reservadas.
- **Si se utiliza una expresión regular para identificar los tokens, se anula el proyecto.**
- Es indistinto el uso de mayúsculas y minúsculas, a excepción de las palabras reservadas (todas deben escribirse en minúsculas).
