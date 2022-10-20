package com.example.parcial;

public class Multi {


    public int Multip(int a, int b)
    {
        if(a==0 || b==0)
        {
            return 0;
        }else{
            return a +Multip(a,b-1);
        }

    }
}
