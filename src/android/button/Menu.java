package android.button;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ProgressBar;
 
public class Menu extends Activity implements OnClickListener {
   /** Called when the activity is first created. */
   private Button accept = null;
   private EditText name = null;
   private EditText org = null;
   private ProgressBar mProgress;
   private int mProgressStatus = 0;
   private static final int PROGRESS = 0x1;
   private Handler mHandler = new Handler();


	@Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.main);
      mProgress = (ProgressBar) findViewById(R.id.progress);
      Button accept = (Button)findViewById(R.id.access);
      accept.setOnClickListener(this);
   }

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
			name = (EditText)findViewById(R.id.name);
			org = (EditText)findViewById(R.id.org);
			Intent i = new Intent();
			i.setClass(Menu.this, PlayVideo.class);
			//i.putExtra();
			//mProgress.setVisibility(View.VISIBLE);
			Menu.this.startActivity(i);
	
}
}