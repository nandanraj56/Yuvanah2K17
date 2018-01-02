package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Kishme27  extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kishme27);

    }
    public void Counterb(View view){

        startActivity(new Intent(this,Counter.class));
    }
    public void Codeb(View view){

        startActivity(new Intent(this,Code.class));
    }
    public void Businessb(View view){

        startActivity(new Intent(this,Business.class));
    }
    public void Faceb(View view){

        startActivity(new Intent(this,Face.class));
    }
    public void Saladb(View view){

        startActivity(new Intent(this,Salad.class));
    }
    public void Reverseb(View view){

        startActivity(new Intent(this,Reverse.class));
    }

}
