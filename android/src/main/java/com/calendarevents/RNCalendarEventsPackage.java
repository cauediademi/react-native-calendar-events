package com.calendarevents;

import androidx.annotation.Nullable;

import com.facebook.react.TurboReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.module.model.ReactModuleInfo;
import com.facebook.react.module.model.ReactModuleInfoProvider;

import java.util.HashMap;
import java.util.Map;

public class RNCalendarEventsPackage extends TurboReactPackage {

  @Nullable
  @Override
  public NativeModule getModule(String name, ReactApplicationContext reactContext) {
    if (name.equals(RNCalendarEventsModuleImpl.NAME)) {
      return new RNCalendarEventsModule(reactContext);
    } else {
      return null;
    }
  }

  @Override
  public ReactModuleInfoProvider getReactModuleInfoProvider() {
    return () -> {
      final Map<String, ReactModuleInfo> moduleInfos = new HashMap<>();
      boolean isTurboModule = BuildConfig.IS_NEW_ARCHITECTURE_ENABLED;

      ReactModuleInfo moduleInfo = new ReactModuleInfo(
        RNCalendarEventsModuleImpl.NAME,
        RNCalendarEventsModuleImpl.NAME,
        false,
        false,
        true,
        false,
        isTurboModule
      );

      moduleInfos.put(RNCalendarEventsModuleImpl.NAME, moduleInfo);
      return moduleInfos;
    };
  }
}
