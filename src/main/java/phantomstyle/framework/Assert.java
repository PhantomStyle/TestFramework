package phantomstyle.framework;

import phantomstyle.framework.messengeres.Messenger;

public class Assert {

    private Messenger messenger;

    public Assert(Messenger messenger) {
        this.messenger = messenger;
    }

    public void assetTrue(boolean condition) {
        if (!condition) {
            messenger.showMessage("Test failed");
        } else {
            messenger.showMessage("Test passed");
        }
    }

    public void assertEquals(long expected, long actual) {
        if (expected != actual) {
            messenger.showMessage("expected: " + expected + "\nfound: " + actual + "\nTest failed");
        } else {
            messenger.showMessage("Test passed");
        }

    }

    public void assertNotNull(Object object) {
        if (object == null) {
            messenger.showMessage("Test failed");
        } else {
            messenger.showMessage("Test passed");
        }
    }

}
