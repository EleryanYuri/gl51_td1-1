package gl51.service

import gl51.data.Picture
import gl51.data.Cloud

/**
 * ceci upload une image
 */
interface PictureUploadService {

    /**
     * upload une image
     * @return
     */
    boolean uploadPicture(Picture picture, Cloud cloud)
}
