def fun(n):
    return lambda x:x+n
f=fun(42)
print(f(0))