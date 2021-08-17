package com.gzeinnumer.enkripsiaesandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

//https://stackoverflow.com/questions/48089197/aes-encryption-in-android-and-decryption-in-php-and-vice-versa
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            AESCrypter aesCrypter = new AESCrypter("gzeinnumer");
            String en = aesCrypter.encrypt("pass");
            Log.d(getClass().getSimpleName(), "onCreate_: "+en); //base64
            String de = aesCrypter.decrypt(en);
            Log.d(getClass().getSimpleName(), "onCreate_: "+de); //base64
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}