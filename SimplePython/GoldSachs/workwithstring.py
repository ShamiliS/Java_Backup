
cnt1 = 0
j = 0
cnt2 = 0
start = 0


def validation(input):
    global cnt1, cnt2, j
    for i in range(len(input) - 1):
        if(input[i] == input[i + 1]):
            cnt1 = cnt1 + 1
        else:
            if(cnt2 < cnt1):
                output = input[i]
                cnt2 = cnt1
                cnt1 = 0
    
    print(cnt2+1)
    return(output)


input = "10000111"

output = validation(input)
start = input.find(output)
print("Start position:", start)
end = input.count(output)
print("End Position:", end)

