package com.calendarevents;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.PermissionListener;

import java.util.Map;
import java.util.HashMap;

public class RNCalendarEventsModule extends ReactContextBaseJavaModule implements PermissionListener {

    final RNCalendarEventsModuleImpl calendarEventsModuleImpl;

    RNCalendarEventsModule(ReactApplicationContext context) {
        super(context);
        calendarEventsModuleImpl = new RNCalendarEventsModuleImpl(context);
    }

    @Override
    public String getName() {
        return RNCalendarEventsModuleImpl.NAME;
    }

    @ReactMethod
    public void checkPermissions(boolean limited, Promise promise) {
        calendarEventsModuleImpl.checkPermissions(limited, promise);
    }

    @ReactMethod
    public void getCalendars(final Promise promise) {
        calendarEventsModuleImpl.getCalendars(promise);
    }

    @ReactMethod
    public void getEventById(final String eventID, final Promise promise) {
        calendarEventsModuleImpl.getEventById(eventID, promise);
    }

    @ReactMethod
    public void getEvents(final Dynamic startDate, final Dynamic endDate, final ReadableArray calendars,
            final Promise promise) {
        calendarEventsModuleImpl.getEvents(startDate, endDate, calendars, promise);
    }

    @ReactMethod
    public void openEventInCalendar(int eventID, final Promise promise) {
        calendarEventsModuleImpl.openEventInCalendar(eventID, promise);
    }

    @ReactMethod
    public void removeCalendar(final String calendarID, final Promise promise) {
        calendarEventsModuleImpl.removeCalendar(calendarID, promise);
    }

    @ReactMethod
    public void removeEvent(final String eventID, final ReadableMap options, final Promise promise) {
        calendarEventsModuleImpl.removeEvent(eventID, options, promise);
    }

    @ReactMethod
    public void requestPermissions(boolean limited, Promise promise) {
        calendarEventsModuleImpl.requestPermissions(limited, promise);
    }

    @ReactMethod
    public void saveCalendar(final ReadableMap options, final Promise promise) {
        calendarEventsModuleImpl.saveCalendar(options, promise);
    }

    @ReactMethod
    public void saveEvent(final String title, final ReadableMap details, final ReadableMap options,
            final Promise promise) {
        calendarEventsModuleImpl.saveEvent(title, details, options, promise);
    }

    @ReactMethod
    public void uriForCalendar(Promise promise) {
        calendarEventsModuleImpl.uriForCalendar(promise);
    }
}
