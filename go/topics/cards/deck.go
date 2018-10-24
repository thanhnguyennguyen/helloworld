package main

import "fmt"

// create a new type 'deck', which is a slice of string

type deck []string

func newDeck() deck {
	cards := deck{}
	cardSuits := []string{"Spades", "Diamonds", "Hearts", "Clubs"}
	cardValues := []string{"Ace", "Two", "Three", "Four"}
	for _, suit := range cardSuits {
		for _, value := range cardValues {
			cards = append(cards, value+" of "+suit)
		}
	}
	return cards
}

// function with receiver
func (d deck) print() {
	for i, card := range d {
		fmt.Println(i, card)
	}
}
