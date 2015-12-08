#Benchmark - A RTAndroid API usage example
##Description

The Benchmark application is an example for usage of the RTAndroid API.
It allows you to test and compare the performance and capabilities of the RTAndroid platform.
It provides you the possibility to execute benchmarks with different test cases which represent a certain usage configuration of the platform.

Every benchmark consists of a number of cycles each having a calculation and sleep phase.
The number of cycles and both phases can be easily configured.
After running a set of tests, the Benchmark application will provide a you an overview of all core values of the calculation and sleep phase for every test case.

##Android Studio Setup

If you want to compile or modify this application by yourself, you can do this by importing this project into Android Studio.
The following steps require the installation of the Android NDK.

1. Import project
  - Start Android Studio
  - Select "Import Non-Android Studio project"
  - Choose the file "build.gradle" in the application folder (e.g. C:\Projects\Benchmark\build.gradle)
2. Configure Gradle
  - When being asked about using the Gradle wrapper, click Cancel (You can also select Ok if you know what you are doing)
  - Select your local Gradle copy in the Android Studio folder (e.g. C:\Path\to\AndroidStudio\gradle\gradle-2.2.1)
3. Configure NDK
  - Open file "local.properties" in the application folder
  - Add line ndk.dir=C:\Projects\Android\NDK with your corresponding path

##License

Benchmark app is released under the terms of Apache 2.0 License. It uses following third-party libraries:

* Android Support Library
* Google Gson

All of them are released under the Apache 2.0 License.
