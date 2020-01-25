# Android Manifest

The manifest presents essential imformation about your application to the android build tools, android operating systems and google Play


#  Android Activity

Android Activity is a represent single screen which your user can perform task Through UI controler.

An app usally consists of multiple screen that are loosely bound to each other. each screen is an activity. Typically, one activity in an app is specified as the main Activity.
Each time a new activity start. Activity have callback function which is represent Activity screen state.
1. onCreate();
2. onStart();
3. onResume();
4. onPuse();
5. onStop();
6. onDestroy();

Intent:
An activity is started or Activated with an Intent. Intent is asynchronus message which is you can use in your Activity an action perform from amother activity or from some other app component.
An Intent can be explicit and implicit:
