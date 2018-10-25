package main

import (
	"os"
	"testing"
)

func TestNewDeck(t *testing.T) {
	d := newDeck()
	if len(d) != 52 {
		t.Errorf("Expected 52 but got %d", len(d))
	}
	if d[0] != "Ace of Spade" {
		t.Errorf("Expected Ace of Spade but got %s", d[0])
	}
	if d[51] != "King of Heart" {
		t.Errorf("Expected Heart of King but got %s", d[51])
	}
}

func TestShuffle(t *testing.T) {
	d := newDeck()
	d.shuffle()
	if len(d) != 52 {
		t.Errorf("Expected 52 but got %d", len(d))
	}
}

func TestSaveToFileAndLoadDeckFromFile(t *testing.T) {
	os.Remove("_decktesting")
	d := newDeck()
	d.saveToFile("_decktesting")
	newDeck := loadDeckFromFile("_decktesting")
	if len(newDeck) != 52 {
		t.Errorf("Expected 52 but got %d", len(d))
	}
	if newDeck[0] != d[0] {
		t.Errorf("Expected %s but got %s", d[0], newDeck[0])
	}
	if newDeck[51] != d[51] {
		t.Errorf("Expected %s but got %s", d[51], newDeck[51])
	}
	os.Remove("_decktesting")
}
