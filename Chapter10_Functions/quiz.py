from functools import reduce

# Given a list of strings, return a list with each word capitalized
def capitalize_words(words):
    # capitalize must be used thru lambda function
    result = list(map(lambda word: word.capitalize(), words))
    return result

# Given a list of words, return the longest word using reduce.
def longest_word(words):
    result = reduce(lambda longest, current: current if len(current) > len(longest) else longest, words)
    return result

# Given two lists of equal length, return the dot product.
def dot_product(A, B):
    return reduce(lambda x, y: x + y, map(lambda x: x[0] * x[1], zip(A, B)))

def print_Hello():
    print("Khoa")

if __name__ == '__main__':
    print(capitalize_words(['apple', 'banana', 'cherry']))
    print(capitalize_words(['Apple', 'Banana']))
    print(capitalize_words(['DOG', 'CAT', 'BIRD']))

    print(longest_word(["apple"]))
    print(longest_word(["dog", "cat", "bat"]))
    print(longest_word(["hi", "there", "world", "elephant"]))

    print(dot_product([1, 2, 3], [4, 5, 6]))
    print(dot_product([0, 0, 0], [1, 2, 3]))
    print(dot_product([-1, -2, -3], [3, 2, 1]))


