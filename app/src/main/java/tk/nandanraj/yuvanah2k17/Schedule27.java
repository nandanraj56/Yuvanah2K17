package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Schedule27 extends MainActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_27);

    }
    public void Walk27b(View view){

        startActivity(new Intent(this,Walk27.class));
    }
    public void Debate27b(View view){

        startActivity(new Intent(this,Debate27.class));
    }
    public void Kishme27b(View view){

        startActivity(new Intent(this,Kishme27.class));
    }
    public void Enchanted27b(View view){

        startActivity(new Intent(this,Enchanted27.class));
    }

}
