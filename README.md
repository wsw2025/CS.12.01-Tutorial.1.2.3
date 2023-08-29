# CS.12.01-Tutorial.1.2.3

This question involves reasoning about strings made up of uppercase letters. You will implement two related methods that appear in the same class (not shown). The first method takes a single string parameter and returns a scrambled version of that string. The second method takes a list of strings and modifies the list by scrambling each entry in the list. Any entry that cannot be scrambled is removed from the list.

a) Write the method scrambleWord, which takes a given word and returns a string that contains a scrambled version of the word according to the following rules.

* The scrambling process begins at the first letter of the word and continues from left to right.
* If two consecutive letters consist of an “A” followed by a letter that is not an “A”, then the two letters are swapped in the resulting string.
* Once the letters in two adjacent positions have been swapped, neither of those two positions can be involved in a future swap.

The following table shows several examples of words and their scrambled versions.

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.3/assets/57818506/fe1899b7-0278-4e21-9c33-fba0be7aa313)

b) Write the method scrambleOrRemove, which replaces each word in the parameter wordList with its scrambled version and removes any words that are unchanged after scrambling. The relative ordering of the entries in wordList remains the same as before the call to scrambleOrRemove.

The following example shows how the contents of wordList would be modified as a result of calling scrambleOrRemove.

Before the call to scrambleOrRemove:

wordList

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.3/assets/57818506/a438d38a-ec4b-4387-90c8-31497a0ff059)

After the call to scrambleOrRemove:

wordList

![image](https://github.com/techarenz/CS.12.01-Tutorial.1.2.3/assets/57818506/c4657dcd-c4b7-4b19-bae9-6b293ab911c0)

Implement both methods inside a class called Scramble. Declare each method as static. Your implementation must pass all of the tests in the ScrambleTest class (provided). 
