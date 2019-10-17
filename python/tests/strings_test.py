import unittest

from strings.strings import stringcount


class TestStringMethods(unittest.TestCase):

    def test_stringcount(self):
        self.assertEqual(stringcount("python is great. python is awesome"), 2)
