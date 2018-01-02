package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Schedule29 extends MainActivity  {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_29);

    }
    public void Prize29b(View view){

        startActivity(new Intent(this,Prize29.class));
    }
    public void Enchanted29b(View view){

        startActivity(new Intent(this,Enchanted29.class));
    }

}
