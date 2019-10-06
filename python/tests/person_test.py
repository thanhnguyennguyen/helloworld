import unittest

from classes import Person


class TestClassMethods(unittest.TestCase):

    def test_age(self):
        p = Person.Person("Nguyen", 27)
        self.assertEqual(p.myage(), 27)
