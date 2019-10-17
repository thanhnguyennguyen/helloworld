import unittest

from strings import strings


class TestStringMethods(unittest.TestCase):

    def test_stringcount(self):
        self.assertEqual(strings.stringcount("python is great. python is awesome"), 2)

