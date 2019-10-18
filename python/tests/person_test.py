import unittest
import sys

# insert at 1, 0 is the script path (or '' in REPL)
sys.path.insert(1, '../classes')

import Person


class TestClassMethods(unittest.TestCase):

    def test_age(self):
        p = Person.Person("Nguyen", 27)
        self.assertEqual(p.myage(), 27)
