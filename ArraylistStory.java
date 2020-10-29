/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayliststory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author user
 */
public class ArraylistStory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> pets = new ArrayList<String>(){
            {
                add("cat");
                add("dog");
                add("hamster");
                add("goldfish");
                add("turtle");
            }
        };
        //Collections.reverse(pets);
        //pets.add(2,"mouse");
        //pets.remove("cat");
        System.out.println(pets.size());
    }
    
}
