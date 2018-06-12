import os
import fileinput

if os.path.exists("log.txt"):
	os.remove("log.txt")
if os.path.exists("log.xml"):
	os.remove("log.xml")
	

os.system("ant build")


os.system("adb push bin/Checker.jar /data/local/tmp/")	


for line in fileinput.input("testsuites.txt"):
	if len(line.strip()) != 0 :
		exeStr = "adb shell uiautomator runtest Checker.jar -c " + line.strip() + " >>log.txt"
	  	os.system(exeStr)  

os.system("java -jar libs/log-converter.jar log.txt")
os.system("pause")