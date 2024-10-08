#import <React/RCTEventDispatcher.h>

#ifdef RCT_NEW_ARCH_ENABLED

#import "RNCalendarEventsSpec.h"
@interface RNCalendarEvents : NSObject <NativeRNCalendarEventsSpec>
@end

#else

#import <React/RCTBridgeModule.h>
@interface RNCalendarEvents : NSObject <RCTBridgeModule>
@end

#endif
