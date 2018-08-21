package music.musica.com.mvphelloworld.ccontracts;

public interface MainActicivutyContract {

    interface View{
        void initView();
        void setViewData(String data);
    }

    interface Model{
       String  getData();
    }


    interface Presenter{
        void omClick(android.view.View view);
    }
}
