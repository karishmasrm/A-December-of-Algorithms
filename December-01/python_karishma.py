def binary_sort(sorted_list, length, key):
    start = 0
    end = length-1
    while start <= end:
        mid = int((start + end)/2)
        if key == sorted_list[mid]:
            print("\nGuess %d (half of %d to %d) → spot on!" % (key,lst[start],lst[end]))
            return -1
        elif key < sorted_list[mid]:
            print("Guess %d (half of %d to %d) → you’re too high."%(key,lst[start],lst[end]))
            end = mid - 1
        elif key > sorted_list[mid]:
            print("Guess %d (half of %d to %d) → you’re too low." %(key,lst[start],lst[end]))
            start = mid + 1
    print("\nElement not found!")
    return -1
 
lst = []
 
size = int(input("Enter size of list: \t"))
 
for n in range(size):
    numbers = int(input("Enter any number: \t"))
    lst.append(numbers)
    lst.sort()
print('\n\nThe list will be sorted, the sorted list is:', lst)
 
x = int(input("\nEnter the number to search: "))
 
binary_sort(lst, size, x)
