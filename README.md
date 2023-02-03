# 2023-DEV2-012

## Run the app
To run this code, you can simply clone the code on your computer and open it with Android Studio. When Android studio has finished to index the code, you can run the app directly on Android studio.

## Run the tests
You have multiple files for tests :

### test folder
+ HoursConversionTest
+ MinutesConversionTest
+ SecondsConversionTest

### androidTest folder
+ UITests

To run tests you can simply open file and click on the green button next to the test or select the file in the configuration section and run the test like you would run the code.

*Note that you need to have device or emulator running to run the UI tests*

## Methodology
Maybe the commits won't show well how I proceed to do this kata, so here is the methodology I used.

+ First, I've started by reading the kata and understanding what it was expected.
+ Then I've created the project and push the initial commit to the repository
+ Once this was done, I've created the view. I generally like to start by this as it help me to have a better vision of how I will acheive the final result, see how I will orginize my code, ...
+ Then I've started to implement the logic, I've started with the row with the `single minutes`. 
  + I've created a first test and then develop the code to sucess the test
  + I've created a second test and adapt the code to sucess the test without breaking the first one
  + And so on until I've covered every cases
+ Then, I've implemented `five minutes`, `single hours`, `five hours` and finally `seconds` with the same methodology
+ After have finished the logic and having every tests succeed, I've started to link the logic to the view with `LiveData`
+ Once the view was linked to the logic, I've started creating some test to test that the view is displayed correctly
