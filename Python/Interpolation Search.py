"""
Interpolation Search is a searching algorithm used to find an element in a sorted array.
It estimates where the element might be based on the values around it, rather than just splitting the array in half.
Efficiency:
Best case: O (log (log (N) ))
Worst case: O (N)) .. (if the data is not uniformly distributed)
"""
def interpolation_search(arr, x):
    low = 0
    high = len(arr) - 1

    while low <= high and x >= arr[low] and x <= arr[high]:
        pos = low + ((high - low) // (arr[high] - arr[low]) * (x - arr[low]))

        if arr[pos] == x:
            return pos
        if arr[pos] < x:
            low = pos + 1
        else:
            high = pos - 1

    return -1  

arr = [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]
x = 70

result = interpolation_search(arr, x)
if result != -1:
    print(f"Element found at index: {result}")
else:
    print("Element not found in the array.")
