package sdk.chat.core.handlers;

import android.graphics.Bitmap;

import io.reactivex.Completable;
import io.reactivex.Observable;
import sdk.chat.core.storage.UploadStatus;
import sdk.chat.core.types.FileUploadResult;

/**
 * Created by SimonSmiley-Andrews on 01/05/2017.
 */

public interface UploadHandler {

    Observable<FileUploadResult> uploadFile(byte[] data, String name, String mimeType);
    Observable<FileUploadResult> uploadImage(final Bitmap image);

    UploadStatus uploadStatus(String identifier);
    Observable<FileUploadResult> uploadFile(final byte[] data, final String name, final String mimeType, String identifier);

    Completable deleteFile(String remotePath);
}
