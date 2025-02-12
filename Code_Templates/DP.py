# Dynamic programming: top-down memoization

def fn(arr):
    def dp(STATE):
        con = True # BASE_CASE
        if con:
            return 0
        
        if STATE in memo:
            return memo[STATE]
        
        ans = RECURRENCE_RELATION(STATE)
        memo[STATE] = ans
        return ans

    memo = {}
    return dp(STATE_FOR_WHOLE_INPUT)