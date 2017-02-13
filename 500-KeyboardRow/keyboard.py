class Solution(object):
    def findWords(self, words):
        return filter(re.compile('^([qwertyuiop]*|[asdfghjkl]*|[zxcvbnm]*)$',re.IGNORECASE).match,words)