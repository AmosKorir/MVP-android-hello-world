package music.musica.com.mvphelloworld.models;

import music.musica.com.mvphelloworld.ccontracts.MainActicivutyContract;

public class MainActivittyModel implements MainActicivutyContract.Model {

    private int counter=0;

    @Override
    public String getData() {
        String msg="this a test on mvp";
        if(counter==0){
            counter++;
        }else{
            msg+=counter++;
        }

        return msg;

    }
}
