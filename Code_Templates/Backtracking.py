def backtrack(curr, nums, start, result):
    # Base case: if current combination is complete
    if start == len(nums):
        result.append(curr[:])  # Store a copy of the current combination
        return
    
    # Explore the decision of including the current number
    curr.append(nums[start])
    backtrack(curr, nums, start + 1, result)  # Move to the next element
    
    # Explore the decision of not including the current number
    curr.pop()  # Undo the last decision
    backtrack(curr, nums, start + 1, result)  # Move to the next element without including the current one

def generate_subsets(nums):
    result = []
    backtrack([], nums, 0, result)
    return result
