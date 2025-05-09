# Practice map() and currying() function
def map_demonstrate(nums):
    nums = list(map(lambda x: x%5, nums))
    print(nums)
    # Map applies function to each element of iterable
    # and creates a list of the results.

def filter_demonstrate(nums):
    nums = list(filter(lambda x: x!=0, nums))
    print(nums)
    # Applies func to each element of iterable
    # If func returns true, that element is put in the list

def zip_demonstrate(names, ages):
    combined = zip(names, ages)
    print(list(combined))
    # Combine multiple iterables (like lists or tuples)
    # into a single iterable of tuples

# Currying: breaking down the evaluation of a function
# that takes multiple arguments
# into evaluating a sequence of single-argument functions.
def f(a1, a2, a3):
    return a1 * a2 * a3
def f1(a1):
    def f2(a2):
        def f3(a3):
            return f(a1, a2, a3)
        return f3
    return f2

if __name__ == '__main__':
    print("Hello")
    nums = [0, 4, 7, 2, 1, 0, 9, 3, 5, 6, 8, 0, 3]
    map_demonstrate(nums)
    filter_demonstrate(nums)
    names = ["Alice", "Bob", "Charlie"]
    ages = [25, 30, 35]
    zip_demonstrate(names, ages)

    for i in range(1, 10):
        print(f(i, i + 1, i + 2), f1(i)(i + 1)(i + 2))  # What is the output?