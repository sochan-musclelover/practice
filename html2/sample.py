class SamplePython:
    def main(self):
        output = ""
        for num in range(0, 15, 1):
            output = SamplePython.outputFromJudgeNum(num)
            print("No." + str(num) + " is:" + output)
    def outputFromJudgeNum(num):    
        if num % 15 == 0:
            return "FizzBuzz"
        elif num % 5 == 0:
            return "Fizz"
        elif num % 3 == 0:
            return "Buzz"
        else :
            return "not Fizz and Buzz"
        
sample = SamplePython()
sample.main()