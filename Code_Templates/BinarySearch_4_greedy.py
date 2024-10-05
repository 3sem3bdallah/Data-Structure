# If looking for a minimum:

def fn(arr):
    def check(x):
        # this function is implemented depending on the problem
        BOOLEAN = 0 # Change this when implement
        return BOOLEAN

    MINIMUM_POSSIBLE_ANSWER = 0 # Change this when implement
    MAXIMUM_POSSIBLE_ANSWER = 0 # Change this when implement
    left = MINIMUM_POSSIBLE_ANSWER
    right = MAXIMUM_POSSIBLE_ANSWER
    while left <= right:
        mid = (left + right) // 2
        if check(mid):
            right = mid - 1
        else:
            left = mid + 1
    
    return left

# If looking for a minimum:

def fn(arr):
    def check(x):
        # this function is implemented depending on the problem
        BOOLEAN = 0 # Change this when implement
        return BOOLEAN

    MINIMUM_POSSIBLE_ANSWER = 0 # Change this when implement
    MAXIMUM_POSSIBLE_ANSWER = 0 # Change this when implement
    while left <= right:
        mid = (left + right) // 2
        if check(mid):
            left = mid + 1
        else:
            right = mid - 1
    
    return right