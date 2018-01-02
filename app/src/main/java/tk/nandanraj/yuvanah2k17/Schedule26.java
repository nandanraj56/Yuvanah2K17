package tk.nandanraj.yuvanah2k17;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by nandanraj on 19/4/17.
 */

public class Schedule26 extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schedule_26);

    }
    public void Badminton26b(View view){

        startActivity(new Intent(this,Badminton.class));
    }
    public void Carrom26b(View view){

        startActivity(new Intent(this,Carrom.class));
    }
    public void Mini26b(View view){

        startActivity(new Intent(this,Mini_football.class));
    }
    public void Volley26b(View view){

        startActivity(new Intent(this,Volley_ball.class));
    }
    public void Gully26b(View view){

        startActivity(new Intent(this,Gully_Cricket.class));
    }
    public void Chess26b(View view){

        startActivity(new Intent(this,Chess.class));
    }

}
