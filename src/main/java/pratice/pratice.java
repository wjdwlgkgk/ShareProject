package pratice;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class pratice {

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        suNvisit su[] = new suNvisit[N];

        for(int i = 0 ; i < N; i++) {
            if(N > 10000)
                return;
            su[i].su = scan.nextInt();
        }

        // 정렬 하고, 같은게 있으면 빼.
        sort(su);


        ArrayList<String> anw = new ArrayList<String>();

        for(int i = 0 ; i < su.length; i++) {

        }



    }


    public static suNvisit[] sort(suNvisit[] su){
        for(int i = 0 ; i < su.length; i++)
        {
            int temp = 0;
            for(int j = 0 ; j < su.length; j++)
            {
                if(su[i].su <= su[j].su)
                {
                    temp = su[i].su;
                    su[i].su = su[j].su;
                    su[j].su = temp;
                }
            }
        }
        return su;
    }

    public static void solve(suNvisit[] su, String[] strs){




    }



}

class suNvisit
{
    public int su;
    public boolean visited;
}