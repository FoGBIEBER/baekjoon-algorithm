testNum = int(input())
for i in range(testNum):
    scores = list(map(int, input().split()))
    sum = 0
    count = 0
    scoresNum = scores[0]
    for j in range(1, scoresNum + 1):
        sum += scores[j]
    avg = sum / scoresNum
    for k in range(1, scoresNum + 1):
        if scores[k] > avg:
            count += 1
    print(f"{(count / scoresNum * 100):.3f}%")
