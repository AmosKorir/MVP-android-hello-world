package music.musica.com.mvphelloworld.presenters;

import android.view.View;

import music.musica.com.mvphelloworld.ccontracts.MainActicivutyContract;
import music.musica.com.mvphelloworld.models.MainActivittyModel;

public class MainActivityPrensenter implements MainActicivutyContract.Presenter {
    private MainActicivutyContract.View mView;
    private MainActicivutyContract.Model model;

    public MainActivityPrensenter(MainActicivutyContract.View v){
        mView=v;
        initPresenter();
    }

    private void initPresenter() {
        model=new MainActivittyModel();
        mView.initView();
    }


    @Override
    public void omClick(View view) {
        String data=model.getData();
        mView.setViewData(data);

    }
}
