package tk.nandanraj.yuvanah2k17;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.ImageView;


/**
 * Created by Nandan Raj on 19/04/2017.
 */

public class GalleryView extends MainActivity {

    Integer[] list_of_images = {
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,

            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.h,
            R.drawable.i,
    };

    ImageView selectedImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_gallery);

        Gallery gallery = (Gallery)findViewById(R.id.gallery_gallery);

        selectedImage = (ImageView)findViewById(R.id.gallery_imageview);

        gallery.setSpacing(1);
        final GalleryImageAdapter galleryImageAdapter= new GalleryImageAdapter(this);
        gallery.setAdapter(galleryImageAdapter);


        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                // show the selected Image
                selectedImage.setImageResource(galleryImageAdapter.mImageIds[position]);
            }
        });

    }
}


