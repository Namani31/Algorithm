chess = [1, 1, 2, 2, 2, 8] # 정해진 말의 수

input = list(map(int, input().split()))

"""
.split(): 입력된 문자열을 공백을 기준으로 분리하여 "문자열"의 리스트 생성
["0", "1, "2, "3"...]

map(int, ...): 리스트의 각 요소를 정수형으로 변환
[0, 1, 2, 3, ...]

list(...): map 객체를 리스트로 변환
최종적으로 `map(int, input().split))`의 결과는 정수 리스트가 된다.
list로 감싸서 리스트로 변환한다.
"""

for check in range(len(chess)):
    print(chess[check] - input[check], end = ' ')
"""
for check in range(len(chess)): 0부터 len(chess) - 1까지 반복한다.
예를 들어 chess의 길이가 6이라면,  `range(len(chess))는 [0, 1, 2, 3, 4, 5] 가 된다.

chess[check] - input[check]: check 리스트와 input 리스트이 동일한 인덱스 위치의 요소를 뺄셈한다.
chess[0] - input[0] 과 같이.

end = ' '는 출력이 끝난 후 공백을 추가한다는 뜻이다.
"""