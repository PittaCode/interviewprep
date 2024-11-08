# MyArrayList

## Exercise Instructions

The `MyArrayList` class is implemented in a series of incremental steps. 
Each step introduces new functionality to the class. 
Write unit tests for implementing each step to verify that your implementation works correctly.
Try and commit as often as possible workable units of work (test and implementation) or tests and then their implementations.
At the end you should have a list implementation that: 
* has a default capacity of 10
* can have a custom capacity
* can add and store an element
* can set an element in an index
* can remove an element
* and much more

### Step 1: Class Setup and Constructor

- Verify that a new `MyArrayList` has a size of 0.
- Verify that an array of the correct default capacity (10) is created.
- Verify that an array of a custom capacity (e.g., 20) is created if specified.

### Step 2: Adding Elements

- Implement a method `void add(int element)` that adds an element to the end of the list.
- If the array is full, double its capacity before adding the new element.

**Tests**:
- Add a few elements and verify the size increases accordingly.
- Verify that elements are added in the correct order.
- Add more than 10 elements and verify that the array resizes correctly.

### Step 3: Getting Elements

- Implement a method `int get(int index)` that retrieves the element at a specified index.
- Throw an `IndexOutOfBoundsException` if the index is out of range.

**Tests**:
- Add elements, then use `get()` to retrieve them and check they match the added values.
- Attempt to get an element at an out-of-bounds index and verify that an exception is thrown.

### Step 4: Setting Elements

- Implement a method `void set(int index, int element)` that updates the element at the specified index.
- Throw an `IndexOutOfBoundsException` if the index is out of range.

**Tests**:
- Add elements, modify them with `set()`, then check with `get()` to ensure changes were applied.
- Attempt to set an element at an out-of-bounds index and verify that an exception is thrown.

### Step 5: Removing Elements

- Implement a method `void remove(int index)` that removes the element at the specified index.
- Shift all subsequent elements one position to the left to fill the gap.
- Reduce the size by one.

**Tests**:
- Add elements, remove one from the middle, then check the size and content.
- Remove an element from the start and end, and verify the remaining list.
- Attempt to remove an element at an out-of-bounds index and verify that an exception is thrown.

### Step 6: Clearing the List

- Implement a method `void clear()` that removes all elements from the list.
- Reset the size to 0 but keep the array at its current capacity.

**Tests**:
- Add elements, call `clear()`, and verify the size is 0.
- Check that capacity remains unchanged after `clear()`.

### Step 7: Checking List Size

- Implement a method `int size()` that returns the current number of elements in the list.

**Tests**:
- Add and remove elements, using `size()` to verify the list size at each step.

### Step 8 (Optional): Ensuring Capacity

- Implement a method `void ensureCapacity(int minCapacity)` that increases the array size to at least the specified minimum capacity.

**Tests**:
- Use `ensureCapacity()` to increase capacity, add elements, and verify the capacity has been increased.