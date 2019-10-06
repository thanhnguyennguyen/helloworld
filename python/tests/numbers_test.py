import unittest

from numbers.numbers import genrand


class TestRandomMethods(unittest.TestCase):

    def test_random(self):
        self.assertLess(genrand(), 10)
