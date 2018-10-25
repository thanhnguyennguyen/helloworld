package main

import (
	"fmt"
)

func main() {
	// colors := map[string]string{
	// 	"red":   "#ff0000",
	// 	"white": "#ffffff",
	// }

	// var colors map[string]string
	colors := make(map[string]string)
	colors["white"] = "#ffffff"
	colors["red"] = "#ff0000"
	colors["blue"] = "#s53453"
	// delete(colors, "white")
	// fmt.Println(colors)

	for colorName, hex := range colors {
		fmt.Println(colorName, hex)
	}
}
