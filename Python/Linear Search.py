def linear_search(arr, target, steps):
    """
    Perform a linear search for the target value in the given array.
    
    :param arr: List of elements to search through.
    :param target: The element to search for.
    :param steps: A list containing a single integer that tracks the number of steps.
    :return: The index of the target element if found, otherwise -1.
    """
    for index, element in enumerate(arr):
        steps[0] += 1
        if element == target:
            return index
    return -1

def main():
    # Example list input
    my_list = list(map(int, input("Enter list elements separated by spaces: ").split()))
    
    # Target value input
    target_value = int(input("Enter target value: "))
    
    # Time complexity O(N)
    steps = [0]  # Using a list to track the number of steps
    
    # Perform linear search
    index = linear_search(my_list, target_value, steps)
    
    # Display the result
    if index != -1:
        print(f"Element {target_value} found at index: {index}")
    else:
        print(f"Element {target_value} not found in the list.")
    
    # # Time Complexity is O(n)
    print(f"Total steps: {steps[0]}")

if __name__ == "__main__":
    main()
