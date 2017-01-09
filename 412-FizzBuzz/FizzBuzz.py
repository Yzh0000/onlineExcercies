class Solution(object):
    def fizzBuzz(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        rslt = list()
        for i in range(1, n + 1):
            if (i % 15 == 0):
                rslt.append("FizzBuzz")
            elif (i % 5 == 0):
                rslt.append("Buzz")
            elif (i % 3 == 0):
                rslt.append("Fizz")
            else:
                rslt.append(str(i))
        return rslt
            # range(stop)
            # range(start, stop[, step])
            # construct a python list.
            
            # str() <--> int()
            # "1" <--> 1 