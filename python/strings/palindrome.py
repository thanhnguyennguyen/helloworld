# A string is said to be palindrome if reverse of the string is same as string.
# For example, “abba” is palindrome, but “abbc” is not palindrome.


def palindrome(str) -> bool:

    reversed = ""
    for c in str:
        reversed = c + reversed
    return str == reversed


def palindrome2(str) -> bool:
    i = 0
    length = len(str)
    while i < length:
        if str[i] != str[length - i - 1]:
            return False
        i = i + 1
    return True
