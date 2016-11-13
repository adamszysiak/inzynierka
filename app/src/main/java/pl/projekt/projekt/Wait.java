package pl.projekt.projekt;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;

public class Wait
{
    private Context mKontekst;
    private Class<?> mAktywnosc;

    public Wait(Context kontekst)
    {
        this.mKontekst = kontekst;

        ((Activity) mKontekst).setContentView(R.layout.activity_wait);
    }

    public void waitForActivity(Class<?> aktywnosc)
    {
        mAktywnosc = aktywnosc;

        Runnable oczekiwanie = new Runnable()
        {
            @Override
            public void run()
            {
                startActivity(mAktywnosc);
            }
        };

        Handler uchwytOczekiwania = new Handler();
        uchwytOczekiwania.postDelayed(oczekiwanie, 2000);
    }

    private void startActivity(Class<?> aktywnosc)
    {
        Intent zamiar = new Intent(mKontekst, aktywnosc);
        mKontekst.startActivity(zamiar);
        ((Activity) mKontekst).finish();
    }
}
