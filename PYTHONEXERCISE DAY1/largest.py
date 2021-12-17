num1 = int(input('enter the first value'))
num2 = int(input('enter second value'))
num3 = int(input('enter third number'))
def big(num1,num2,num3):
    if (num1 > num2) and (num1 > num3):
        bigger = num1
    elif (num2 > num1) and (num2 > num3):
        bigger = num2
    else:
        bigger = num3
    return bigger
print(big(num1,num2,num3))
