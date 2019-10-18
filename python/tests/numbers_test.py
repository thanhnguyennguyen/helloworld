import sys
# insert at 1, 0 is the script path (or '' in REPL)
sys.path.insert(1, '../numbers')

import unittest

import numbers


class TestRandomMethods(unittest.TestCase):

    def test_random(self):
        self.assertLess(numbers.genrand(), 10)
