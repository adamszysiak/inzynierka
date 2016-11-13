package pl.projekt.projekt;

import android.app.Activity;
import android.os.Bundle;

public class WaitMenuActivity extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        Wait czekaj = new Wait(this);
        czekaj.waitForActivity(MenuActivity.class);
    }
}
