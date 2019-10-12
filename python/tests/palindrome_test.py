import unittest

from strings.palindrome import isPalindrome


class TestPalindrome(unittest.TestCase):

    def test_palindrome(self):
        self.assertEqual(isPalindrome("nguyennguyen"), False)

