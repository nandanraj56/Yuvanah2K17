package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public boolean onOptionsItemSelected(MenuItem item){

        switch (item.getItemId()){
            case R.id.updatem:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://goo.gl/pOIzan")));
                return true;


            case R.id.aboutm:
                Intent abouti=new Intent(this,About.class);
                startActivity(abouti);
                return true;
            case R.id.contactm:
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:nandanraj56@gamil.com")));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void Gallerya(View view){
        Intent galleryi=new Intent(this,GalleryView.class);
        startActivity(galleryi);
    }


    public void Coordinatora(View view){
        Intent coordinatori=new Intent(this,Coordinator.class);
        startActivity(coordinatori);
    }
    public void EventLista(View view){
        Intent eventlisti=new Intent(this,EventList.class);
        startActivity(eventlisti);
    }
    public void Overviewa(View view){
        Intent overviewi=new Intent(this,Overview.class);
        startActivity(overviewi);
    }
    public void Schedulea(View view){
        Intent schedulei=new Intent(this,Schedule.class);
        startActivity(schedulei);
    }


    ;





}
