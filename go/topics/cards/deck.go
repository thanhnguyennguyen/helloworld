package main

import (
	"fmt"
	"io/ioutil"
	"math/rand"
	"os"
	"strings"
	"time"
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

/**
* receiver
 */
func (d deck) shuffle() {
	for i := range d {
		source := rand.NewSource(time.Now().UnixNano())
		random := rand.New(source)
		r := random.Intn(len(d) - 1)
		d[i], d[r] = d[r], d[i]
	}
}

func loadDeckFromFile(fileName string) deck {
	b, err := ioutil.ReadFile(fileName)
	if err != nil {
		fmt.Println("Error:", err)
		os.Exit(1)
	}
	var d deck
	d = strings.Split(string(b), ",")
	return d
}

func deal(d deck, handleSize int) (deck, deck) {
	return d[:handleSize], d[handleSize:]
}
