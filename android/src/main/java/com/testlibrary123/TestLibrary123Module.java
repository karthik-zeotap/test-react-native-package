package com.testlibrary123;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.zeotap.collect.Collect;
import com.zeotap.collect.CollectOptions;

@ReactModule(name = TestLibrary123Module.NAME)
public class TestLibrary123Module extends ReactContextBaseJavaModule {
  public static final String NAME = "TestLibrary123";

  public TestLibrary123Module(ReactApplicationContext reactContext) {
    super(reactContext);
  }

  @Override
  @NonNull
  public String getName() {
    return NAME;
  }


  // Example method
  // See https://reactnative.dev/docs/native-modules-android
  @ReactMethod
  public void multiply(double a, double b, Promise promise) {
    promise.resolve(a * b);
  }

  @ReactMethod
  public void initFunction() {
    CollectOptions.Builder builder = CollectOptions.builder(getReactApplicationContext());
    Collect.init(builder.credential("abc").build());
  }

  @ReactMethod
  public void setEvent(String string) {
    Log.d("teest", "called from setEvent inside module");
    Collect.getInstance().setEventProperties(string);
  }
}
