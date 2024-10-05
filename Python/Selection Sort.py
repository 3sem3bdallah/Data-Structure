def findSmallest(arr):
    """
    Find the index of the smallest element in a list.

    Parameters:
    arr (List[int]): The list of integers where the smallest element is to be found.

    Returns:
    int: The index of the smallest element in the list.

    Example:
    >>> findSmallest([3, 1, 4, 1, 5])
    1
    """
    smallest = arr[0]
    smallest_index = 0

    for i in range(1, len(arr)):
        if arr[i] < smallest:
            smallest = arr[i]
            smallest_index = i
    return smallest_index

def selectionSort(arr):
    """
    Perform a selection sort on a list of integers and count the number of steps.

    Parameters:
    arr (List[int]): The list of integers to be sorted.

    Returns:
    Tuple[List[int], int]: A tuple where the first element is the sorted list,
                            and the second element is the number of steps taken
                            to complete the sort (where each step is a pass through
                            the list to find the smallest element).

    Example:
    >>> selectionSort([64, 25, 12, 22, 11])
    ([11, 12, 22, 25, 64], 5)

    >>> selectionSort([5, 4, 3, 2, 1])
    ([1, 2, 3, 4, 5], 5)
    """
    newArr = []
    steps = 0
    while arr:
        smallest_index = findSmallest(arr)
        newArr.append(arr.pop(smallest_index))
        steps += 1
    return newArr, steps

# Take input for the list
try:
    arr = list(map(int, input("Enter the numbers separated by spaces: ").split()))
    if not arr:
        raise ValueError("The list cannot be empty.")
except ValueError as e:
    print(f"Invalid input: {e}")
    exit(1)

# Perform selection sort
sorted_arr, steps = selectionSort(arr)

print(f"Sorted array: {sorted_arr}")
print(f"The number of steps taken is: {steps}")
