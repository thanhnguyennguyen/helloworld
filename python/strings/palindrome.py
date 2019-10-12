# A string is said to be palindrome if reverse of the string is same as string. For example, “abba” is palindrome, but “abbc” is not palindrome.

def palindrome(str) -> bool:

    reversed = ""
    for c in str:
        reversed = c + reversed
    return str == reversed
