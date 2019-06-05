package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsClass {
    /* Streams are used for the aggreagte functionality on the collection and arrays
    * Its get the stream and process it and does not store while processing it
    *
    * Some of the method of the Stream in the collection interface
    *
    * stream()  = Returns the sequential stream considering the collection
    *               as source
    *
    * parallelStream() = Returns as parallel stream considering the collection
    *               as source
    * */

    List<String> stringList = Arrays.asList("ashish","das","yash","rahul");

    /*froEach() = To iterate the elements of stream */

    public void forEach(){
        stringList.forEach(System.out::println);
    }

    /* map() = The ‘map’ method is used to map each element to
               its corresponding result.
    */

    public void map(){
        stringList = stringList.stream().map(String::toUpperCase).collect(Collectors.toList());
        forEach();
        System.out.println("\nParalle Stream\n");
        stringList = stringList.parallelStream().map(String::toUpperCase).collect(Collectors.toList());
        forEach();
    }

    public void filter(){
        stringList = stringList.stream().filter(s -> s.length()>3).collect(Collectors.toList());
        forEach();
    }

    public void sort(){
        Collections.sort(stringList,(s1,s2)->s1.compareTo(s2));
        forEach();
    }

}
