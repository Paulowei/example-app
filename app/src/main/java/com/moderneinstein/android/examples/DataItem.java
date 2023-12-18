package com.moderneinstein.android.examples ; 

import android.content.Intent ; 
import android.os.Bundle ; 

import java.util.Set ;
import java.util.List ; 

import android.R.drawable ; 
import android.R.id ; 
import android.R.layout ; 
import android.R.string ; 

public class DataItem{

    private  String title  ; 
    private String description ; 
    private int imageIcon ; 

    public static DataItem[] items = new DataItem[]
    {new DataItem("border_collie","Border Collie is developed for herding livestock of sheep at boarders. These are acrobatic, energetic, athletic, and smart. These are well known as a Scottish sheepdog. Death occurs due to cancer, old age, and cerebral vascular afflictions. On average, the life span is of 13-16 years. Size of the male in height 48-56cm and weighs about 13.6-20.4kg. In terms of female height is 46-53cm, and weight is 12.2-19 kg.",R.drawable.border_collie)
     ,new DataItem("miniature schnauzer","This type of dog belongs to a small dog and got originated from Germany. Another name is Zwergschnauzer. Its weight is about 11-18 for males and 10-15 for females. Miniature Schnauzer height is 14 inches for a male and 13 inches for a female. Its coat is harsh and wiry when and stripped. It exists in black, silver, white, etc. Litter size is 3-8 pups. The life span is of 12-14 years.",R.drawable.miniature_schnauzer) 
    ,new DataItem( "australian cattle dog","As the name suggests, it got originated in Australia. It has multiple names like blue heeler, red heeler, cattle dog, and Queensland heeler. It weighs about 15-22 kg for both males and females. Height varies from 46-51cm for males and 43-48cm for females. It has a short and double coat. And It can be seen in blue and red varieties of colors. It is known as a “wash and wear” dog, and also groomed and trained. The life span is of 11.7 years.", R.drawable.australian_cattle_dog)
    ,new DataItem("alaskan malamute","It got originated from the United States Alaska. It is a large breed of domestic dog. Its haul is very freight because of this strength and endurance. The weight of the male is 55 kg, and the female is 38 kg. The height of the female is 61cm and male 70cm. Its coat is thicker and double coat with plush undercoat. It is generally seen in grey, sable, black, or red and white. The size of a litter is 4-10 puppies. The life span of this breed dog is up to 16 years.",R.drawable.alaskan_malamute)} ;
    public DataItem(String param1,String param2,int param3){
        this.title = param1  ; 
        this.description = param2 ; 
        this.imageIcon = param3   ; 
    }
    public String getTitle(){
        return this.title ; 
    }
    public String getDescription(){
        return this.description ; 
    } 
    public int getImageIcon(){
        return this.imageIcon ; 
    }  
    public void setTitle(String param1){
        this.title = new String(param1) ; 
    }
    public void setDescription(String param2){
        this.description = new String(param2) ; 
    } 
    public void setImageIcon(int digit){
        this.imageIcon = digit ; 
    }


}