package br.usjt.desmob.geodata;

import android.content.Context;

/**
 * Created LuanMorengui RA:816155513
 */

public class Contexto {
    private static Context contexto;

    public static Context getValue(){
        return contexto;
    }

    public static void setValue(Context c){
        contexto = c;
    }
}
