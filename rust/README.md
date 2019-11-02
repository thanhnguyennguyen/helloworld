# Rust
Ref: https://doc.rust-lang.org/book/ch01-02-hello-world.html#anatomy-of-a-rust-program
## Variables
- Using `let` keyword to declare a variable
- In Rust, variables are immutable by default
- To declare a mutable variable, use `let mut x = 5`
- Using shadow to override an immutable variable. To use shadow, use `let` keyword same as once you declare the original immutable one. Eg: `let x = 6`
- Differences between immutable variables and constant:
 - constants may be set only to a constant expression, not the result of a function call or any other value that could only be computed at runtime
 - the type of the constant value must be annotated.


