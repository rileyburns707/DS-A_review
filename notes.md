# My Notes on Java Tutorial

## Key Concepts

- **Classes** and *objects*
- Methods and variables

### Sample Code

```java
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, Markdown!");
    }
}
```

# Notes
The review I am following is in java, I will do all interviews/interview prep in java. I liked this teacher and figured in woudln't hurt to get a little practice using java again

# Overview
### Data Structures
Data structure = a named location that can be used to store and organize data
  * Example 1: A family tree
    * A family tree is a hierarchy of family relationships. We need some way to organize that data. A *tree* is a data structure that can be used
  * Example 2: array
    * An array is a collection of elements stored at contiguous memory locations. We have experience with these from the reviewing python course.

Different data structures have their own way to store and organize data. They each have their own pros and cons. 

### Algorithms
Algorithim = a collection of steps to solve a problem
  * The steps to a solution
  * Example 1: Baking a pizza
    * An algorithim to baking a pizza can be:
      1. Heat the oven
      2. Knead the dough
      3. Add toppings
      4. etc.
  * Example 2: linear search
    * Linear search is a type of algorithm. If you have an array of elements, a linear search would one by one, examine the elements to find a value
    * A linear search is an example of a searching algorithm

### Why learn DS&A?
* You'll write code that is both time and memory efficient
* Commonly asked questions in interviews involve DS&A
    * Ex: reversing a doubly linked list

# Stacks
Stack = **LIFO data structure. Last-In First-Out**
  * Allows you to store objects into a sort of "vertical tower"
  * push() to add to the top
  * pop() removes objects from the top

Stacks have 5 unique methods
1. .push()
    * Pushes an item to the top of the stack
2. .pop()
    * pops item form top
    * returns the object you pop
3. .peek()
    * View item at the top
4. .empty()
    * View if stack is empty
    * Returns a boolean
5. search()
    * Searches for an item
    * returns position
        * first item has a position of 1
            * remember LIFO structure
        * returns -1 if item is not in stack

Stacks can run out of memory
*  "OutOfMemoryError: Java heap space"


## Uses of Stacks
1. undo/redo features in text editors
2. Moving back/forward through a broswer history
3. Backtracking algorithms (maze, file directories)
4. Calling functions (call stack)




# Queues
Queue = **FIFO data structure. First-In First-Out**
* Ex. a line of people
* A queue is a collection designed for holding elements prior to processing
* Linear data structure
* Concepts of adding/removing
    * Add: Enqueue - add() or offer() 
    * Remove: Dequeue - remove() or poll()

2 classes that implement the queue interface
1. LinkedList
    * Using this because it is better for learning. So we will only cover the features that linked lists use via the queue interface
2. PriorityQueue

Queues have 3 unique methods
1. .offer()
    * add to queue (enqueue)
    * aka: .add()
        * .add() will through an exception
2. .poll()  
    * remove from queue (dequeue)
    * aka: .remove()
    * .poll() will not through an exception if queue is empty
        * .remove() will through an exception
        * offer poll and peak
3. .peek()
    * view item from queue
    * aka: .element()
        * .elememt() will through an exception

Oher useful methods
* .isEmpty()
    * returns boolean
* .size()
    * returns the size of the queue
* .contains()
    * returns boolean
    * can check to see if a specific item is in the queue

## Uses of Queues
1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
2. Printer Queue
3. Usined in LinkedLists, PriorityQueues, Breadth-first search



# PriorityQueues
Priority Queue = A **FIFO data structure** that serves elements with the highest priorities first. Before elements with lower priority

Uses the same unique methods as a queue described above 
1. .offer()
2. .poll()
3. .peek()

## Uses of Priority Queues
1. Ordering times in a race
2. Hospital patient triage systems where critical patients are seen before less urgent ones
3. Network packet handling critical data (like video calls) gets sent before regular traffic

# ⭐️ArrayLists v LinkedLists Intro⭐️
## Array Lists
* Arrays are great at randomly accessing elements because they have an index, but not so great at inserting and deleting elements. Especially when the elements are close the the beginning of the array
    * If you have a array of 8 elements and want to insert a new elment into index 3, then the current indeces 3-8 have to be shifted to make space
        * Not that big of a deal with 8 elements, but with 1,000,000 elements it is a big deal
    * The same concept applies with deletion. You need to shift indeces back

## Linked Lists
* Linked lists are great at inserting and deleting elements because you just need to change the address and pointer, but not so great at randomly accessing elements. 
* Linked Lists are made up of a long chain of nodes. Each node contained 2 parts.
    1. Data: Some data we need to store
    2. Address (pointer): An address to the next node in line
    * These nodes are noncontigious. They can be anywhere in my computer's memory
    * It's like a scavenger hunt to the end of the linked list. Each node has a clue (address) to where the next node is. 
    * The last node has a address of null
* Inserting & Deleting
    * To insert a new node you make the new node's address the same as the previous node's address, and change the address of the previous node to the new node's data
    * To delete a node you have the previous node point to the next node in line. No shifitng necesary!
    * *These take constant time*, O(1)
* To locate an element we start at the head and work towards the tail until we find the element we are searching for
    * *Locating a node takes linear time*, O(n)
* I am only explaining a singly linked list, meaning there are single links to each node
* A doubly linked list stores 2 address. One for the next node and one for the previous node in the chain
    * Benefit of a doubly linked list is that you can traverse it head to tail and tail to head 
    * Downside is it takes even more memory than a singly linked list 

# LinkedLists
* LinkedList = stores Nodes in 2 parts (data + address)
    * Nodes are in non-consecutive memory locations
    * Elements are linked using pointers
* The LinkedList class stores the memory locations of the first and last nodes
* The LinkedList class implements 4 interfaces
    1. List
    2. Deque
        * Deque = double ended queue
        * Implements 12 additional methods
            * The methods allow you to add, remove, or peek the head/tail
    3. CLoneable
    4. Serializable
* Can treat a LinkedList like a stack or a queue. We can push, pop, and pull

## Advantages
* Dynamic Data Structure (allocates needed amount of while running)
* Insertion and Deletion of Nodes is easy. O(1) - constant time
* No/Low memory waster

## Disadvantages
* Greater memory usage (additional pointer)
* No random access of elements (no index [i])
* Acessing/searching elements is more time consuming. O(n) - linear time

## Uses of LinkedLists
1. Implement Stacks/Queues
2. GPS navigation
    * Each destination is a node
3. Music playlists
    * Songs can be put in order

# Dynamic Array
* Dynamic Array = an array with a resizable capacity
* A.K.A
    1. Java = ArrayList
    2. C++ = Vector
    3. JavaScript = Array
    4. Python: List

## Static Array (side quest)
* Static array has a fixed capacity that we determine at compile time. Normally can't change it later
    * new String[capacity];
* Accessing an element takes O(1) because we have index numbers. The size of the dataset doesn't matter
* Searching for a stored value takes O(n) because we need to iterate through each element until we find the element we want or reach the end
    * Linear time (O(n)) because the larger the data set, the time to finish will increase linerally 
* Inserting/Deleting takes linear time unless done at the end because in that case no shifitng of elements is required. Shifting to add or delete at index 0 takes the longest because then all elements need to be shifted

## Dynamic Array (main quest continued)
* A dynamic array has it's own inner static array with a fixed size. Once the inner static array reaches max capacity, the dynamic array will declare and instantiate a new array with an increased capacity. The size increase of the inner static array varies between 1.5 and 2 depending on the language
    * Growth Factor for each langauge
        * Java ArrayList = 1.5 (3/2)
        * Python PyListObject = -1.125 (n + n >>3)
        * C++ = 1.5 (3/2)
    * new String[capacity *2];
* Once the new inner static array is instantiated we copy the elements onto the new static array. The new static array has different memory addresses than the og array
* If you wish to shrink the capacity you just do the reverse process
* The new inner array has the same methods and pros/cons as a static array

* Use ArrayList class for dynamic arrays
    * Within the class there are a few defined members
        * DEFAULT_CAPACITY = 10;
            * default inital capacity if you do not set one
        * Size
            * Keeps track of how many elements are filled inside the array list

## Advantages 
1. Random access of elements,  O(1) - constant time
    * Thanks to indexing
2. Good locality of reference and data cache utilization
    * Because the memory address are contiguous, they are right next to each other
3. Easy to insert/delete at the end
    * Because no shifting of elements

## Disadvantages
1. Wastes more memory
    * Adds element memory we might not use
2. Shifting elements is time consuming, O(n) - linear time
3. Expanding/Shrinking the array is time consuming, O(n) - linear time
