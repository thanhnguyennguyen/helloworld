import unittest

from numbers import numbers


class TestRandomMethods(unittest.TestCase):

    def test_random(self):
        self.assertLess(numbers.genrand(), 10)
