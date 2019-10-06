# Python
Remember that Python is space sensitive

## Python Variables
 - Python has no command for declaring a variable.
 ```
    #display the data type of x:
    print(type(x)) 
  ```
 - Remember that variable names are case-sensitive
 - Variables do not need to be declared with any particular type and can even change type after they have been set.
 - String variables can be declared either by using single or double quotes
 - Python allows you to assign values to multiple variables in one line
 ``` x, y, z = "Orange", "Banana", "Cherry"```
 - The Python print statement is often used to output variables
 - String concat by `+`
 - Normally, when you create a variable inside a function, that variable is local, and can only be used inside that function.
   To create a global variable inside a function, you can use the global keyword
 
   
## Built-in Data Types
 In programming, data type is an important concept.
 
 Variables can store data of different types, and different types can do different things.
 
 Python has the following data types built-in by default, in these categories:
``` 
 Text Type:	str
 Numeric Types:	int, float, complex
 Sequence Types:	list(mutable array), tuple(immutable array), range
 Mapping Type:	dict (like golang map)
 Set Types:	set (immutable, does not hold duplicate values and is unordered), frozenset
 Boolean Type:	bool
 Binary Types:	bytes, bytearray, memoryview
```
