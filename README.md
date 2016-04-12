# Write Java code for each of the following Scribble scripts:

## Q1 (1 mark) – Selection Sort

Write equivalent Java code to perform the same function as the presented Scribble code. Test your code to make sure it’s sorting correctly.

Notes:

* Use a Java array not an ArrayList
* Scribble array indexes are 1-based, Java array indexes are 0-based.
* Write a method in addition to main called displayArray(...). It should take a single parameter with type array of integer. It should display the elements of the passed array to the console on a single line. Elements should be comma separated. There should be no trailing comma after the last element. An example output appears below. This method
should be called to display the array before and after sorting.

'''
Size of array to sort?
20
75, 61, 24, 39, 82, 84, 24, 76, 24, 78, 62, 46, 75, 100, 87, 91, 92, 46, 70, 10
10, 24, 24, 24, 39, 46, 46, 61, 62, 70, 75, 75, 76, 78, 82, 84, 87, 91, 92, 100
'''

The ask block assigns the input it collects to the answer variable automatically in Scribble.

Since Java is not “live” the initial clearing of the array is unnecessary.

The second and third ask blocks are just for tracing.

Only include equivalent Java statements if you need to debug.

The final say block is redundant in the Java version since the sorted array is displayed (or not!)

## Q2 (1 mark) – Linear Search

Write equivalent Java code to perform the same function as the presented Scribble code. Test your code to make sure it’s searching correctly in both the found and not found case. Also test to find the first element and the last element and a normal element. You will need to trace the array before you search to do these tests. Use the debugger. Your tutor will expect you demonstrate your use of the debugger to perform these tests.

Notes:

* Scribble array indexes are 1-based, Java array indexes are 0-based.
* Use a Java array not an ArrayList.
* Be very careful with the search loops condition.
* If the compiler complains one of your variables may not have been initialised just initialise to a safe value in its declaration.

The ask block assigns the input it collects to the answer variable automatically in Scribble.

Since Java is not “live” the initial clearing of the array is unnecessary.

## Q3 (1 mark) Code a Java method that accepts a String array and a String.

The method should return true if the string can be found as an element of the array and false otherwise. Test your method by calling it from the main method which supplies its two parameters (no user input required). Use an array initialiser
list to initialise the array you pass. Test thoroughly.

Notes:

* Your method should be private and static (explanations soon).
* Do not use the == operator to compare the contents of Strings (it compares their addresses).

## Q4 (1 mark) Code a Java method that accepts an ArrayList of integers and an integer.

The method should delete all elements in the array list exactly divisible by the integer and return the number of remaining elements. e.g. if the calling, main method supplies an ArrayList of integers with elements 1, 2, 3, ... , 100 and an integer of three your method should return the number of remaining elements i.e. the number of elements not divisible by three. It’s 67 by the way.

Notes

* Call your method from main and test thoroughly with small arrays.
* Expect problems – think about what happens to the indexes of other elements when an element is removed
* For those that already know Java I do not want you to use an iterator

