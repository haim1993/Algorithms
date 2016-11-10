
def findMax(array):
    max = array[0]
    for i in array:
        if max < i:
            max = i
    return max

array = [1,2,7,3,4,5,6]

print findMax(array)
