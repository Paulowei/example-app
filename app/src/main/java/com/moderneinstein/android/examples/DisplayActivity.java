 package com.moderneinstein.android.examples  ; 

import  java.util.Arrays ; 
import java.util.Objects ;
import java.util.Vector ; 
import java.util.ArrayList ; 
import java.util.List ; 

import android.widget.Toast ;
import android.os.Environment ; 
import android.os.Bundle ; 
import android.widget.TextView ;
import android.view.ViewPropertyAnimator ; 

import android.widget.ScrollView ; 
import android.widget.ImageView  ; 
import android.app.Activity ; 
import android.view.ViewGroup ;
import android.graphics.drawable.Drawable  ; 
import android.view.View  ; 
import android.content.Context ; 

import android.app.Activity ; 
import android.content.Intent ; 
import android.content.res.Resources ; 
import android.util.AttributeSet ; 
import android.R.layout ; 

import com.moderneinstein.android.examples.CentralActivity ; 


public class DisplayActivity extends Activity{
     
    public static int layoutId = R.layout.display ; 
    public static String[] options =  {"ImageLink4","TextLink4"} ;
    public int[] identity = {R.id.display_1,R.id.display_1_1,R.id.display_1_1_1,
        R.id.display_1_1_1_1_1,R.id.display_1_1_2,R.id.display_1_1_2_1
        ,R.id.display_1_1_2_1_1,R.id.display_1_1_3,R.id.display_1_1_3_1,
        R.id.display_1_1_4,R.id.display_1_1_4_1,R.id.display_1_1_4_1_1}  ;
    public List<View> elements ;  
    private Context realms ;     
    // ,new String("Void")  ;  // int imagedigit =
    public  void  recover( ) {  // displayImage(){
        Intent previous = this.getIntent() ;
        int imageDigit = previous.getIntExtra(options[0],4) ; 
       // CharSequence sequence = previous.getCharSequenceExtra(options[1]) ;  
       String sequence = previous.getStringExtra(options[1]) ;
        ((TextView)elements.get(8)).setText(sequence.toString()) ;    
        Drawable drawn =  this.getResources().getDrawable((int)imageDigit) ;
        ((ImageView)elements.get(6)).setForeground(drawn) ; //setBackgroundDrawable( drawn) ;  
    }

    public void linkViews(){
         for(int vt=0;vt<identity.length;vt++){
            int current = identity[vt]; 
             View created = requireViewById(current) ; 
            elements.add(created)  ;
         }
    }
    public void listeners(){
        elements.get(3).setOnClickListener(
            new View.OnClickListener( ){
                @Override 
                public void onClick(View states){
                    Intent ability = new Intent() ; 
                    ability.setClass(realms,CentralActivity.class)  ; 
                    ability.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP) ; 
                    startActivity(ability) ;  
                }
            }
        ) ;   
        elements.get(11).setOnClickListener(
            new View.OnClickListener (){
                @Override 
                public void  onClick (View align){
                     ViewPropertyAnimator animates = elements.get(6).animate() ; 
                     animates.rotationY(360) ; 
                     animates.setDuration(500) ; 
                  //  animates.translationX(20) ;  
                   // animates.setTranslationX(-10) ;
                    animates.start() ; 
                }
            }
        ) ;
    }
    @Override 
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState) ; 
        setContentView(layoutId) ; 
        elements = new  ArrayList<View>() ;  
        realms = this.getApplicationContext() ; 
        linkViews() ;
        listeners() ;
         // displayImage() ; 
        recover() ; 
    }

}