def isPalindrome(str) -> bool:

    reversed = ""
    for c in str:
        reversed += c
    return str == reversed
