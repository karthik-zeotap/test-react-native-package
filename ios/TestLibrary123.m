#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(TestLibrary123, NSObject)

RCT_EXTERN_METHOD(multiply:(float)a withB:(float)b
                 withResolver:(RCTPromiseResolveBlock)resolve
                 withRejecter:(RCTPromiseRejectBlock)reject)
RCT_EXTERN_METHOD(setEvent: (NSString *)eventName);
RCT_EXTERN_METHOD(initFunction);

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
