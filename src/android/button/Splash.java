
package android.button;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
 
public class Splash extends Activity {
   /** Called when the activity is first created. */
   @Override
   public void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.splash);
      Thread splashThread = new Thread() {
         @Override
         public void run() {
            try {
               int waited = 0;
               while (waited < 5000) {
                  sleep(100);
                  waited += 100;
               }
            } catch (InterruptedException e) {
               // do nothing
            } finally {
               finish();
              
            Intent i = new Intent();
   			i.setClass(Splash.this, Menu.class);
   			Splash.this.startActivity(i);

               
            }
         }
      };
      splashThread.start();
   }
}
