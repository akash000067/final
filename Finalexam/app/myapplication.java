import android.app.Application;
import com.google.firebase.auth.FirebaseAuth;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        // Initialize Firebase Authentication
        FirebaseAuth.getInstance();
    }
}
