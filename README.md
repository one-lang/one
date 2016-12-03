# One
One is an experimental programming language that only uses one primitive type.. an integer.  

# Running One Programs
Java 8 must be installed on your system to run One programs.

    java -jar one.jar one.one
Replace `one.jar` with the path to the One interpreter and `one.one` with the program path.

## *BUT* **WATS** AB*OOT* STRRREEEEENGS??//??????/????!?!!?!!1?!!?1?!?!/1?!!?!?!?!?!
One has some little sugar (it's syntatic, not edible).  
When you write a string in One, it is automatically converted into an array of number, each representing it's own character.  
`"ABC"` becomes `[66, 67, 68]`.

## Tutorial
One has a mixed syntax similar to both Python and Javascript.

    someVar = 1;
    someOtherVar = someVar + 5;

Calling functions is also possible.
As of v1.0 beta the following functions are supported:

### `print(any)`
The `print` function prints (with a newline) whatever arguments are passed in order.

    print(2 * 6 - 4 % 3);
The above statement would print `11`.

### `print_chars(any)`
Does the same as `print` except that the numbers character representation is printed.

### `input()`
Returns the next line thrown into `stdin`.
_Warning: Pauses the thread_

### `to_int(array)`
Converts the array to a number.
It's the twin of parsing strings in other languages.

### See `EXAMPLES.md` for more details
