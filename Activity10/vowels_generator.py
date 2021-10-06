def is_vowel(letter):
    return letter.lower() in ['a','e','i','o','u']

def vowels(word):
    for i in range(0, len(word)):
        if is_vowel(word[i]):
            yield word[i]

for v in vowels('Joanna Cecilia da Silva Santos'):
    print(v)

# iterator = vowels('Joanna Cecilia da Silva Santos')
# print(iterator.__next__())
# print(iterator.__next__())