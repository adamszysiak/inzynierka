package pl.projekt.projekt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class WaitMenuActivity extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wait);

        Runnable oczekiwanie = new Runnable()
        {
            @Override
            public void run()
            {
                menuActivity();
            }
        };

        Handler uchwytOczekiwania = new Handler();
        uchwytOczekiwania.postDelayed(oczekiwanie, 1000);
    }

    private void menuActivity()
    {
        Intent menu = new Intent(this, MenuActivity.class);
        startActivity(menu);
        finish();
    }
}
