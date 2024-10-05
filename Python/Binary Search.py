def binary_search(my_list, item):
    """
    Perform a binary search on a sorted list to find the index of a specific item.

    Parameters:
    my_list (List[int]): A sorted list of integers where the search will be performed.
    item (int): The integer value to search for within the list.

    Returns:
    Tuple[Optional[int], int]: A tuple where the first element is the index of the item if found (or None if not found),
                                and the second element is the number of steps taken to complete the search.

    Example:
    >>> binary_search([1, 3, 5, 7, 9], 5)
    (2, 2)
    
    >>> binary_search([1, 3, 5, 7, 9], 10)
    (None, 3)
    """
    low = 0
    high = len(my_list) - 1
    steps = 0

    while low <= high:
        steps += 1  # Increment the step count
        mid = (low + high) // 2
        guess = my_list[mid]
        if guess == item:
            return mid, steps
        elif guess > item:
            high = mid - 1
        else:
            low = mid + 1

    return None, steps

# Take input for the list
try:
    my_list = list(map(int, input("Enter the numbers separated by spaces: ").split()))
    if not my_list:
        raise ValueError("The list cannot be empty.")
except ValueError as e:
    print(f"Invalid input: {e}")
    exit(1)

# Ensure the list is sorted
my_list.sort()

# Take input for the item to search
try:
    item = int(input("Enter the item to search for: "))
except ValueError:
    print("Invalid input. Please enter an integer.")
    exit(1)

# Perform binary search
result, steps = binary_search(my_list, item)

if result is not None:
    print(f"Value {item} found at index {result}")
else:
    print("Target not found in array.")

# Time Complexity is O(log2(n))
print(f"The number of steps taken is: {steps}")
