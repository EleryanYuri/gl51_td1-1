package gl51.service

import gl51.data.Picture

/**
 * ceci redimensionne des images
 */
interface PictureResizeService {

    /**
     * redimensionne une image
     * @return
     */
    Picture resizePicture(int width, int height)
}
