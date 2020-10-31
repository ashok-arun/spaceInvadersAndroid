package info.ArunAshok.asteroids;

import android.graphics.Color;

import java.util.Random;

public class Placement {
    Random rand = new Random();
    float cx = (float) Math.random() * 1000;
    float cy = (float) Math.random() * 1000;
    float minX = 15.0f;
    float maxX = 70.0f;
    float r = rand.nextFloat() * (maxX - minX) + minX;
    int scoreMply = Math.round(maxX / r);

    // Random nice colors
    int rc = rand.nextInt() / 2 + 1;
    int g = rand.nextInt() / 2 + 1;
    int b = rand.nextInt() / 2 + 1;
    int color = Color.rgb(rc, g, b);

}