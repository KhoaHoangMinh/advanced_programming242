
def print_hi(name):
    # Use a breakpoint in the code line below to debug your script.
    print(f'Hi, {name}')  # Press Ctrl+F8 to toggle the breakpoint.

# Extract all even numbers from a given list.
def filter_even(numbers):
    new_list = [num for num in numbers if num % 2 == 0]
    return new_list

# Given a list of words and an integer n,
# return only the words that have exactly n characters.
def filter_by_length(words, n):
    new_list = []
    for word in words:
        if len(word) == n:
            new_list.append(word)
    return new_list
    # return [ word for word in words if len(word) == n]

# Give a word and a list of words and
# return a list of all words that are anagrams of the given word.
def find_anagrams(word, words):
    sorted_word = sorted(word)
    return [word for word in words if sorted(word) == sorted_word]

if __name__ == '__main__':
    print('Exercise 1:')
    print(filter_even([1, 2, 3]))
    print(filter_even([0, 1, 2]))
    print(filter_even([1]))

    print('Exercise 2:')
    print(filter_by_length(["apple", "banana", "pear", "kiwi", "peach"], 5))
    print(filter_by_length(["dog", "cat", "fish", "bird"], 6))
    print(filter_by_length(["one", "two", "six"], 3))

    print('Exercise 3:')
    print(find_anagrams("listen", ["enlist", "google", "inlets", "banana"]))
    print(find_anagrams("hello", ["world", "python", "code"]))
    print(find_anagrams("race", ["care", "car", "acer", "racecar"]))
