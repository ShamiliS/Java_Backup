def computeSnowpack(arr):
    # Todo: Implement computeSnowpack
    return 0


def doTestsPass():
    """ Returns True if all tests pass. Otherwise returns False. """
    tests = [[[0, 1, 3, 0, 1, 2, 0, 4, 2, 0, 3, 0], 13]]

    for test in tests:
        if not (computeSnowpack(test[0]) == test[1]):
            return False
    return True


if __name__ == "__main__":
    if(doTestsPass()):
        print("All tests pass")
    else:
        print("Not all tests pass")
