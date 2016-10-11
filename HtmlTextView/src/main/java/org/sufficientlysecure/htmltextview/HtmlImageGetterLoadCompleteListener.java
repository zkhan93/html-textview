package org.sufficientlysecure.htmltextview;

/**
 * implement this to receive callback when the image is fetched and drawn to the canvas
 * Created by Zeeshan Khan on 10/12/2016.
 */

public interface HtmlImageGetterLoadCompleteListener {
    void imageGetterLoadComplete(boolean wasSuccessful);
}
