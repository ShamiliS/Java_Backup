'''
Created on 9 Apr 2018

@author: SHSRINIV
'''


def KelvinToFahrenheit(temp):
    result = 0
    try:
        assert(temp > 0), "Colder than absolute zero!"
    except  AssertionError:
        print("AssertionError: Error in the input", temp)
    except TypeError:
        print(TypeError)
    else:
        result = ((temp - 273) * 1.8) + 32
        print("")
    return result


print(KelvinToFahrenheit(0))
print(KelvinToFahrenheit("test"))
print(KelvinToFahrenheit(273))
