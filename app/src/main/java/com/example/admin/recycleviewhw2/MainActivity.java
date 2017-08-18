package com.example.admin.recycleviewhw2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView) findViewById(R.id.rv);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(new MyAdapter(this,getData()));
    }

    public ArrayList getData()
    {
        ArrayList<Spacecraft> spacecraft = new ArrayList<>();
        Spacecraft e= new Spacecraft();
        e.setName("Yorhm The Giant");
        e.setPropellent("Profained Capital");
        e.setImage(R.drawable.icon1);
        spacecraft.add(e);

        Spacecraft a= new Spacecraft();
        a.setName("Abyss Watchers");
        a.setPropellent("Farron's Keep");
        a.setImage(R.drawable.icon2);
        spacecraft.add(a);

        Spacecraft b= new Spacecraft();
        b.setName("Dancer of the Boreal Valley");
        b.setPropellent("Lothric Castle");
        b.setImage(R.drawable.icon3);
        spacecraft.add(b);

        Spacecraft c= new Spacecraft();
        c.setName("DragonSlayer Armour");
        c.setPropellent("Lothric Castle");
        c.setImage(R.drawable.icon4);
        spacecraft.add(c);

        Spacecraft d= new Spacecraft();

        d.setName("Nameless King");
        d.setPropellent("Archdragon Peak");
        d.setImage(R.drawable.icon5);
        spacecraft.add(d);

        Spacecraft f= new Spacecraft();

        f.setName("Champion Gundyr");
        f.setPropellent("Untended Graves");
        f.setImage(R.drawable.icon6);
        spacecraft.add(f);

        Spacecraft g= new Spacecraft();

        g.setName("Twin Princes");
        g.setPropellent("Lothric Castle");
        g.setImage(R.drawable.icon7);
        spacecraft.add(g);





        return spacecraft;







    }
}
