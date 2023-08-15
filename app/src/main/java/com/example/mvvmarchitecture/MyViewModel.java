package com.example.mvvmarchitecture;


import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
public class MyViewModel extends ViewModel {

   MutableLiveData<String> mutableLiveData = new MutableLiveData<>();


   public void getMovieName()
   {
       mutableLiveData.setValue(getMovie().getMovieName());
   }



    public Movie getMovie()
    {
        return new Movie(1,1000,"The paradise");
    }








}
