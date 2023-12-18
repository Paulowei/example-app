package com.moderneinstein.android.examples;

import java.util.Objects ; 
import java.util.Vector ; 
import java.util.ArrayList ;

import java.util.Arrays ; 
 import java.util.List ; 
import java.util.HashMap ; 
import java .util.Map ; 


import android.app.Activity;
import android.os.Bundle;
import android.R.layout ; 
import android.widget.ScrollView ;

import android.R.id ; 
import android.content.res.Resources ; 
import android.view.View ; 
import android.graphics.drawable.Drawable ; 

import android.view.ViewGroup ; 
import android.widget.Button ; 
import android.widget.LinearLayout  ; 
import android.widget.Toast ; 

import android.content.Context ;  
import android.content.Intent ; 
import android.widget.ImageView  ; 
import android.view.ViewPropertyAnimator ; 
import android.widget.TextView ; 

import com.moderneinstein.android.examples.DisplayActivity  ; 


public class  CentralActivity extends Activity
{
    /** Called when the activity is first created. */  
    // public  List<View>  icons ; 
    public static int  layoutId = R.layout.main ; 
    public static  int[] icons = {R.id.main_1,R.id.main_1_1,R.id.main_1_1,R.id.main_1_1_1,
    R.id.main_1_1_1_1,R.id.main_1_1_1_1_1,R.id.main_1_1_2,R.id.main_1_1_2_1
    ,R.id.main_1_1_2_1_1,R.id.main_1_1_2_1_1,R.id.main_1_1_2_1_2,
    R.id.main_1_1_2_2_1,R.id.main_1_1_2_2_2,R.id.main_1_1_3,R.id.main_1_1_3_1,R.id.main_1_1_3_1_1
,R.id.main_1_1_1_2,R.id.main_1_1_1_2_1} ;
    public static int[] special = {R.id.main_1_1_2_1_1,R.id.main_1_1_2_1_2
        ,R.id.main_1_1_2_2_1,R.id.main_1_1_2_2_2 } ; 
    public static int[]  images = { R.drawable.border_collie,R.drawable.miniature_schnauzer,
    R.drawable.australian_cattle_dog,R.drawable.alaskan_malamute} ;   
    public  List<View>  elements  ; 
    public List<View>  buttons ;
    public String[] sentences = {
        "Border Collie is developed for herding livestock of sheep at boarders. These are acrobatic, energetic, athletic, and smart. These are well known as a Scottish sheepdog. Death occurs due to cancer, old age, and cerebral vascular afflictions. On average, the life span is of 13-16 years. Size of the male in height 48-56cm and weighs about 13.6-20.4kg. In terms of female height is 46-53cm, and weight is 12.2-19 kg."
        , "This type of dog belongs to a small dog and got originated from Germany. Another name is Zwergschnauzer. Its weight is about 11-18 for males and 10-15 for females. Miniature Schnauzer height is 14 inches for a male and 13 inches for a female. Its coat is harsh and wiry when and stripped. It exists in black, silver, white, etc. Litter size is 3-8 pups. The life span is of 12-14 years."
    ,"As the name suggests, it got originated in Australia. It has multiple names like blue heeler, red heeler, cattle dog, and Queensland heeler. It weighs about 15-22 kg for both males and females. Height varies from 46-51cm for males and 43-48cm for females. It has a short and double coat. And It can be seen in blue and red varieties of colors. It is known as a “wash and wear” dog, and also groomed and trained. The life span is of 11.7 years."
    ,"It got originated from the United States Alaska. It is a large breed of domestic dog. Its haul is very freight because of this strength and endurance. The weight of the male is 55 kg, and the female is 38 kg. The height of the female is 61cm and male 70cm. Its coat is thicker and double coat with plush undercoat. It is generally seen in grey, sable, black, or red and white. The size of a litter is 4-10 puppies. The life span of this breed dog is up to 16 years.",
    "This type of dog belongs to a small dog and got originated from Germany. Another name is Zwergschnauzer. Its weight is about 11-18 for males and 10-15 for females. Miniature Schnauzer height is 14 inches for a male and 13 inches for a female. Its coat is harsh and wiry when and stripped. It exists in black, silver, white, etc. Litter size is 3-8 pups. The life span is of 12-14 years.",
    "This dog originates in the united kingdom, England, Great Britain. It is primarily bred to recognize scents proving to be a perfect hunting dog and enjoy the company of others. Lemon & White, White & tan, tricolor, chocolate & white, red & white are some colors in which you can find this dog. A beagle at the height of 13 inches and under weighs 20 pounds, and the dogs at 13-15 inches height weigh around 20-30 pounds. Beagle is a friendly, merry, and curious dog with a life expectancy of 10- 15 years.This dog originates in the united kingdom, England, Great Britain. It is primarily bred to recognize scents proving to be a perfect hunting dog and enjoy the company of others. Lemon & White, White & tan, tricolor, chocolate & white, red & white are some colors in which you can find this dog. A beagle at the height of 13 inches and under weighs 20 pounds, and the dogs at 13-15 inches height weigh around 20-30 pounds. Beagle is a friendly, merry, and curious dog with a life expectancy of 10- 15 years."} ;  
    private Context context ; 
    public int drawnSource ;    
    public static DataItem[] items  ; 
   // public static long[] items ; 
    public static String[] shorts =  {"border_collie","miniature schnauzer",
    "australian cattle dog","alaskan malamute"} ; 
     private Map<Integer,Integer> frames ; 
    //  long duration,
    public Toast createText(String  text, int duration,boolean show){
        Toast toasty = new Toast(this) ; 
        toasty.setText(text ) ;
        toasty.setDuration((int)duration) ;
        if(show==true){
        toasty.show( ) ;}  
        return toasty   ;  
    }
    /* int digit = images[vr] ; String words = sentences[vr] ; 
            String recent = shorts[vr] ;   */
    public  void listeners (){
        for(int vr=0 ;vr<buttons.size( );vr++){
            View current = buttons.get(vr) ;  
           DataItem holder = items[vr] ;
            int point =  vr ; 
            current.setOnClickListener(
                new View.OnClickListener(){
                @Override 
                public void onClick( View stated){
                    Drawable drawn =   context.getResources().getDrawable(holder.getImageIcon()) ; 
                    ((ImageView)elements.get(5)).setForeground(drawn) ; //setBackgroundDrawable(drawn) ;  
                    Toast  toasts =  createText(holder.getTitle(),750,false) ;//(recent,750,false) ;  
                    toasts.show() ;   
                    drawnSource =  point ; // stated.getId() ; // digit ;   
                    ((TextView)elements.get(17)).setText(holder.getTitle()) ;
                 }  }  ) ; 
        }  
        /* intent.putExtra("TextLink4",sentences[digit])  ;
                        intent.putExtra("ImageLink4",images[digit]) ;  */ 
             //       createText("The button was clicked",700,true) ;
        elements.get(5).setOnClickListener(
            new View.OnClickListener(){
                @Override
                 public void onClick(View states){
                        Intent intent = new Intent(context,DisplayActivity.class); 
                         intent.setClass(context,DisplayActivity.class) ; 
                        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK) ;  
                         int  digit =  drawnSource;   // frames.get(drawnSource) ;    
                        intent.putExtra("TextLink4",items[digit].getDescription())  ;
                        intent.putExtra("ImageLink4",items[digit].getImageIcon()) ;   
                        startActivity(intent) ;
                 }
            }
        ) ;   
        elements.get(15).setOnClickListener(
            new View.OnClickListener(){
                @Override 
                public void onClick(View align){
                    rotateImage() ; 
                }   
            }
        ) ;
    }     
      //      createText(Integer.toString(drawnSource),650,true) ; 
                   //     createText(Integer.toString(digit), 650,false).show () ; 
    //      int data = states.getId() ;   // ((Drawable)states.getBackground()).getId()  ;     
    // putCharSequenceExtra // intent.putFloatExtra
    public   void bindViews( ){
        for(int ve=0;ve<icons.length;ve++){
            View primes = requireViewById(icons[ve]) ; 
            elements.add(primes); 
        }
        for( int br=0;br<special.length;br++){
            View known = findViewById(special[br]) ;  
            buttons.add (known) ;     
            frames.put(known.getId(),br); 
        }
        for(int vr=items.length-1;vr>=0;vr--){
            DataItem object = items[vr]  ;
            ((TextView)buttons.get(vr)).setText(object.getTitle()) ;
        } 
    }   
     //  ((TextView)known).setText(shorts[br]) ;
    /*     for(int vr=images.length-1;vr>=0;vr--){
            int number = images[vr] ; 
           // frames.put (number,vr) ;  
           frames.put(buttons.get(vr).getId(),vr) ; 
        }  */
    public void rotateImage(){
        ViewPropertyAnimator animator =  elements.get(5).animate() ; 
        animator.rotationX(360) ;
        animator.setDuration(500)  ;  
        animator.rotationY(180) ; 
        animator.start() ;
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(layoutId)  ;    
        frames = new HashMap<Integer,Integer>() ; 
       // drawnSource = //images[0] ; 
        elements= new ArrayList<View> () ;  
         buttons = new Vector<View>( );   
         context = this.getApplicationContext() ;  
         items=  DataItem.items ; 
           drawnSource = 0 ; //  buttons.get(0).getId() ;    
       //  elements = new Vector<View>() ; 
        bindViews( ) ;  
        listeners( ) ;  
    } 
}
