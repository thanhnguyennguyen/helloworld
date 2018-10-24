# GO
I need to learn GO and resolve a small problem using GO in 2 days to get a new job
OK, let go to GO world

### Common commands
- go build: compile packages and dependencies
- go run: compile and execute GO program
- go get: download and install packages and dependencies
- go install: compile and install packages and dependencies
- go test: never write code without tests, hehe
- go fmt :  gofmt (reformat) package sources

### Types of packages
- Executable: generate files that we can run
    - Package main
    - must have func called main
- Reusable: use as helpers

### Basic data types
Go is using Static type, like C++, Java
We need to specify data type when we declare them
- bool
- string: use double quotes 
- int
- float64
- array
- map

### Declare new variables:
- var [variable name] [datatype]
- [variable name] := [value]

#### declare multiple variables:
        const a, b, c = 3, 4, "foo"  // a = 3, b = 4, c = "foo", untyped integer and string constants
        const u, v float32 = 0, 3    // u = 0.0, v = 3.0

### Declare functions
        
        func [function name]([argument name] [argument data type], ...) [return type] {

        }
### slice and array
- array: fixed length list of things

            var a [4]int
            a[0] = 1

- slice: an array that can grow or shrink

            letters := []string{"a", "b", "c", "d"}