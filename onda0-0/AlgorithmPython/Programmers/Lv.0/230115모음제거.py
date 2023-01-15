def solution(my_string):
    char_remov= ['a','e','i','o','u']
    for char in char_remov:
        my_string = my_string.replace(char, '')
    return my_string