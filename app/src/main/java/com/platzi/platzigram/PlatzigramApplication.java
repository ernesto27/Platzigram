package com.platzi.platzigram;

import android.app.Application;

import com.google.firebase.crash.FirebaseCrash;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class PlatzigramApplication extends Application {

    private FirebaseStorage firebaseStorage;

    @Override
    public void onCreate() {
        super.onCreate();

        FirebaseCrash.log("Init application");

        firebaseStorage = FirebaseStorage.getInstance();
    }

    public StorageReference getStorageReference(){
        return firebaseStorage.getReference();
    }
}
