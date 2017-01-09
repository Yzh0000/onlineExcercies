class Solution(object):
    def reverseString(self, s):
        """
        :type s: str
        :rtype: str
        """
        return s[::-1]
        # Extended slices
"""
>>> L = range(10)
>>> L[::2]
[0, 2, 4, 6, 8]

Negative values also work to make a copy of the same list in reverse order:
>>>

>>> L[::-1]
[9, 8, 7, 6, 5, 4, 3, 2, 1, 0]

This also works for tuples, arrays, and strings:
>>> s='abcd'
>>> s[::2]
'ac'
>>> s[::-1]
'dcba'
"""