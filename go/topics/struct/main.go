package main

import (
	"fmt"
)

type person struct {
	firstName string
	lastName  string
	contact   contactInfo
}

type contactInfo struct {
	email string
	phone int
}

func main() {
	// nguyen := person{"nguyen", "thanhnguyen"}
	nguyen := person{firstName: "nguyen", lastName: "thanhnguyen"}
	fmt.Println(nguyen)
	nguyen.firstName, nguyen.lastName = nguyen.lastName, nguyen.firstName
	nguyen.contact.email = "nguyen@gmail.com"
	nguyen.contact.phone = 5454464
	fmt.Printf("%+v", nguyen)

	fmt.Println("teo")
	teo := person{
		firstName: "teo",
		lastName:  "nguyen",
		contact: contactInfo{
			email: "teo@gmail.com",
			phone: 543453,
		},
	}
	// (&teo).updateName("teoteo")
	// GO shortcut pointer: teo instead of &teo
	teo.updateName("teoteo")
	teo.print()
}
func (p *person) updateName(newfirstName string) {
	(*p).firstName = newfirstName
}

func (p person) print() {
	fmt.Printf("%+v", p)
}
