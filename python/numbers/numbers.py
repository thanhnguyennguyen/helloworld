import random


def display():
    x = 1  # int
    y = 2.8  # float
    z = 1j  # complex

    print(type(x))
    print(type(y))
    print(type(z))


def genrand() -> int:
    return random.randrange(1, 10)

genrand()