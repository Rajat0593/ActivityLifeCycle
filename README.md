# ActivityLifeCycle
Showing the Activity lifecycle methods using two simple Activities in the Log Details.

When the Activity is launched first time on the screen the following three methods are called:
onCreate()
onStart()
onResume()

When the back button is pressed/touched, the activity is destroyed and the following methods are called
onPause()
onStop()
onDestroy()

When the home button is pressed/touched, the activity is in suspended state so
onPause()
onStop()
and when it is called foreground the following methods are executed
onRestart()
onStart()
onResume()

For proper output details for this project you have to do the following:
1) goto Logcat at the bottom of your android Studio

2) Select EditFilterConfiguration from the right most drop down menu

3)on the Create New Filter Dialog box, Select the first option 
i.e. Filter Name and replace it with the any name of your choice Ex: FilterName

4) Select the LogTag as FirstActivity or SecondActivity for the respective Activities 

5)At last Choose the Log level as :Debug (You can choose anything you want based on your needs but, 
Since we are using Log.d in our program so you have to call the same)

6)Select the filters and run the project

Happy Coding :)
