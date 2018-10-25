package main

func main() {
	// cards := newDeck()
	// cards.print()
	// hand, remainingCards := deal(cards, 5)

	// fmt.Println("Your hand cards:")
	// hand.print()
	// fmt.Println("Remaining cards:")
	// remainingCards.print()
	// cards.saveToFile("deck.txt")
	newDeck, err := loadDeckFromFile("deck.txt")
	if err == nil {
		newDeck.print()
	}
}
