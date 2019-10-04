package com.example.mymedicalrecord;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {
    ImageView imgPhoto;
    TextView tvNama, tvDetails;

    public static final String EXTRA_FOTO ="foto";
    public static final String EXTRA_NAMA ="Nama";
    public static final String EXTRA_DETAILS ="Details";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imgPhoto  = findViewById(R.id.img_item_photo);
        tvNama    = findViewById(R.id.tv_item_nama);
        tvDetails = findViewById(R.id.tv_item_details);

        int photo    = getIntent().getIntExtra(EXTRA_FOTO,0);
        String nama    = getIntent().getStringExtra(EXTRA_NAMA);
        String details   = getIntent().getStringExtra(EXTRA_DETAILS);


        //Picasso.get()
        //        .load(cover)
        //        .resize(50, 50)
        //        .centerCrop()
        //        .into(imgCover);

        //Glide.with(this)
        //        .load(Integer.parseInt(photo))
        //        .apply(new RequestOptions().override(55, 55))
        //        .into(imgPhoto);

        //Glide.with(this)
        //        .load(getDrawable(photo))
        //        .apply(new RequestOptions().override(55, 55))
        //        .into(imgPhoto);
        //imgPhoto.setImageResource(photo);
        Glide.with(this)
                .load(photo)
                .apply(new RequestOptions().override(55, 55))
                .into(imgPhoto);
        tvNama.setText(nama);
        tvDetails.setText(details);
    }

    public int getImage(String imageName) {

        int drawableResourceId = this.getResources().getIdentifier(imageName, "drawable", this.getPackageName());

        return drawableResourceId;
    }
}
