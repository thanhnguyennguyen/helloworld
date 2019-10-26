package main

import (
	"fmt"
	"time"
)

// lesson learn : https://tour.golang.org/flowcontrol/12
// A defer statement defers the execution of a function until the surrounding function returns.

//The deferred call's arguments are evaluated immediately, but the function call is not executed until the surrounding function returns.

func main() {
	start := time.Now()
	defer fmt.Println(time.Since(start))
	time.Sleep(2 * time.Second)
	fmt.Println("hey", time.Since(start))
}
