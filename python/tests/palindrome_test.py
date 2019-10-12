import unittest

from strings.palindrome import palindrome


class TestPalindromeMethods(unittest.TestCase):

    def test_palindrome(self):
        self.assertTrue(palindrome("abba"))
        self.assertFalse((palindrome("nguyennguyen")))

