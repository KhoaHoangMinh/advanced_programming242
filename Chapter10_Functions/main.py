from functools import reduce

# Practice lambda functions

# Function to add two numbers
def add(x, y):
    return x + y

# Accomplish the following function to find the max of an array:
def maxArrOneline(lst):
    return reduce(max, lst)

# Press the green button in the gutter to run the script.
if __name__ == '__main__':
    f1 = lambda x: x + 2
    f2 = (lambda x: 2 * x - 4) (5)
    f3 = (lambda x: (lambda y: x + 4 * y))(5)(2)
    f4 = (lambda x: lambda y: x + 4 * y)(5)(2)
    f5 = (lambda x: lambda y: x)(5)(2)
    f6 = (lambda x: (lambda y: x + 4 * y))((lambda z: z * z )(4))(2)

    f7_1 = lambda x: x(2)
    f7_2 = lambda z: z + 1
    f7 = f7_1(f7_2)
    print("f7 = ", f7)

    f8 = (lambda x: lambda y: 2 * y + 3 * x)(7)

    f9_1 = lambda x: x(2)
    f9_2 = (lambda y : lambda z: 2 * y + 3 * z)(7)
    f9 = f9_1(f9_2)

    # Understand reduce function
    #  Applies a particular function passed in its argument
    #  to all of the list elements
    a = [1, 2, 3, 4, 5]
    res = reduce(add, a)
    # reduce() applies add() cummulatively to the elements in numbers
    # 1 + 2 = 3
    # 3 + 3 = 6
    # ...
    print(res)   # Output = 15

    print(maxArrOneline(a))


