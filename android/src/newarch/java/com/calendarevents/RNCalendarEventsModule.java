package com.calendarevents;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.modules.core.PermissionListener;

public class RNCalendarEventsModule extends NativeRNCalendarEventsSpec implements PermissionListener {

    final RNCalendarEventsModuleImpl calendarEventsModuleImpl;

    RNCalendarEventsModule(ReactApplicationContext reactContext) {
        super(reactContext);
        calendarEventsModuleImpl = new RNCalendarEventsModuleImpl(context);
    }

    @Override
    @NonNull
    public String getName() {
        return RNCalendarEventsModuleImpl.NAME;
    }

    @Override
    public void checkPermissions(boolean limited, Promise promise) {
        calendarEventsModuleImpl.checkPermissions(limited, promise);
    }

    @Override
    public void getCalendars(final Promise promise) {
        calendarEventsModuleImpl.getCalendars(promise);
    }

    @Override
    public void getEventById(final String eventID, final Promise promise) {
        calendarEventsModuleImpl.getEventById(eventID, promise);
    }

    @Override
    public void getEvents(final Dynamic startDate, final Dynamic endDate, final ReadableArray calendars,
            final Promise promise) {
        calendarEventsModuleImpl.getEvents(startDate, endDate, calendars, promise);
    }

    @Override
    public void openEventInCalendar(int eventID, final Promise promise) {
        calendarEventsModuleImpl.openEventInCalendar(eventID, promise);
    }

    @Override
    public void removeCalendar(final String calendarID, final Promise promise) {
        calendarEventsModuleImpl.removeCalendar(calendarID, promise);
    }

    @Override
    public void removeEvent(final String eventID, final ReadableMap options, final Promise promise) {
        calendarEventsModuleImpl.removeEvent(eventID, options, promise);
    }

    @Override
    public void requestPermissions(boolean limited, Promise promise) {
        calendarEventsModuleImpl.requestPermissions(limited, promise);
    }

    @Override
    public void saveCalendar(final ReadableMap options, final Promise promise) {
        calendarEventsModuleImpl.saveCalendar(options, promise);
    }

    @Override
    public void saveEvent(final String title, final ReadableMap details, final ReadableMap options,
            final Promise promise) {
        calendarEventsModuleImpl.saveEvent(title, details, options, promise);
    }

    @Override
    public void uriForCalendar(Promise promise) {
        calendarEventsModuleImpl.uriForCalendar(promise);
    }
}
