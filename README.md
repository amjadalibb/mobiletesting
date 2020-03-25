### Assignment to test Signup, Login, Logout functionality of Native Android App

+ Android App: Plus500
+ Android Platform Version: 6.0.1

#### Pre-requesit:

+ Java SDK – 1.8
```
java -version
```
+ Install brew
```
/usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```
+ Install Appium
```
npm install -g appiuim
```
+ Install Carthage
```
brew install carthage
```
+ Install wd
```
npm install wd
```
+ Install webpack
```
npm i webpack
```
+ Install lilimobiledevice
```
brew install libimobiledevice
```
+ Install vysor app to see connected devices
	+ https://vysor.io/
+ Install adb with below command
```
brew cask install android-platform-tools
```
+ Install Android Studio
	+ Download from https://developer.android.com/studio
+ Make sure below ENV Vars are setup in 
```
~/.bash_profile
PATH=$PATH:$ANDROID_HOME
PATH=$PATH:$ANDROID_HOME/build-tools
PATH=$PATH:$ANDROID_HOME/platform-tools
PATH=$PATH:$ANDROID_HOME/tools
export PATH=$ANDROID_HOME/emulator:$ANDROID_HOME/tools:$ANDROID_HOME/tools/bin:$ANDROID_HOME/platform-tools:$PATH
export JAVA_HOME=$(/usr/libexec/java_home)
export PATH=${JAVA_HOME}/bin:$PATH
```
+ Install Appium Doctor and run in terminal to make sure all is proper
```
npm install appium-doctor
appium-doctor
```

#### How it works

+ Connect device via USB cable and run below command to see device connected
```
adb devices
```
+ Run Appium Service
	+ Run it from desktop client or service
+ Open solution in Eclipse or IntelliJ
+ Update device configuration
	+ Navigate to src/test/java/
	+ Open tests.BaseClass.java
	+ Update below accordingly
```
PLATFORM_NAME, PLATFORM_VERSION, DEVICE_NAME, UDID, appPackage, appActivity
``

#### How to run

+ Open the solution in Eclipse or IntelliJ
+ Right click -> *testng-with-report.xml* -> Run as -> TestNG Suite

#### Contact Me

+ You can contact me for any questions on Amjad Ali (amjadali_bb@hotmail.com)
