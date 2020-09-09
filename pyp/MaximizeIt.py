from itertools import *

k,m = map(int,input().split())
res = 0

l = list(map(int,input().split()[1:]) for _ in range(k))
res = map(lambda l: sum(i*i for i in l)%m,product(*l))

print(max(res))

