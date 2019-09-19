package demo.barberbooking.d.z;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import demo.barberbooking.d.z.Common.Common;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_login)
    Button btn_login;
    @BindView(R.id.txt_skip)
    TextView txt_skip;

    @OnClick(R.id.btn_login)
    void loginUser() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(Common.IS_LOGIN, true);
        startActivity(intent);
    }

    @OnClick(R.id.txt_skip)
    void skipLoginJustGoHome() {
        Intent intent = new Intent(this, HomeActivity.class);
        intent.putExtra(Common.IS_LOGIN, false);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);
    }
}