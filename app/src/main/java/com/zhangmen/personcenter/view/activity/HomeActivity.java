package com.zhangmen.personcenter.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.zhangmen.personcenter.R;
import com.zhangmen.personcenter.utils.CommonUtils;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    @BindView(R.id.iv_head)
    ImageView ivHead;

    @BindView(R.id.head_tv_photograph)
    TextView headTvPhotograph;
    @BindView(R.id.head_tv_album)
    TextView headTvAlbum;
    @BindView(R.id.head_tv_cancel)
    TextView headTvCancel;
    @BindView(R.id.ll_content)
    LinearLayout llContent;
    private ViewGroup.LayoutParams lp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        int childCount = llContent.getChildCount();
        for (int i=0;i<childCount;i++){
            CommonUtils.setWidAndHei(this, llContent.getChildAt(i), 34, 39);
        }


    }


  @OnClick({R.id.head_tv_photograph, R.id.head_tv_album, R.id.head_tv_cancel})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.head_tv_photograph:
                Log.d(TAG, "head_tv_photograph");

                takePhone();
                break;
            case R.id.head_tv_album:
                Log.d(TAG, "head_tv_album");
                break;
            case R.id.head_tv_cancel:
                finish();
                break;
        }
    }

    private void takePhone() {
//        File dir = new File(SDcardUtil.getUserHeaderDir());
//        if (!dir.exists())
//            dir.mkdirs();
//        File f = new File(dir, "photo.png");
        Intent intent = new Intent(
                MediaStore.ACTION_IMAGE_CAPTURE);
//        Uri u = Uri.fromFile(f);
//        intent.putExtra(MediaStore.EXTRA_OUTPUT, u);
        startActivity(intent);
    }
}
