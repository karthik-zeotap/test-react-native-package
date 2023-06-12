import ZeotapCollect

@objc(TestLibrary123)
class TestLibrary123: NSObject {
    
    @objc(multiply:withB:withResolver:withRejecter:)
    func multiply(a: Float, b: Float, resolve:RCTPromiseResolveBlock,reject:RCTPromiseRejectBlock) -> Void {
        resolve(a*b)
    }

    @objc func setEvent(_ eventName: String) {
      Collect.getInstance()?.setEventProperties(eventName)
    }

    @objc func initFunction() {
        var collectOptions = CollectOption()
        collectOptions = collectOptions.writeKey(value: "da4875bb-a07f-42ae-abd3-19334208334b")
        let collectOption = collectOptions.build()
        Collect.initialize(option: collectOption)
    }
}
