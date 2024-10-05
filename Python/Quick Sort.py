def quicksort(arr):
    """
    Perform quicksort on a list of integers.

    Parameters:
    arr (List[int]): The list of integers to be sorted.

    Returns:
    List[int]: A new list containing all integers from the input list, sorted in ascending order.

     Example:
    >>> quicksort([3, 6, 8, 10, 1, 2, 1])
    [1, 1, 2, 3, 6, 8, 10]
    """
    if len(arr) < 2:
        return arr  # Base case: lists with 0 or 1 elements are already sorted
    else:
        pivot = arr[0]  # Choose the pivot
        less = [i for i in arr[1:] if i <= pivot]  # Elements less than or equal to pivot
        greater = [i for i in arr[1:] if i > pivot]  # Elements greater than pivot

    return quicksort(less) + [pivot] + quicksort(greater)

# Take input for the list
try:
    arr = list(map(int, input("Enter the numbers separated by spaces to sort: ").split()))
    if not arr:
        raise ValueError("The list cannot be empty.")
except ValueError as e:
    print(f"Invalid input: {e}")
    exit(1)

# Perform quicksort
sorted_arr = quicksort(arr)

print(f"Sorted list: {sorted_arr}")
