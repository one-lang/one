# Delta
Delta is an experimental programming language that only uses one primitive type.. an integer.  

# Running Delta Programs
Java 8 must be installed on your system to run Delta programs.

    java -jar delta.jar delta.delta
Replace `delta.jar` with the path to the Delta interpreter and `delta.delta` with the program path.

Delta also supports Linux piping:

    echo print_chars\(65\)\; | java -jar delta.jar

## *BUT* **WATS** AB*OOT* STRRREEEEENGS??//??????/????!?!!?!!1?!!?1?!?!/1?!!?!?!?!?!
Delta has some little sugar (it's syntatic, not edible).  
When you write a string in Delta, it is automatically converted into an array of number, each representing it's own character.  
`"ABC"` becomes `[66, 67, 68]`.

## Tutorial
Delta has a mixed syntax similar to both Python and Javascript.

    someVar = 1;
    someOtherVar = someVar + 5 
Statements can end in both newlines and semi-colons.

Calling functions is also possible.
As of v1.1 beta the following functions are supported:

### `print(number/array)`
The `print` function prints (with a newline) whatever arguments are passed in order.

    print(2 * 6 - 4 % 3);
The above statement would print `11`.

### `print_chars(number/array)`
Does the same as `print` except that the numbers character representation is printed.

### `input()`
Returns the next line thrown into `stdin`.
_Warning: Pauses the thread_

### `to_int(array)`
Converts the array to a number.
It's the twin of parsing strings in other languages.

### See `EXAMPLES.md` for more details
