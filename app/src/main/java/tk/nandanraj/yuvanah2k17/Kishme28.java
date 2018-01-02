package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Kishme28 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kishme28);

    }
    public void Robob(View view){

        startActivity(new Intent(this,Robo.class));
    }
    public void Nfsb(View view){

        startActivity(new Intent(this,Nfs.class));
    }
    public void Gadgetb(View view){

        startActivity(new Intent(this,Gadget.class));
    }
    public void Photob(View view){

        startActivity(new Intent(this,Photo.class));
    }
    public void Madb(View view){

        startActivity(new Intent(this,Mad.class));
    }
    public void Rangolib(View view){

        startActivity(new Intent(this,Rangoli.class));
    }
    public void Tatoob(View view){

        startActivity(new Intent(this,Tatoo.class));
    }
    public void Nailb(View view){

        startActivity(new Intent(this,Nail.class));
    }
    public void Collageb(View view){

        startActivity(new Intent(this,Collage.class));
    }
    public void Junkb(View view){

        startActivity(new Intent(this,Junk.class));
    }
    public void Treasureb(View view){

        startActivity(new Intent(this,Treasure.class));
    }

}
