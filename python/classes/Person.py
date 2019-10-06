class Person:
    def __init__(mysillyobject, name, age):
        mysillyobject.name = name
        mysillyobject.age = age

    def myage(self):
        return self.age


p1 = Person("NguyenNguyen", 27)
p1.myage()
