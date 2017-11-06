# FileRW

## Introduction
FileRW is a simple straightforward Java API allowing you to read and write data to a .txt (or any other) file. Currently used as a dummy API for a Swing application in test.

Because I am lazy and I hate having to repeatedly write specialty functions and niche blocks of code, this is one of many simple general APIs to save me the time of having to do that

## How to use
Good coding practice will tell you to export this into a .jar file. However, because this is currently built for a Swing application I am currently working on, I advise you to simply download this source code and import add it to your project folder.

### Warning
##### Because this is intended for a Swing application I am currently testing, the write function is catered to the application, which is why I advise you to download this source code so that you can edit the parameters and implementation to your own liking.

### readData(String file)
This function will simply read your file and print it to your console, line for line. The current paramter assumes you have a `res` folder to read the file from, but again, you may change that to your liking.

### writeData(String file, String brand, String model, int year, String owner)
This function will write a line data to your file in the format of `brand,model,year,owner`, and then create a new line. Again, you may change this to your liking.
