package music.musica.com.mvphelloworld.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import music.musica.com.mvphelloworld.R;
import music.musica.com.mvphelloworld.ccontracts.MainActicivutyContract;
import music.musica.com.mvphelloworld.presenters.MainActivityPrensenter;

public class MainActivity extends AppCompatActivity implements MainActicivutyContract.View {
    private TextView textView;
    private Button clickMe;
    private MainActicivutyContract.Presenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mPresenter=new MainActivityPrensenter(this);

    }

    @Override
    public void initView() {
        textView=findViewById(R.id.text);
        clickMe=findViewById(R.id.button);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                mPresenter.omClick(v);
            }
        });
    }

    @Override
    public void setViewData(String data) {
        textView.setText(data);
    }
}
