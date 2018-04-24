cnt1 = 0
j = 0
cnt2 = 0
start = 0
end = 0


def longest_uniform_substring(input):
    # todo: implement this function
    global cnt1, cnt2, j
    for i in range(len(input) - 1):
        if(input[i] == input[i + 1]):
            cnt1 = cnt1 + 1
        else:
            if(cnt2 < cnt1):
                output = input[i]
                cnt2 = cnt1
                cnt1 = 0
    
    start = start = input.find(output)
    end = end = input.count(output)
    return(start, end)


def do_tests_pass():
    """Returns True if the test passes. Otherwise returns False."""

    # todo: implement more tests
    test_cases = {
        "": (-1, 0),
        "10000111": (1, 4),
        "aabbbbbCdAA": (2, 5)
    }
    
    passed = True
    for input, result in test_cases.items():
        print(input , " ", result)
        if(input != ""):
            start, length = longest_uniform_substring(input)
            print(start , " " , length)
            passed = passed and start == result[0] and length == result[1]
    
    return passed

        
if __name__ == "__main__":
    if do_tests_pass():
        print("All tests pass!")
    else:
        print("At least one failure!")
