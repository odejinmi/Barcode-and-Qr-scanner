package example.zxing;

import com.a5starcompany.barcodescanner.CaptureActivity;
import com.a5starcompany.barcodescanner.DecoratedBarcodeView;

/**
 * This activity has a margin.
 */
public class SmallCaptureActivity extends CaptureActivity {
    @Override
    protected DecoratedBarcodeView initializeContent() {
        setContentView(R.layout.capture_small);
        return (DecoratedBarcodeView)findViewById(R.id.zxing_barcode_scanner);
    }
}
