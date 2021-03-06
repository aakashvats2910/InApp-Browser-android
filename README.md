# InApp-Browser-android
This project is an open source project to add the functionality of the Browser in you Android app.
# Why to use this?
Since many of the app developers want to retain their users inside their application only also if they are doing some work based on web activities.
So, in order to overcome the complexity of making a Self web-browser or going to another web browser for web-based work you can use this dependency of InApp-Android-Browser

# Implementation

[![Generic badge](https://img.shields.io/badge/Jitpack-v0.1-green.svg)](https://shields.io/)

<h3>The implementation of this dependency must take place like this:</h3>


```gradle
implementation 'com.github.aakashvats2910:InApp-Browser-android:0.1'
```

<h3>You can call or open the Browser by simply:</h3>

```
LocalBrowser.setUrl(context, url)
  .setUrlViewVisibility(boolean)
  .start();
```

<h4>Different situations for Url Visibility</h4>

If the value is true:

![If it is set to true](https://i.ibb.co/02mYhNd/url-Visibility-View-True.png)

If the value is false:

![if value is false](https://i.ibb.co/T15PNTk/url-Set-To-False.png)

[![Maintenance](https://img.shields.io/badge/Maintained%3F-yes-green.svg)](https://GitHub.com/Naereen/StrapDown.js/graphs/commit-activity)

<b><h3>More functionalities coming soon 😉</h3></b>

# Developer Info

[![Ask Me Anything !](https://img.shields.io/badge/Ask%20me-anything-1abc9c.svg)](https://GitHub.com/Naereen/ama)

The dependency is made by me. For any query please feel free to contact to my email: aakashvats2910@gmail.com
