package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Fun28 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fun28);

    }

    public void Chainb(View view){

        startActivity(new Intent(this,Chain.class));
    }
    public void Matkib(View view){

        startActivity(new Intent(this,Matki.class));
    }
    public void Tugb(View view){

        startActivity(new Intent(this,Tug.class));
    }
    public void Selfib(View view){

        startActivity(new Intent(this,Selfi.class));
    }
    public void Paintb(View view){

        startActivity(new Intent(this,Paint.class));
    }
    public void Roadiesb(View view){

        startActivity(new Intent(this,Roadies.class));
    }
    public void Sitoliab(View view){

        startActivity(new Intent(this,Sitoliya.class));
    }
    public void Haatb(View view){

        startActivity(new Intent(this,Haat.class));
    }

}
