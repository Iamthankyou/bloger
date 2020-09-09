# Enter your code here. Read input from STDIN. Print output to STDOUT
from itertools import *
n = int(input())
l = input().split()
m = int(input())

comb = list(combinations(l,m))
p = filter(lambda comb: 'a' in comb,comb)

print(len(list(p))/len(comb))

