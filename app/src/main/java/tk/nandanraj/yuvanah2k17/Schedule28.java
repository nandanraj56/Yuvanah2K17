package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Schedule28 extends MainActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_28);

    }
    public void Fun28b(View view){

        startActivity(new Intent(this,Fun28.class));
    }
    public void Kishme28b(View view){

        startActivity(new Intent(this,Kishme28.class));
    }
    public void Enchanted28b(View view){

        startActivity(new Intent(this,Enchanted28.class));
    }

}
