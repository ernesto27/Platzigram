package com.platzi.platzigram.login.interactor;


import android.app.Activity;

import com.google.firebase.auth.FirebaseAuth;

public interface LoginInteractor {

    void SignIn(String username, String password, Activity activity, FirebaseAuth firebaseAuth);
}
