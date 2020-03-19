package gl51.service

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