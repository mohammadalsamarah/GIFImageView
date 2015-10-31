package com.twasel;

/**
 * Created by MOHAMMAD ALSAMARAH on 10/22/2015.
 */

import java.io.IOException;
import java.io.InputStream;
        import android.content.Context;
        import android.content.res.TypedArray;
        import android.graphics.Canvas;
        import android.graphics.Color;
        import android.graphics.Movie;
        import android.net.Uri;
        import android.util.AttributeSet;
        import android.view.View;
import android.webkit.WebView;

public class GIFImageView extends WebView {

    public static final String HTML_FORMAT = "<html>" +
            "<body style=\"text-align: center;  vertical-align:                       right;background-color: transparent;\">" +
            "<img src = \"%s\" /></body>" +
            "</html>";

        public GIFImageView(Context context, String fileUrl) throws IOException {
        super(context);
        final String html = String.format(HTML_FORMAT, fileUrl);
        setBackgroundColor(Color.TRANSPARENT);
        loadDataWithBaseURL("", html, "text/html", "UTF-8", "");

    }
}
