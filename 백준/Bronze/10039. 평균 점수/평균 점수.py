# 합계 초기화
sum = 0

# 5번 반복
for index in range(5):
    score = int(input())
    if score < 40:
        score = 40
    sum += score
    
average = int(sum / 5)
print(average)
    