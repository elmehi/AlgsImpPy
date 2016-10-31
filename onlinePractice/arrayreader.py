def counter(nums):
    x = 1
    for n in nums:
        print("n =", n, " x= ", x)
        if n == x:
            if x == 3: return True
            x += 1
        else: 
            x = 1
            if n == 1: x = 2
    return False


def last2(str):
    x = str[-2:]
    print(x)
    counter = 0
    for i in range(len(str)-2):
        if str[i:i+2] == x: counter +=1
        print(str[i:i+2])
    return counter


    
