import unittest
import sys
# insert at 1, 0 is the script path (or '' in REPL)
sys.path.insert(1, '../strings')

import strings


class TestStringMethods(unittest.TestCase):

    def test_stringcount(self):
        self.assertEqual(strings.stringcount("python is great. python is awesome"), 2)


