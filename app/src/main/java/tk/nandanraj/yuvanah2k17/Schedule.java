package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 15/4/17.
 */

public class Schedule extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);

    }
    public void schedule26b(View view){
        Intent intent1=new Intent(this,Schedule26.class);
        startActivity(intent1);
    }
    public void schedule27b(View view){
        Intent intent2=new Intent(this,Schedule27.class);
        startActivity(intent2);
    }
    public void schedule28b(View view){
        Intent intent3=new Intent(this,Schedule28.class);
        startActivity(intent3);
    }
    public void schedule29b(View view){
        Intent intent4=new Intent(this,Schedule29.class);
        startActivity(intent4);
    }


}
