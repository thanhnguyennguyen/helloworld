package main

import (
	"fmt"
	"io/ioutil"
	"strings"
)

// create a new type 'deck', which is a slice of string

type deck []string

func newDeck() deck {
	cards := deck{}
	cardSuits := []string{"Spade", "Club", "Diamond", "Heart"}
	cardValues := []string{"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"}
	for _, suit := range cardSuits {
		for _, value := range cardValues {
			cards = append(cards, value+" of "+suit)
		}
	}
	return cards
}

// receiver
func (d deck) print() {
	for i, card := range d {
		fmt.Println(i, card)
	}
}

/**
* receiver
 */
func (d deck) toString() string {
	return strings.Join(d, ",")
}

/**
* receiver
 */
func (d deck) saveToFile(fileName string) error {
	return ioutil.WriteFile(fileName, []byte(d.toString()), 0777)
}

func loadDeckFromFile(fileName string) (deck, error) {
	b, err := ioutil.ReadFile(fileName)
	if err != nil {
		return deck{}, err
	}
	var d deck
	d = strings.Split(string(b), ",")
	return d, err
}

func deal(d deck, handleSize int) (deck, deck) {
	return d[:handleSize], d[handleSize:]
}
