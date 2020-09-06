if __name__ == '__main__':
    N = int(input())
    list = []

    for _ in range(N):
        arg = input().split()
        if (arg[0] != 'print'):
            eval('list.'+arg[0]+'('+','.join(arg[1:])+")")
        else:
            print(list)

