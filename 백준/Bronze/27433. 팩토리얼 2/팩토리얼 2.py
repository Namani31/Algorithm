N = int(input())


if N == 0:
    print(1)
else:
    result = 1
    for index in range(2, N+1):
        result *= index
    print(result)