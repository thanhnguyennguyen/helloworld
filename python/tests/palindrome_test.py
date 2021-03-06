import unittest
import sys

# insert at 1, 0 is the script path (or '' in REPL)
sys.path.insert(1, '../strings')
import palindrome


class TestPalindromeMethods(unittest.TestCase):

    def test_palindrome(self):
        self.assertTrue(palindrome.palindrome("abba"))
        self.assertFalse((palindrome.palindrome("nguyennguyen")))

    def test_palindrome2(self):
        self.assertTrue(palindrome.palindrome2("abba"))
        self.assertFalse((palindrome.palindrome2("nguyennguyen")))
