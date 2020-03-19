package gl51.service.impl

import gl51.data.Picture
import gl51.service.PictureService
import gl51.service.PictureResizeService

import javax.inject.Inject

class PictureResizeServiceImpl implements PictureResizeService {

    @Inject PictureService pictureService

    @Override
    Picture resizePicture(int width, int height)() {
        Picture picture = pictureService.fetchPicture()
        picture.setWidth(width)
        picture.setHeight(height)
        return picture
    }
}